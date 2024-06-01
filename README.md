
# saucedemo Automation Project



## Description

This automation project is created using Selenium WebDriver to perform automated testing on the https://www.saucedemo.com/ website. The automation scripts cover the following functionalities:

* Login to the website
* Select a product and add it to the cart
* Overview the product and confirm purchase
* Go back to the homepage
* Logout


## Environment Setup

To run this project locally, follow these steps:

- Install Java Development Kit (JDK)
- Install Eclipse IDE for Java Developers
- Install Apache Maven
- Clone the project from Git using the command:

```git clone <repository_URL>```

### Download and install the latest JDK from the Oracle website: Java SE Downloads

- Set up the JAVA_HOME environment variable.

### Install Eclipse:

- Download and install Eclipse IDE for Java Developers: Eclipse Downloads
- Launch Eclipse and set up the workspace.

### Install Maven:

- Download and install Apache Maven from the official website: Maven Downloads
- Set up the MAVEN_HOME and M2_HOME environment variables.
- Clone the Project from Git
## Running the Project in Eclipse:
1. Import Project into Eclipse:
- Open Eclipse IDE.
- Go to File -> Import.
- Choose Existing Maven Projects.
- Browse and select the root directory of the cloned saucedemo project.
- Click Finish to import the project into Eclipse.
2. Set Up Dependencies:
- The project uses Selenium WebDriver for automation. Ensure the necessary Selenium dependencies are added to the pom.xml file.