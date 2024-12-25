FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the defined working directory
COPY target/todo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8080 

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]