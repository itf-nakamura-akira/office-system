SET CHARACTER_SET_CLIENT = utf8mb4;
SET CHARACTER_SET_CONNECTION = utf8mb4;

-- Project Name : Office System
-- Date/Time    : 2022/02/20 0:31:13
-- Author       : itfllc
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- ユーザー
create table users (
  id serial not null comment 'ID'
  , account text not null comment 'アカウント'
  , password_hash text not null comment 'パスワードハッシュ'
  , name text not null comment '表示名'
  , permission enum('Admin', 'User') not null comment 'ユーザー権限'
  , is_enabled boolean not null comment '有効フラグ'
  , constraint users_PKC primary key (id)
) comment 'ユーザー' ;

