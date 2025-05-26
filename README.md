### AI acknowledgement

The backend has been successfully migrated from Node.js/Express to Spring Boot/Java, and a Docker Compose configuration has been set up for the application with a PostgreSQL database. The following steps were performed:

1.  Created a Spring Boot application with Maven in the `springboot-server` directory.
2.  Implemented API endpoints using Spring Boot controllers.
3.  Configured the Spring Boot application to connect to the PostgreSQL database.
4.  Removed the Node.js/Express backend files (`server/` directory and `package.json` file).
5.  Created a Dockerfile for the Spring Boot application in the `springboot-server` directory.
6.  Created a `docker-compose.yml` file in the root directory of the project to define the services (PostgreSQL database and Spring Boot application) and their dependencies.
7.  Committed all changes to the Git repository with semantic commit messages.

To run the application, navigate to the root directory of the project and run the command `docker-compose up`. This will start the PostgreSQL database and the Spring Boot application in Docker containers.
