### SOAP web services
Implementing two SOAP web services using Spring Boot, Maven wrapper, Java11. 
The first web service is to get a coffee drink according to some ingredients. the second web service is to get the ingredients of a coffee drink.
the same two web services are being published as REST web services to compare SOAP and REST. Check out the REST web services repository.

#### Main differences between SOAP and REST:
1- Several Web services can be published in one URL in SOAP. In my example it is http://makemycoffee.com/mydrink/webservices 
Check out the Classes CoffeeEndPoint.java where we publish two web services in one URL. You will find the rest of the URL configuration in the class 
WebServiceConig.java. 
In REST each web service is being published in a unique URL. Check out the REST web services Repository later on.
2- The called web service and its parameter will be listed in an .xml file called SOAP-Envelope and Send to the URL, where the SOAP web services are being published.
Check out the folder requests. I have prepared some requests
to call the web services. 




