# spring-boot-backend
This application helps to demonstrate spring boot and Spring JPA CRUD concpets

There are 5 apis created as a part of this project

Base url: http://<host>:<port>/api/employee/
  
Apis and their urls: 
  
1. Create Employee API
   Method: POST
   Example Url: http://<host>:<port>/api/employee/saveEmployee 
	
2. Get All Employee API
   Method: GET
   Example Url: http://<host>:<port>/api/employee/getAllEmployess 
	
3. Get Employee API
   Method: GET
   Example Url: http://<host>:<port>/api/employee/getEmployeeById/{id}
   Here, id refers to any valid employee id
	
4. Update an existing employee API
   Method: POST
   Example Url: http://<host>:<port>/api/employee/updateEmployee/{id}
   Here, id refers to any valid employee id
	
5. Delete an existing employee API
   Method: DELETE
   Example Url: http://<host>:<port>/api/employee/deleteEmployee/{id}
   Here, id refers to any valid employee id
