FROM eclipse-temurin:17-jdk-alpine
# Use a specific name if possible, or ensure only one JAR exists in target/
COPY target/my-app-name-1.0-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java", "-jar", "/app.jar"]
