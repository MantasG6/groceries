# Simple Grocery Shop CRUD API
To start the database, password and user files in the main working directory need to be created:

db_user.txt:  
```
your_database_user
```
db_password.txt:
```
your_database_password
```
database user and password files should be named **db_password.txt** and **db_user.txt**

In addition to that, new properties file called **secrets.properties** should be created in **src/main/resources**:  
```
pring.datasource.username=your_database_user
spring.datasource.password=your_database_password
```
These passwords should match the passwords in the files

Before startup jar file needs to be created:
```
mvn clean package
```

Application startup requires Docker  
With Docker Desktop, you can run this command to start the application:
```
docker compose up
```

Once the application is started, you can see all the APIs and usage at
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)



