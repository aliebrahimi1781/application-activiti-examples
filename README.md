#application-activiti-examples

### Examples used to aid in understanding and development of workflows for [application-activiti](https://www.google.com)'s extension of [XWiki](http://xwiki.org).

###This repository contains several examples:

1. A set of simple demo processes to illustrate several capabilities of the implementation
2. A more complex document workflow which has a Java module


###Directory Structure

<pre>
.
├── document-workflow
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── org
│           │       └── xwiki
│           │           └── activiti
│           │               └── documentWorkflow
│           │                   ├── ApproveArticleCreationTaskListener.java
│           │                   ├── DescribeArticleTaskListener.java
│           │                   ├── ImproveArticleTaskListener.java
│           │                   ├── ReviewTaskListener.java
│           │                   └── WriteArticleTaskListener.java
│           └── resources
│               └── diagrams
│                   └── DocumentWorkflow.bpmn
├── LICENSE
├── pom.xml
├── README.md
└── simple-workflow
    ├── pom.xml
    └── src
        └── main
            └── resources
                └── diagrams
                    ├── DemoProcess1.bpmn
                    ├── DemoProcess2.bpmn
                    ├── DemoProcess3.bpmn
                    ├── DemoProcess4.bpmn
                    └── DocumentWorkflow.bpmn

</pre>

### 1) A set of simple demo processes
These small examples can be tested very easily by importing them into the "Activiti Repository" section fron XWiki's Administration interface.

1. Demo Process 1 - This is just the simplest bpmn file which you could have. It can be started only by the Admin user, It has only one task with a simple form, which is automatically assigned to the Admin user. This can be used by admins to verify if their installation of the application-activiti was successful 
2. Demo Process 2 - Another simple process modelling a parallel execution / Parallel Gateway combined with an Exclusive Gateway. This means that until all of the parallel executions are completed, the process will not advance to the next state. The process can be started only by members of the XWikiAdminGroup. It will fork the process into 2 active executions. **Both** tasks have to be completed in order to end the process instance execution
3. Demo Process 3 - This sample process shows the true power of the integration between Activiti and XWiki. It contains a Script Task node, which calls XWiki's API and prints a message into console. These nodes can be used to automate tasks which involve XWiki, e.g. creating pages, moving pages or basically everything which can be called from XWiki's API.
4. Demo Process 4 - The forms at their best ! The process is startable by the Admin user and all tasks are automatically assigned to Admin user. This process has 2 User Task nodes. The first one will use all the form fields supported by the integration. All of the fields will be input fields and some of them are required to emphasize the client side validation capability. The second User Task node will display the values entered in the previous node. All of the UI is compliant with XWiki's vertical form standard, making it consistent with the existing XWIki UI. 
 

### 2) Document workflow

This is a more complex document workflow scenario. It also uses Java as backend in order to make the process more dynamic and self-aware.

###For more details, please open the process definition files (*.bpmn) using the dedicated Eclipse plugin in order to see the process diagram and its details.
