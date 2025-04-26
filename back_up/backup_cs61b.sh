#!/bin/bash

# 设置目标网址
URL="https://sp21.datastructur.es"
FOLDER="sp21.datastructur.es"

# 使用 wget 镜像整个网站
echo "📥 开始下载 CS61B 网站..."
wget --mirror --convert-links --adjust-extension --page-requisites --no-parent "$URL"

# 下载完成后，打包成 ZIP
echo "📦 打包为 cs61b_backup.zip..."
zip -r ../cs61b_backup.zip "$FOLDER" > /dev/null

# 返回上层目录
cd ..

echo "✅ 下载并打包完成：cs61b_backup.zip"
