/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Ninja
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    public abstract void setPrerequisites(String prerequisites);
    
    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    
    
    
}
