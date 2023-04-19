package Utils;


import org.apache.log4j.*;

public class Log {

    public  static  Logger log = Logger.getLogger(Log.class.getName());

    // when the test starts, I should print the logs
    // when my tests starts, I should print the logs
    // If I want to print any message in between, I should print the logs

    public static void startTestCase(String testCaseName){
        log.info("******************");
        log.info("******************");
        log.info("********"+ testCaseName + "*********");
    }
    public static void endTestCse(String testCaseName){
        log.info("######################################");
        log.info("######################################");
        log.info("#################"+ testCaseName+"#####################");
    }
    public static void info(String message){
        log.info(message);
    }
    public  static void warning(String warning) {
        log.info(warning);
    }

    //============================MAVEN LIFECYCLE================================

    //MAVEN LIFE CYCLE: This consists of several phase
    // Clean: Removes all the files generated by the previous build
    // Validate: Checks the projects is correct and all the necessary information is available
    // Compile: Compiles the source code of the project
    // Test: Runs the tests for the project
    // Package: Packages the compiled code into a distributable format, such as JAR or WAR files
    // Verify: Runs and checks on results of integration tests to ensure quality criteria is met
    // Install: Installs the packages into local repository
    // Site: generates documentation for the project
    // Deploy: Copies the final package to remote repository for sharing with other developers or projects
}
