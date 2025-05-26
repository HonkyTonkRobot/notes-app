### AI acknowledgement

The backend has been successfully migrated from Node.js/Express to Spring Boot/Java, and a Docker Compose configuration has been set up for the application with a PostgreSQL database. The following steps were performed:

# Notes App
This is a simple app for taking notes. This is my 3rd weekly project for practicing my new full-stack skills. I am using this project to practice java, springboot, react, TypeScript. I will also be using Chakra-ui, PostgreSQL, and Docker/Docker-compose

## Launching the App on you local machine.

1.  Created a Spring Boot application with Maven in the `springboot-server` directory.
2.  Implemented API endpoints using Spring Boot controllers.
3.  Configured the Spring Boot application to connect to the PostgreSQL database.
4.  Removed the Node.js/Express backend files (`server/` directory and `package.json` file).
5.  Created a Dockerfile for the Spring Boot application in the `springboot-server` directory.
6.  Created a `docker-compose.yml` file in the root directory of the project to define the services (PostgreSQL database and Spring Boot application) and their dependencies.
7.  Committed all changes to the Git repository with semantic commit messages.

To run the application, navigate to the root directory of the project and run the command `docker-compose up`. This will start the PostgreSQL database and the Spring Boot application in Docker containers.

## Running the application locally

1.  Make sure you have Docker and Docker Compose installed.
2.  Navigate to the root directory of the project.
3.  Run the command `docker-compose up`. This will start the PostgreSQL database, the Spring Boot application, and the frontend application in Docker containers.
4.  Open your browser and navigate to `http://localhost:3000` to access the frontend application. You can also access the backend API endpoints directly on `http://localhost:8080`.
