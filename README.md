Spring Boot REST API with MongoDB
This is a simple Spring Boot project that provides a RESTful API to interact with "Server" objects stored in a MongoDB database.

Features:
CRUD operations for "Server" entities:
Create a new server
Retrieve all servers or search by server name
Update a server by ID
Delete a server by ID

Prerequisites:
Java 8 or newer
Maven
MongoDB instance (local or cloud)

Endpoints
Create a Server:

Method: PUT
URL: /server
Body: JSON (e.g., { "name": "ServerName", "description": "Description" })
Get All Servers or Search by Name:

Method: GET
URL: /servers or /servers?name=ServerName
Update a Server by ID:

Method: POST
URL: /server/{id}
Body: JSON (e.g., { "name": "NewServerName", "description": "NewDescription" })
Delete a Server by ID:

Method: DELETE
URL: /server/{id}
Tools Used
Spring Boot
Spring Data MongoDB
Maven
MongoDB

