### Lab 1
#### 1. Service Discovery
 - Create and run Spring Cloud Eureka server application
 - Register Hello service in Eureka
#### 2. Create HelloWorld service
 - Create the new service application
 - Add a controller with GET /hello-world endpoint
 - Use Hello service from Eureka with Feign or Ribbon (RestTemplate with @LoadBalanced) annotation.
 - Wrap call to Hello service to circuit breaker with fallback method that return “Hello Service Not Available”
#### 3. API Gateway
 - Create a Zuul application
 - Configure /hello & /hello-world proxy configuration
#### 4. [Optional] Dashboard
 - Create a dashboard spring boot app
 - Use Hystrix Dashboard to watch circuit breaker statuses
