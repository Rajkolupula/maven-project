# Stage 1: Build the JAR
FROM maven:3.8.5-openjdk-11-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# This creates a fresh JAR with the main method
RUN mvn clean package -DskipTests

# Stage 2: Create the final Image
FROM eclipse-temurin:11-jre-alpine
WORKDIR /app
# This copies the NEW jar from the build stage
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
