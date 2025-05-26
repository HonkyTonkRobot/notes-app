**AI acknowledgement**
_Cline was used to update my boiler-plate from node.js to a springboot/java backend, and to add Docker and Docker-compose files._

1.  _Created a Spring Boot application with Maven in the `springboot-server` directory._
2. _Implemented API endpoints using Spring Boot controllers._
3. _Configured the Spring Boot application to connect to the PostgreSQL database._
4. _Removed the Node.js/Express backend files (`server/` directory and `package.json` file)._
5. _Created a Dockerfile for the Spring Boot application in the `springboot-server` directory._
6. _Created a `docker-compose.yml` file in the root directory of the project to define the services (PostgreSQL database and Spring Boot application) and their dependencies._
7. _Committed all changes to the Git repository with semantic commit messages._

# Notes App
This is a simple app for taking notes. This is my 3rd weekly project for practicing my new full-stack skills. I am using this project to practice java, springboot, react, TypeScript. I will also be using Chakra-ui, PostgreSQL, and Docker/Docker-compose

## Launching the App on you local machine.


## Running the application locally

1.  Make sure you have Docker and Docker Compose installed.
2.  Navigate to the root directory of the project.
3.  Run the command `docker-compose up`. This will start the PostgreSQL database, the Spring Boot application, and the frontend application in Docker containers.
4.  Open your browser and navigate to `http://localhost:3000` to access the frontend application. You can also access the backend API endpoints directly on `http://localhost:8080`.
