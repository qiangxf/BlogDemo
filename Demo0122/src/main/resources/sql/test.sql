CREATE TABLE `test` (
  `id` int(10) NOT NULL COMMENT 'id',
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci