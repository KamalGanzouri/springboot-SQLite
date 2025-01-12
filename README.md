# springboot-SQLite
Basic Link between Springboot/Springboot JPA with SQLite
# Spring Boot with SQLite

This is a Spring Boot application that uses SQLite as the database. The application demonstrates basic CRUD operations with a `User` entity.

## Prerequisites

- Java 23
- Maven
- SQLite

## Getting Started

### Clone the repository

```bash
git clone https://github.com/KamalGanzouri/springboot-wSQLite.git
cd springboot-wSQLite
```

### build the project
```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080`.

## Dependencies
- Spring Boot Starter Data JPA
- SQLite JDBC
- Hibernate Community Dialects

## Database Configuration
The application uses SQLite as the database. 
The database file is located at src/main/resources/database.sqlite. 
The configuration for the database connection can be found in the application.properties file:
```bash
spring.datasource.url=jdbc:sqlite:src/main/resources/database.sqlite
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=org.hibernate.dialect.SQLiteDialect
```
    