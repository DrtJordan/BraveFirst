#!/bin/bash

systemctl start mysqld
hive --service metastore &
$HADOOP_HOME/sbin/start-dfs.sh
$SPARK_HOME/sbin/start-all.sh
