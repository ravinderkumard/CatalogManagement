
# Use a base image with Java and Maven installed
FROM maven:3.8.4-openjdk-11-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml .

# Download the dependencies required for building the application
RUN mvn dependency:go-offline -B

# Copy the source code to the container
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Create a new stage with a smaller base image for running the application
FROM adoptopenjdk/openjdk11:jre-11.0.12_7-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the previous stage to the current stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port on which the application will run (change if needed)
EXPOSE 18080

# Set the command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]
