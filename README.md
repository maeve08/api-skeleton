# **Zendesk Coding Challenge**

## Technologies Used
    Java 1.8
    Gradle 5
    
## IDE Plugins
### IntelliJ
    
       
## Setting up Local Environment
    
```
 To run through command line 
 gradle clean build run
 
 Or run it with gradle wrapper
 ./gradlew clean build run
 
 Notes: gradle commands can be run using gradle or ./gradlew

```

### Running the application
```
Few ways to run the application.

You may run the application using the generated JAR file:
1. Go to root directory of the projec
2. Run the following command.
    java -jar ./build/libs/coding-challenge-1.0-SNAPSHOT.jar
    
You may also run the application using gradle
    gradle run

Or using Gradle Wrapper
    ./gradlew run     
  
```

#####Build application
    Navigate to ProjectRootDir on the command window and execute the following commands
    ./gradlew clean build
    
    idea users
    ./gradlew idea    
     
    Run test as the following
    ./gradlew test
    
## How to Use
1. For options to Press or Select 1, 2, or 3, the 'Enter' key need to be pressed after the selected key to register the selection.
2. After the searching or viewing all fields, a user will be asked to choose options again.
    This action is recursive until the user Type 'quit'.

## Assumptions
1. User is related to Organization through organization_id
2. User is related to Tickets through submitter_id
3. Organization is related to User through _id as organization_id
4. Organization is related to Tickets through _id as organization_id
5. Ticket is related to User through submitter_id as id in User
6. Ticket is related to Organization through organization_id as _id in Organization
