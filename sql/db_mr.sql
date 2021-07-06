/*
Navicat MySQL Data Transfer

Source Server         : db_mr
Source Server Version : 80018
Source Host           : 47.108.3.9:3306
Source Database       : db_mr

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-07-02 19:03:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for internship
-- ----------------------------
DROP TABLE IF EXISTS `internship`;
CREATE TABLE `internship` (
  `sid` int(10) NOT NULL COMMENT '学号',
  `sname` varchar(20) DEFAULT NULL COMMENT '姓名',
  `status` int(1) DEFAULT NULL COMMENT '就业状态 1考研 2考公 3实习 4其它',
  `isleaving` int(1) DEFAULT NULL COMMENT '是否离校',
  `companyName` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `companyPlace` varchar(255) DEFAULT NULL COMMENT '公司地点',
  `contactInformation` varchar(13) DEFAULT NULL COMMENT '公司联系方式',
  `salary` varchar(20) DEFAULT NULL COMMENT '薪资',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(1) NOT NULL COMMENT '权限编号',
  `title` varchar(20) DEFAULT NULL COMMENT '权限名称',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `mid` int(10) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单名称',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单icon',
  `href` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '链接地址',
  `target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '跳转方式',
  `rid` int(1) DEFAULT NULL COMMENT '权限id',
  `layer` int(1) DEFAULT NULL COMMENT '菜单层级',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(20) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(3) DEFAULT NULL COMMENT '性别',
  `city` varchar(255) DEFAULT NULL COMMENT '居住地',
  `sId` int(10) DEFAULT NULL COMMENT '学号',
  `cellphone` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
  `birthData` varchar(20) DEFAULT NULL COMMENT '出身日期',
  `status` int(1) DEFAULT NULL COMMENT '就业状态 1考研 2考公 3实习 4其它',
  `classid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级',
  `dormid` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '寝室',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `uname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `studentId` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学号',
  `upassword` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户修改密码',
  `rid` int(1) NOT NULL COMMENT '权限id',
  `dpassword` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '默认密码',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
