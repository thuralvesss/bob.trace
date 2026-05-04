  Bob.Trace - AI-Powered Impact Analysis
  
  Bob.Trace is an intelligent tool designed for the IBM Bob Hackathon to help Java developers navigate complex systems. It uses the power of IBM's Generative AI to map code dependencies and predict the "ripple effect" of any change.
  
   The ProblemIn
   
   large-scale Java/Spring applications, a small change in a Service or Repository can cause silent failures in unrelated modules. Developers often spend hours manually testing or, worse, shipping bugs to production.
   
    The Solution
    
    Bob.Trace acts as an "External Scanner" (The Doctor) that examines a target repository (The Patient). By leveraging IBM Bob, it:
    Maps Dependencies: Identifies every class and method affected by a code change.
    Calculates Risk: Automatically classifies the impact as High, Medium, or Low based on architectural layers.
    Generates Tests: Creates ready-to-use JUnit/Mockito test cases for the affected areas.
    
    Tech StackBackend:
    Java 25 & Spring Boot 3.x.AI 
    Engine: IBM Bob (Generative AI).
    Frontend: React & Tailwind CSS (Clean Blue Minimalist Design).
    Architecture: RESTful API with Decoupled Service Layer.
    
    How to Run (Backend)Prerequisites:
    JDK 25 and Maven installed.
    Clone the repo: git clone [https://github.com/thuralvesss/bob-trace-api](https://github.com/thuralvesss/bob-trace-api).
    Run the app: Execute ./mvnw spring-boot:run.
    Endpoints:POST /api/analise/impacto: Returns a JSON with affected classes and risk levels.
    POST /api/analise/gerar-teste: Generates unit test code for a specific class.
    
