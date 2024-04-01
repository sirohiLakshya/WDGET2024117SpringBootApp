# Use a lightweight base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from your project directory into the container
COPY target/myBookLibraryApp-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

# Expose the port that the application runs on (if necessary)
EXPOSE 4050

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

