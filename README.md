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

Project Purpose:
    -The goal of this assignment was to build on the previous one, while learning good maintenance. We had to extend the system's functionality by adding new components, not by modifying the core engine. The ability to receive alerts via WhatsApp was added, without rewriting the AlertSystem class or changing the existing NotificationMedium interface.

Quick Start:
    -Ensure the system environment has all requirements (mentioned in section below)
    -Download the code manually/extract the ZIP file, or clone the repository using Git commands.
    -Open a terminal and navigate to the correct directory location.
    -For running the program from the CLI, use: 
        javac NotificationApp.java
        java NotificationApp
    -For the JavaDoc generation, use: 
        javadoc NotificationApp.java
    -For running the test script, use:
        javac *.java
        java WhatsAppServiceTest

Requirements:
    -Computer with command line interface
    -Java/JDK installed on system, PATH System Environment Variable set
        -Tested on Windows 11, with Visual Studio Code terminal

