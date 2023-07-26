#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20230223.sql ./mysql/db
cp ../sql/ry_config_20220929.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../cyt-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy cyt-gateway "
cp ../cyt-gateway/target/cyt-gateway.jar ./ruoyi/gateway/jar

echo "begin copy cyt-auth "
cp ../cyt-auth/target/cyt-auth.jar ./ruoyi/auth/jar

echo "begin copy cyt-visual "
cp ../cyt-visual/cyt-monitor/target/cyt-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy cyt-modules-system "
cp ../cyt-modules/cyt-system/target/cyt-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy cyt-modules-file "
cp ../cyt-modules/cyt-file/target/cyt-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy cyt-modules-job "
cp ../cyt-modules/cyt-job/target/cyt-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy cyt-modules-gen "
cp ../cyt-modules/cyt-gen/target/cyt-modules-gen.jar ./ruoyi/modules/gen/jar

