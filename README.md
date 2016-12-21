# A-real-time-Car-Location-Monitoring-System-Java-Spring-

This project works as a uber simulator, see: http://uber.chaofengwang.com:8888</br>
As I want to get familiar with the technologies used in real-life industry, I leart many useful technologies in this project in my company.</br>
The project contains four microservices .</br>
<ul>
<li>Car location service, responsible for tracking car status, for example, the number of odometer, whether available or not.
<li>Car location simulator, responsible for tracking car GPS location, especially start and end position of a taxi service to calculate fee.
<li>Message controller, responsible for update the vehicle info on the map, for example, after detecting newly joint vehicles. 
<li>Dashboard, responsible for display all the data to integrate with backend.

</ul>
The architecture of the entire project:</br>
<ul>
<li>Single page front-end at Application layer.
<li>Tomcat at Service Layer.
<li>MongoDB at Data Access Layer.
<li>RabbitMQ as message broker.
</ul>
<br/>
Things to do in the next release:</br>
1. Fix bug in the front-end: Failed to load vehicle status image.</br>
2. Apply NGINX to server to increase scalability.</br>
3. Regression test with Selenium to make sure it's robustness.

