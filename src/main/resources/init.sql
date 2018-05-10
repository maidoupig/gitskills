#### 权限表
create table permission(
    pid int(11) not null AUTO_INCREMENT
    ,name varchar(255) not null default ''
    ,url varchar(255) default ''
    ,primary key(pid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

# 初始化权限数据
INSERT INTO permission VALUES ('1', 'add', '');
INSERT INTO permission VALUES ('2', 'delete', '');
INSERT INTO permission VALUES ('3', 'edit', '');
INSERT INTO permission VALUES ('4', 'query', '');

#### 用户表
create table user(
    uid int(11) NOT NULL AUTO_INCREMENT
    ,username varchar(255) not null default ''
    ,password varchar(255) not null default ''
    ,primary key(uid)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;
# 初始化用户数据
INSERT INTO user VALUES ('1', 'admin', '123');
INSERT INTO user VALUES ('2', 'demo', '123');

#### 角色表
create table role(
    rid int(11) not null AUTO_INCREMENT
    ,rname varchar(255) not null default ''
    ,primary key(rid)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

# 初始化角色表数据
INSERT INTO role VALUES ('1', 'admin');
INSERT INTO role VALUES ('2', 'customer');

# 权限角色关系表
CREATE TABLE permission_role(
    rid int(11) not NULL
    ,pid INT(11) not NULL
    ,KEY idx_rid (rid)
    ,KEY idx_pid (pid)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;
INSERT INTO permission_role VALUES ('1', '1');
INSERT INTO permission_role VALUES ('1', '2');
INSERT INTO permission_role VALUES ('1', '3');
INSERT INTO permission_role VALUES ('1', '4');
INSERT INTO permission_role VALUES ('2', '1');
INSERT INTO permission_role VALUES ('2', '4');


# 用户角色关系表
CREATE TABLE user_role(
     uid int(11) not NULL
    ,rid INT(11) not NULL
    ,KEY idx_uid (uid)
    ,KEY idx_rid (rid)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;
INSERT INTO user_role VALUES (1, 1);
INSERT INTO user_role VALUES (2, 2);

##测试添加到git的内容
#hello git
