# 基于Java 8的Alpine Linux镜像
FROM openjdk:8-jdk-alpine
LABEL authors="zp.chen"

# 复制jar文件到镜像中
COPY target/*.jar app.jar

# 创建一个日志目录
RUN mkdir /var/log/myapp

# 指定容器启动时运行的程序
ENTRYPOINT ["java","-jar","/app.jar"]

# 指定容器启动时运行的程序的参数，这里是指定日志输出位置为/var/log/myapp/myapp.log
CMD ["--logging.file=/var/log/myapp/myapp.log"]

# docker build -t myorg/myapp .
# docker run -p 8080:8080 -v /home/user/logs:/var/log/myapp myorg/myapp