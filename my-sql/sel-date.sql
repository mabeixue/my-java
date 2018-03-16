-- 测试时间查询效率

-- 建表
CREATE TABLE sel_date (
	id INT(11) PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	create_date DATETIME COMMENT '创建时间',
	CODE VARCHAR(32) COMMENT '编码'
);

-- 插入数据
SET @n = NOW();
INSERT  INTO sel_date (
	create_date,
	CODE
)
VALUES (
	@n ,
	'test' 
);
INSERT  INTO sel_date (
	create_date,
	CODE
)
VALUES (
	@n ,
	'test' 
);
INSERT  INTO sel_date (
	create_date,
	CODE
)
VALUES (
	@n ,
	'test' 
);
INSERT  INTO sel_date (
	create_date,
	CODE
)
VALUES (
	@n ,
	'test' 
);

-- 查看 date_format 
EXPLAIN 
SELECT * FROM sel_date WHERE  DATE_FORMAT(create_date, '%y-%m-%d') = '2018-03-16';

EXPLAIN 
SELECT * FROM sel_date WHERE create_date BETWEEN '2018-03-16 00:00:00' AND '2018-03-16 23:59:59';