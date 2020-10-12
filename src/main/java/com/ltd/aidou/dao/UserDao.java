package com.ltd.aidou.dao;

import com.ltd.aidou.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    // 查询所有结果集
    List<User> findAll();

    // 根据 id 查询
    List<User> userId(int id);

    // delete
    int deleteUser(int id);

    // update
    int updateUser(User user);

    // like 查询
    List<User> likeFind(String username);

    // 注解的方式执行查询 只需要对主配值文件的 mapper 文件修改属性为 class + dao 的全限定名
    @Select("select * from mall_info where userid=#{userid}")
    List<User> findOne(int id);

    @Insert("insert into mall_info values(#{userid},#{username},#{userpassword})")
    int insertUser(User user);

}
