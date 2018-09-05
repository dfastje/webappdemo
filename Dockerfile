FROM openjdk:8
MAINTAINER DFastjeWork@gmail.com

COPY target/webappdemo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]