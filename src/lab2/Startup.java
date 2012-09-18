/*
 * Having to implement all the methods takes more time to complete.
 * This also means there are no mutable properties to use.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgrammingCourse itpc = new IntroToProgrammingCourse("Introduction To Programming","ITPC-4342");
        ProgrammingCourse ijc = new IntroJavaCourse("Introduction to Java","IJC-1324");
        ProgrammingCourse ajc = new AdvancedJavaCourse("Advanced Java","AJC-4523");
        
        itpc.setCredits(4);
        itpc.setPrerequisites("Introduction to Java");
        
        ijc.setCredits(4);
        ijc.setPrerequisites("Introduction to Programming");
        
        ajc.setCredits(4);
    }
}
