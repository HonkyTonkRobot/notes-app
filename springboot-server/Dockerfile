FROM openjdk:17-jdk-slim

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN apt-get update
RUN apt-get install -y maven

RUN mvn clean install

CMD ["java", "-jar", "target/notes-app-0.0.1-SNAPSHOT.jar"]
