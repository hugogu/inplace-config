FROM openjdk:13-jdk-alpine
MAINTAINER hugogu@outlook.com

ENV TZ UTC
ARG JAR_FILE
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
