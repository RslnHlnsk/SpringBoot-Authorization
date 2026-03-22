FROM eclipse-temurin:8-jdk-alpine

EXPOSE 8080

COPY target/AuthorizationApplication-0.0.1-SNAPSHOT.jar authApp.jar

ENTRYPOINT ["java", "-jar", "/authApp.jar"]