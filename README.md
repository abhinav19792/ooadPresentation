# ooadPresentation

## Team Members:
  Abhinav Gupta,
  Prashanth Thipparthi

Repository has code to demostrate the working of Dependency Injection and Aspect Oriented Programming(AOP) using Spring Boot Framework.

## Dependency Injection
  In the code we can find the Engine Bean injected into the car class.
  
  Using dependency injection containers, it creates a object and then inject into the class. For this purpose we do configuration (XML,       Annotations, Java). In Spring boot we have “@Component” written above the class to be generated (whose object will be injected inside the   code) and injected into the class having “@Autowired” on it. e.g. 
  @Component 
  class ToyotaEngine inplements Engine { …. }

  Class Car {
  @Autowired
  Engine engine;
   }
  
## Aspect Oriented Programming(AOP)
  Helper class acts as the the Aspect class
  Methods "startLog()", "endLog()", "indicatorOn()". "indicatorOff()" acts as the Advices in the AOP.
  
