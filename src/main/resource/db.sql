if not exists table t_user;
create table t_user (
    id int primary key,
    num varchar(20) not null,
    name varchar(20) not null,
    sex varchar(2) not null,
    age int not null comment,
    remark varchar(255) comment,
    status int not null comment,
    create_time datetime not null,
    edit_time datetime not null
)charset=utf8;