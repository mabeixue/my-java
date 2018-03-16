-- 行列转换
-- 建表
CREATE TABLE cloumn_row (
  id INT (11) PRIMARY KEY auto_increment,
  NAME VARCHAR (32),
  course VARCHAR (32),
  score DOUBLE (10, 2)
);

-- 修改表明
alert table cloumn_row rename column_row;

-- 插入数据
insert into column_row (
    name,
    course,
    score
)
values
(
    '小二',
    '语文',
    40
),
(
    '小二'，
    '数学',
    50
),
(
    '小三',
    '语文',
    41
),
(
    '小三',
    '数学',
    51
);

-- case when 查询显示每个学生各科所得分数
select 
    name,
    max(case course when '数学' then score else 0 end) '数学',
    max(case course when '语文' then score else 0 end) '语文'
from column_row
group by name