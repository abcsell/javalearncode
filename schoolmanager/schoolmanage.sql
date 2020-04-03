/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 127.0.0.1:3306
 Source Schema         : schoolmanage

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 03/04/2020 20:43:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for leaderinfo
-- ----------------------------
DROP TABLE IF EXISTS `leaderinfo`;
CREATE TABLE `leaderinfo`  (
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `code` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sexy` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `address` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salary` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `major` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `duty` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leaderinfo
-- ----------------------------
INSERT INTO `leaderinfo` VALUES ('江润', '900001', '男', '1982-01-18', '上海市', '50', '5000', '计算机系', '系主任');
INSERT INTO `leaderinfo` VALUES ('王华', '900002', '女', '2020-03-02', '北京市', '20', '5030', '机械系', '系主任');
INSERT INTO `leaderinfo` VALUES ('张芳', '900003', '女', '2019-10-01', '天津市', '21', '5100', '生物系', '系主任');
INSERT INTO `leaderinfo` VALUES ('李安国', '900004', '男', '1939-06-15', '贵州市', '60', '6000', '学校', '副校长');

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo`  (
  `stname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stcode` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stsexy` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stage` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `staddress` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stbirthday` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `class` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `major` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stcode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('李哪吒', '123451', '男', '3', '陈塘关', '1988-02-13', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('饶 斌', '950001', '男', '21', '上海市', '1981-03-18', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('范冰冰', '950002', '女', '19', '上海市', '1983-11-03', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('代 冉', '950003', '女', '20', '上海市', '1982-12-14', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('富怡琴', '950004', '女', '20', '上海市', '1982-09-01', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('姜晓燕', '950005', '女', '20', '上海市', '1982-01-18', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('顾 乔', '950006', '男', '20', '上海市', '1982-11-08', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('郭振飞', '950007', '男', '20', '上海市', '1982-01-11', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('张 韬', '950008', '男', '20', '上海市', '1982-05-01', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('杨慕铿', '950009', '男', '20', '上海市', '1982-03-01', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('史正男', '950010', '男', '22', '上海市', '1982-06-01', '三班', '计算机系');
INSERT INTO `studentinfo` VALUES ('徐汉城', '950011', '男', '20', '上海市', '1982-07-08', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('陈 俊', '950012', '男', '21', '上海市', '1981-07-13', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('卓 越', '950013', '男', '20', '上海市', '1982-08-08', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('魏国峰', '950014', '男', '20', '上海市', '1982-03-23', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('袁乃沁', '950015', '女', '18', '上海市', '1984-04-04', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('黄晓峰', '950016', '男', '20', '上海市', '1982-05-03', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('齐宝华', '950017', '男', '20', '上海市', '1982-11-11', '二班', '计算机系');
INSERT INTO `studentinfo` VALUES ('节连松', '950018', '男', '19', '上海市', '1983-02-08', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('王晓辉', '950019', '男', '20', '上海市', '1982-04-08', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('秦嵩宁', '950020', '男', '20', '上海市', '1982-04-11', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('金 凌', '950021', '女', '20', '上海市', '1982-12-18', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('杨 坤', '950022', '男', '20', '上海市', '1982-09-08', '一班', '计算机系');
INSERT INTO `studentinfo` VALUES ('王明新', '950047', '男', '23', '北京市', '1983-11-03', '一班', '机械系');
INSERT INTO `studentinfo` VALUES ('颜丹晨', '950052', '女', '35', '天津市', '1992-02-12', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('徐文波', '950101', '男', '21', '上海市', '1981-02-08', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('梁文深', '950102', '男', '20', '上海市', '1982-09-08', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('陈 雷', '950103', '男', '20', '上海市', '1982-09-18', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('夏小勇', '950104', '男', '22', '上海市', '1980-09-12', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('句 龙', '950105', '男', '20', '上海市', '1982-01-02', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('钱信林', '950106', '男', '20', '上海市', '1982-03-02', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('张新伟', '950107', '男', '21', '上海市', '1981-11-18', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('陈倩媚', '950108', '女', '20', '上海市', '1982-04-14', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('卢 婷', '950109', '女', '20', '上海市', '1982-02-23', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('贺建林', '950110', '男', '20', '上海市', '1982-02-01', '一班', '生物系');
INSERT INTO `studentinfo` VALUES ('阮从胜', '950201', '男', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('王燕英', '950202', '女', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('方 成', '950203', '男', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('林正新', '950204', '男', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('陈 曦', '950205', '男', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('谭必奎', '950206', '男', '20', '上海市', '1982-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('刘 东', '950207', '男', '21', '上海市', '1981-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('陈 锋', '950208', '男', '21', '上海市', '1981-01-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('姜 红', '950209', '女', '20', '上海市', '1982-01-01', '一班', '机械系');
INSERT INTO `studentinfo` VALUES ('张济兴', '950210', '男', '20', '上海市', '1982-02-18', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('马木龙', '950211', '男', '20', '上海市', '1982-03-08', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('江润生', '950212', '男', '20', '上海市', '1982-01-08', '二班', '机械系');
INSERT INTO `studentinfo` VALUES ('洪芙蓉', '950213', '女', '20', '上海市', '1982-01-02', '三班', '机械系');
INSERT INTO `studentinfo` VALUES ('赵 军', '950214', '男', '20', '上海市', '1982-01-18', '二班', '机械系');

-- ----------------------------
-- Table structure for teacherinfo
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo`  (
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `code` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sexy` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salary` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `major` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `duty` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacherinfo
-- ----------------------------
INSERT INTO `teacherinfo` VALUES ('李元芳', '1231235', '男', '1986-03-25', '长安时', '56', '8945', '生物系', '教师');
INSERT INTO `teacherinfo` VALUES ('李靖', '132452', '男', '1987-01-01', '陈塘关', '56', '9855', '学校', '副校长');
INSERT INTO `teacherinfo` VALUES ('江润', '900001', '男', '1982-01-18', '上海市', '50', '5000', '计算机系', '系主任');
INSERT INTO `teacherinfo` VALUES ('王华', '900002', '女', '2020-03-02', '北京市', '20', '5030', '机械系', '系主任');
INSERT INTO `teacherinfo` VALUES ('张芳', '900003', '女', '2019-10-01', '天津市', '21', '5100', '生物系', '系主任');
INSERT INTO `teacherinfo` VALUES ('李安国', '900004', '男', '1939-06-15', '贵州市', '60', '6000', '学校', '副校长');
INSERT INTO `teacherinfo` VALUES ('风行', '900123', '男', '1967-12-26', '北京市', '36', '5699', '计算机系', '教师');
INSERT INTO `teacherinfo` VALUES ('赵军', '950214', '男', '1982-01-18', '上海市', '20', '5000', '计算机系', '教师');
INSERT INTO `teacherinfo` VALUES ('风行', '950215', '女', '2020-03-09', '石家庄', '19', '3000', '生物系', '教师');
INSERT INTO `teacherinfo` VALUES ('李翔', '950216', '男', '2000-07-06', '廊坊', '35', '4600', '机械系', '教师');

SET FOREIGN_KEY_CHECKS = 1;
