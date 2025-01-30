FROM openjdk:17-alpine
EXPOSE 7070
COPY target/Doctor-Service-0.0.1-SNAPSHOT.jar doctor.jar
ENTRYPOINT ["java", "-jar","doctor.jar"]