-- 添加用户
insert into j_user values (null,'aaa','aaa','2020-02-17 02:00:00');

-- 添加微信
insert into j_weixin values (null,'wx1','微信1','11111111111','2020-02-18 02:00:00','2020-02-18 02:00:00');

-- 添加游戏帐号
insert into j_account values (null,'zhanghao1','123',1,'2020-02-19 02:00:00','2020-02-19 02:00:00');
insert into j_account values (null,'zhanghao2','123',1,'2020-02-20 02:00:00','2020-02-20 02:00:00');

-- 添加角色
insert into j_game_role values (null,'角色1','无',1,'2020-02-21 02:00:00','2020-02-21 02:00:00');
insert into j_game_role values (null,'角色2','无',1,'2020-02-21 02:00:00','2020-02-21 02:00:00');
insert into j_game_role values (null,'角色3','无',2,'2020-02-21 02:00:00','2020-02-21 02:00:00');
insert into j_game_role values (null,'角色4','无',2,'2020-02-21 02:00:00','2020-02-21 02:00:00');

-- 添加任务类型
insert into j_task_type values (null,'活动1','无',5.0,'R/日','2020-02-17 02:00:00','2020-02-17 02:00:00');
insert into j_task_type values (null,'活动2','无',30.0,'R/日','2020-02-17 02:00:00','2020-02-17 02:00:00');
insert into j_task_type values (null,'活动3','无',35.0,'R/日','2020-02-17 02:00:00','2020-02-17 02:00:00');

-- 添加任务状态
insert into j_task_status values (null,'新建');
insert into j_task_status values (null,'已做完');
insert into j_task_status values (null,'关闭');
insert into j_task_status values (null,'撤销');

-- 添加支付状态
insert into j_pay_status values (null,'未支付');
insert into j_pay_status values (null,'已支付全部');
insert into j_pay_status values (null,'已支付一部分');

-- 添加任务
insert into j_task values (null,1,1,'2020-02-17','2020-02-17',1,1,'2020-02-17 10:00:00','2020-02-17 10:00:00');
insert into j_task values (null,2,2,'2020-02-17','2020-02-20',1,1,'2020-02-17 10:00:00','2020-02-17 10:00:00');
insert into j_task values (null,3,1,'2020-02-17','2020-02-17',1,1,'2020-02-17 10:00:00','2020-02-17 10:00:00');
insert into j_task values (null,4,3,'2020-02-17','2020-02-25',1,1,'2020-02-17 10:00:00','2020-02-17 10:00:00');

-- 添加任务日志
insert into j_task_log values (null,1,1,1,1,1,10,'','2020-02-17 10:00:00');
insert into j_task_log values (null,2,2,2,1,1,10,'','2020-02-17 10:00:00');
insert into j_task_log values (null,3,3,1,1,1,10,'','2020-02-17 10:00:00');
insert into j_task_log values (null,4,4,3,1,1,10,'','2020-02-17 10:00:00');




