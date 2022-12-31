# SpringBoot Microservices and their interaction

<b>Technologies Used : </b><p>
To create Microservices : SprintBoot 2.3.9 version <p>
Service Registry : Eureka Server (Netflix) <p>
API Gateway : Spring Cloud Gateway <p>
Circuit Breaker : Hystrix, Hystrix Dashboard (Netflix) <p>
Config Server : Spring Cloud Config Server <p>
Logs Tracing : Zipkin and Sleuth<p>


<b>Running Zipkin server: </b><p>
java -jar zipkin-server-2.23.2-exec.jar<p>


<p>Once the application is started with Sleuth and Zipkin server is started then the logs will automatically flow in and 
appear in Zipkin dashboard.<p> 


<b>Order of apps start up: </b><p>
Config Server<p>
Service Registry<p>
API Gateway<p>
User Service<p>
Department Service<p>
Hystrix Dashboard<p>

<b>Project Mindmap</b><p>
![img.png](project-structure.png)

<p>Credits to : https://youtu.be/BnknNTN8icw


TODO:
1. Should Config server which gets the Eureka server info from Git also connect to Eureka as Client??
2. Implement Redis Cache In Spring Boot Application : https://javatechonline.com/how-to-implement-redis-cache-in-spring-boot-application/




