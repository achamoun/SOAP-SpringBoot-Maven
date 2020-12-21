### SOAP web services
Implementing two SOAP web services using Spring Boot, Maven wrapper, Java11. 
### 1. The web services:
The first web service is to get a coffee drink according to some ingredients. the second web service is to get the ingredients of a coffee drink.
Check out the package "com.example.coffee.functions"
### 2. Contract first, creating the .wsdl file:
Spring Boot adopts the contract first approch in creating SOAP web services. You need to write a .xsd file describing your web services and their parameter. 
Spring Boot will use this .xsd file to creat and publish the .wsdl file of your web services. Check out the file "main/resources/coffeeDrinks.xsd" 
### 3. Creating java classes from the .wsdl file:
After creating the .wsdl file, you need to creat the java classes from the .wsdl file. \
Open Terminal, go to your project, go to the folder where the file "mvnw.cmd" is. run the command ./mvnw clean package\
The classes will be created the the "target" package.
### 4. Publishing the web services:
Publishing the web services with Spring Boot is done in the classes in the package "com.example.coffee"
### 5. More Information on creating SOAP web services and running them with Spring Boot:
https://spring.io/guides/gs/producing-web-service/
### 6. Testing the web services:
The .wsdl will be locally published on http://localhost:8080/webservices/coffeeDrinks.wsdl \
In the folder named "requests" you will find prepared requests to call the web services. Use a web service tool like SoapUI or curl to send the requests.
The URL you have to send requests to is  http://localhost:8080/webservices



#### Main differences between SOAP and REST:
1. Several Web services can be published in one URL in SOAP. In my example it is http://localhost:8080/webservices \
In REST each web service is being published in a unique URL. Check out the REST web services Repository later on.
2. The web service and its parameter will be listed in an .xml file and Send to the URL, where the SOAP web services are being published.
Check out the folder "requests". \
In REST the web service and its parameter are included in the URL you call.

P.S. : To compare SOAP and REST i published the same web services of the package "com.example.coffee.functions" as REST web services.\ Check out the repository REST web service and see the difference.


