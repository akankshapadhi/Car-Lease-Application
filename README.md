
# Readme.md

Car Lease Platform

A Spring Boot MVC project with JWT authentication.


Description

A Car-Lease-Platform API to maintain customer data, vehicle information and calculate lease rate for customers based on desired input. 

## Authors

- [@akanksha padhi](https://www.github.com/akankshapadhi)


## Technologies

Java 17 

Spring Boot v2.2.6

MySQL Community Server v8.0.27

Spring Data JPA

Spring Web MVC

Spring Security 

JUnit



## How to run locally 

1. Execute command

```bash
  git clone https://_____
```

2. Execute command

```bash
  mvn install
```
3. Execute command

```bash
  mvn spring-boot:run
```
4. The local server is running on

```bash
  http:localhost:8080/
```

5. Configure datasource in 
```bash
  main/rescources/application.properties
```
```bash
  spring.datasource.url = jdbc:mysql://localhost:3306/testdb
  spring.datasource.username = root
  spring.datasource.password = password
  spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MYSQLDialect
  spring.jpa.hibernate.ddl-auto = update
```
## User authentication

1. Connect to server

```bash
  http:localhost:8080/token
```

2. Use POST and add the following in body (JSON format) to generate token.

```javascript
{"username":"john","password":"pass","scopes":"com.api.customer.r"}

```

3. Token will be generated and displayed in the body. 

```javascript
Sample Token (Update during running program)

{"token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcGl1c2VyIiwiaXNzIjoibWVAbWUuY29tIiwic2NvcGVzIjoiY29tLmFwaS5jdXN0b21lci5yIiwiZXhwIjoxNjk4NjE2MzE2fQ.sk7cRkSz2q3CD49_oIHF_uTym2_6DwVhSo10DqOAK3g“}

```
## View customers, cars and lease data

1. Connect to respective servers to get data

```bash
  http:localhost:8080/customers
  http:localhost:8080/cars
  http:localhost:8080/lease

```

2. Use GET and add the generated token as Bearer Token in authentication tab to display results.

## Manipulate customer data

1. Connect to server 

```http
 http:/localhost:8080/api/customers/
```

2. Use POST for adding customers.

3. Connect to server

```bash
 http:/localhost:8080/api/customers/id
```

3. Use PUT for editing customers (Change "id" to desired custmer id number in URL). Use the sample body (JSON format) to enter the data

```javascript
{"name":“Myname","password":"pass","street":"beta","house":"G1","zip":"D1","place":"leiden","email":“myemail@abc.com","phone":"716878208"}

```
## View and manipulate data


| HTTP Verbs | Endpoints     | Action                |
| :-------- | :------- | :------------------------- |
| POST    | /token | **Required**. To generate the token for authentication|
| GET    | /customers | To view customers data|
| GET    | /cars | To view cars data|
| GET    | /lease | To view lease data|
| POST    | /api/customers/ | To add customer data|
| PUT    | /api/customers/id |**Change "id" value to desired id of customer**. To edit customer data|

Sample body (JSON format) to enter the customer data

```javascript
{"name":“Myname","password":"pass","street":"beta","house":"G1","zip":"D1","place":"leiden","email":“myemail@abc.com","phone":"716878208"}

```
"# Car-Lease-Application" 