/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : mall

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 12/10/2020 13:40:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mall_info
-- ----------------------------
DROP TABLE IF EXISTS `mall_info`;
CREATE TABLE `mall_info`  (
  `userid` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userpassword` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 193164 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of mall_info
-- ----------------------------
INSERT INTO `mall_info` VALUES (1001, 'user1203', 'user1203');
INSERT INTO `mall_info` VALUES (1002, 'user1002', 'user1002');
INSERT INTO `mall_info` VALUES (1003, 'user1003', 'user1003');
INSERT INTO `mall_info` VALUES (1004, 'user1004', 'user1004');
INSERT INTO `mall_info` VALUES (1005, 'user1005', 'user1005');
INSERT INTO `mall_info` VALUES (12421, 'user12421', 'user12421');
INSERT INTO `mall_info` VALUES (19001, 'user1006', 'user1006');
INSERT INTO `mall_info` VALUES (19991, 'user1991', 'user1991');
INSERT INTO `mall_info` VALUES (100000, 'aidou', 'user193161');
INSERT INTO `mall_info` VALUES (193162, 'user193162', 'user193162');
INSERT INTO `mall_info` VALUES (193163, 'user000000', 'user000000');

SET FOREIGN_KEY_CHECKS = 1;
