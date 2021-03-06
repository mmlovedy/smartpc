-- 创建自定义监控表
CREATE TABLE T_GATHERING_ITEMS(
  itemid INTEGER(6),
  valuetype int(1),
  description NVARCHAR(200)
);

-- 测试数据
INSERT INTO T_GATHERING_ITEMS
    VALUES (10010010,0,"网卡上行流量");

INSERT INTO T_GATHERING_ITEMS
VALUES (10010011,0,"网卡下行流量");

INSERT INTO T_GATHERING_ITEMS
VALUES (10010012,0,"内存已使用大小");

INSERT INTO T_GATHERING_ITEMS
VALUES (10010013,0,"内存占用率");


DROP TABLE IF EXISTS `T_SYS_PERMISSION`;
CREATE TABLE `T_SYS_PERMISSION` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parentId` bigint(20) DEFAULT NULL,
  `parentIds` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `resourceType` enum('url','menu','button') DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `T_SYS_ROLE`;
CREATE TABLE `T_SYS_ROLE` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` bit(1) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `T_SYS_ROLE_PERMISSION`;
CREATE TABLE `T_SYS_ROLE_PERMISSION` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleId` bigint(20) NOT NULL,
  `permissionId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `T_SYS_USER_ROLE`;
CREATE TABLE `T_SYS_USER_ROLE` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `T_SYS_USER`;
CREATE TABLE `T_SYS_USER` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `state` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

