# eongframe
===================================
新搭建的一个框架：
-----------------------------------
### 版本： 
      springmvc mybatis 
      mysql 
      maven
### 功能：
      1：基本功能的跳转
      2：基本功能的数据查询
      3：读写分离（可注解的读写分离）
### 使用：
      1：配置数据库连接信息
          jdbc.properties
      2：执行sql
          SET NAMES utf8;
          SET FOREIGN_KEY_CHECKS = 0;

          -- ----------------------------
          --  Table structure for `demo`
          -- ----------------------------
          DROP TABLE IF EXISTS `demo`;
          CREATE TABLE `demo` (
            `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
            `name` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '名称',
            PRIMARY KEY (`id`)
          ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

          -- ----------------------------
          --  Records of `demo`
          -- ----------------------------
          BEGIN;
          INSERT INTO `demo` VALUES ('1', 'success-cs');
          COMMIT;
          SET FOREIGN_KEY_CHECKS = 1;
      3:启动tomcat，运行
      
@author cott.wen

