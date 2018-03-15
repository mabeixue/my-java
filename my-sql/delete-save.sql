-- MySQL删除重复数据 并保留ID最大值
-- 建表sql
CREATE TABLE `my-sql`.`delete_max` (
  `id` INT (11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR (32) COMMENT '重复列',
  PRIMARY KEY (`id`)
) ;

-- 新增数据
INSERT INTO delete_max (NAME) VALUE ('1');
INSERT INTO delete_max (NAME) VALUE ('1');
INSERT INTO delete_max (NAME) VALUE ('2');
INSERT INTO delete_max (NAME) VALUE ('1');

-- 删除重复数据，保留最大id
delete t1 from delete_max t1 
join (
    select name,
           max(id)
           from delete_max
           group by name
           having count(*) > 1
) t2 on t1.name = t2.name 
where t1.id < t2.id