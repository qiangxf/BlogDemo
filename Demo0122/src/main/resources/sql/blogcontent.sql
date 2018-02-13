CREATE TABLE `blogcontent` (
  `blog_content` text COLLATE utf8_unicode_ci COMMENT '博客内容',
  `blog_html` text COLLATE utf8_unicode_ci COMMENT '博客html',
  `id` int(250) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `add_time` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '新增时间id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci