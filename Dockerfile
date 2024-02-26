FROM openjdk:11-slim-stretch
ADD target/api-0.0.1-SNAPSHOT.jar /api-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]