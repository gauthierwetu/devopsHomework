FROM openjdk:9
EXPOSE 8080
ADD target/devopsHomework.jar devopsHomework.jar
ENTRYPOINT ["java","-jar","/devopsHomework.jar"]
