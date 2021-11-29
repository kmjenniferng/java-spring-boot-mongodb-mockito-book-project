# Creating RESTful APIs with JUnit tests using Java, Spring Boot, MongoDB database and Mockito

The purpose of this project is to create 5 RESTful APIs to perform the following actions in MongoDB database.
1. **Add a book**
2. **Find all books**
3. **Find a book by book id**
4. **Find books by author name**
5. **Delete a book**

## Application Architecture

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/system_architecture.png">

## Instructions on running tests using POSTMAN
1. **Add a book**

HTTP:POST localhost:8080/addBook

Headers: Key = Content-Type, Value = application/json

Body: { "id":123 ,"name":"IT", "authorName":"Sam" }

Expected test result: book will be added into MongoDB database.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot1.png">

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot2.png">

2. **Find all books**

HTTP:GET localhost:8080/findAllBooks

Headers: Key = Content-Type, Value = application/json

Expected test result: all books data from MongoDB database will be shown in response.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot3.png">

3. **Find a book by book id**

HTTP:GET: localhost:8080/findBookById/{bookId}

Headers: Key = Content-Type, Value = application/json

Expected test result: book data will be shown in response based on provided book id.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot4.png">

4. **Find books by author name**

HTTP:GET: localhost:8080/findBookByAuthor/{authorName}

Headers: Key = Content-Type, Value = application/json

Expected test result: book data will be shown in response based on provided author name.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot5.png">

5. **Delete a book**

HTTP:DELETE: localhost:8080/deleteBook/{bookId}

Headers: Key = Content-Type, Value = application/json

Expected test result: a book with provided book id will be removed from MongoDB database.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot6.png">

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-mockito-book-project/blob/main/screenshot7.png">
