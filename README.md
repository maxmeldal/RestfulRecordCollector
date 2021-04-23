# RestfulRecordCollector
Simple web application that creates and stores information about records in your collection.
The application shows experience in using modern framework Spring Web to create a RESTful controller that communicates with at relational database (SQL).
The application is written primarily in Java.

## Framework
The appplication is created using a Spring Framework and implments a RESTful controller to represent objects in JSON format.
Furthermore the website for the application is set up simply using HTML and Thymeleaf.

## Database
The application uses JDBC (Java Database Connectivity) API to create, read, update and delete data from a local SQL database.

## Running the application
To run the application you must first run the SQL script inside the recordcollector folder. The script is called "sql schema, tables and data generator script".
When you have run the script in SQL you must run the application and go to src>main>resources>application.properties and change the username and password to match the credentials in your local SQL database.
You can now run the main method located under src>main>java>RecordcollectorApplication. Open your browser and go to localhost:8080
