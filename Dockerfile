FROM openjdk:11
COPY ./target/Devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]
