#!/usr/bin/bash

DATABASE=office_system

mysql --defaults-extra-file=./user.cnf $DATABASE < ./docker-entrypoint-initdb.d/1.create-db.sql
mysql --defaults-extra-file=./user.cnf $DATABASE < ./docker-entrypoint-initdb.d/2.create-table.sql
mysql --defaults-extra-file=./user.cnf $DATABASE < ./docker-entrypoint-initdb.d/3.insert-data.sql
