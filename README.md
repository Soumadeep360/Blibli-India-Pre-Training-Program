# Todo Application (MAIN PROJECT)

A simple and functional Todo application built with Java Spring Boot for the backend and MongoDB as the database, combined with HTML, CSS, and JavaScript for the frontend. This application is fully Dockerized and deployed on Render.

## Features

- Add, update, delete, and mark tasks as complete.
- Responsive and user-friendly interface.
- RESTful APIs powered by Spring Boot.
- MongoDB as the database for efficient data storage.
- Deployed live at [https://todo-app-we8e.onrender.com/](https://todo-app-we8e.onrender.com/).

## Technologies Used

- **Backend:** Java Spring Boot
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MongoDB
- **Containerization:** Docker
- **Deployment:** Render

## Getting Started

### Prerequisites

- Docker installed on your machine.

### Pull the Docker Image

To get started, pull the prebuilt Docker image:

```bash
docker pull soumadeep360/todo-app
```

### Run the Application

Run the container using the following command:

```bash
docker run -p 8080:8080 soumadeep360/todo-app
```

The application will be accessible at `http://localhost:8080`.

### Live Demo

You can also access the live demo at: [https://todo-app-we8e.onrender.com/](https://todo-app-we8e.onrender.com/)

### Running Locally with Application Properties

To run the application locally, use the following `application.properties` configuration:

```
spring.application.name=todo
spring.data.mongodb.uri=YOUR_MONGODB_URI
spring.web.resources.static-locations=classpath:/static/
```

## How It Works

1. **Backend**: The backend is built using Spring Boot and exposes REST APIs for handling CRUD operations.
2. **Frontend**: The frontend is built using static HTML, CSS, and JavaScript and communicates with the backend APIs.
3. **Database**: MongoDB stores the task data.
4. **Docker**: The application is containerized for easy deployment and distribution.
5. **Render Deployment**: The app is deployed on Render for public access.
