# A Library Management Server

## Description
This project is a Java Spring Boot application that serves as a RESTful API for managing books in a library.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven

## Setup
1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed on your system.
3. Navigate to the project directory in your terminal or command prompt.
4. Run the following Maven command to build the project:

    ```
    mvn clean package
    ```

## Usage
1. Go to ``` /target ``` folder and use below command:

    ```
    java -jar <Name of the Jar file that was created>
    ```

2. Once the application is running, you can access the API endpoints using a tool like Postman or cURL.
3. The base URL for the API is `http://localhost:4050`.

## API Endpoints
- **GET /books**: Retrieve all books.
- **GET /books/{id}**: Retrieve a specific book by ID.
- **POST /books**: Add a new book.
- **PUT /books/{id}**: Update an existing book.
- **DELETE /books/{id}**: Delete a book by ID.

## Example Request
To add a new book, send a POST request to `http://localhost:8080/books` with a JSON body containing the book details:

```json
{
    "id": 1,
    "title": "Example Book",
    "author": "John Doe"
} 
```

## Technologies Used
- Java
- Spring Boot
- Maven
