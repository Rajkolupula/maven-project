# Stage 1: Build the JAR inside Docker
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
# Copy the pom and source code
COPY pom.xml .
COPY src ./src
# Run the build
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copy the JAR from the first stage (it's named 'project-0.0.1-SNAPSHOT.jar' based on your logs)
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
