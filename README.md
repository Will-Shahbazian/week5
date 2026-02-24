Generative AI notes/documentation:

I used AI for the design/implementation portion of the project as required by the rubric.

Queries included:

Given the files generated for week4, implement a new class called WhatsAppService that implements the existing NotificationMedium interface.
The send(String message) method should output: [WhatsApp] Sending message: <message text>.
Ensure that when this new medium is used, the message is still correctly stored in the ArrayList log within the AlertSystem (inherited behavior through composition).
Also, generate a test script for WhatsAppService class.

Revisions:

Changed the output so that each class was in its own file, as suggested in feedback on previous project.
Added more/better JavaDocs documentation, as suggested in feedback on previous project. This included expanding class descriptions to clarify architectural roles, responsibilities, and design rationale rather than only describing basic functionality. Additional detail was added to method documentation to better explain behavior, intent, and system interactions. Metadata tags such as @author and @version were consistently applied across all components.

How you ensured the AI output matched the existing interface signature perfectly to avoid a rewrite:

The WhatsAppService class implemented the NotificationMedium interface from NotificationApp. The interface defined a single method, send(String message), which established both the required method name and parameter signature. The WhatsAppService class was designed to implement this interface rather than introduce new behavior or alter existing structures.

Commands used:
-For the JavaDoc generation: 
    javadoc *.java

-For running the main program from the CLI: 
    javac *.java
    java NotificationApp

-For running the test script:
    javac *.java
    java WhatsAppServiceTest
