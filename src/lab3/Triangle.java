/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ninja
 */
public abstract class Triangle implements Shape{
    private double angleA;
    private double angleB;
    private double angleC;
    
    private double hypotenuse;
    private double opposite;
    private double adjacent;
    
    public static final int NUM_SIDES = 3;
    
    public boolean checkAngles(int angleA, int angleB, int angleC){
        if ((angleA + angleB + angleC) == 180){
            this.angleA = angleA;
            this.angleB = angleB;
            this.angleC = angleC;
            return true;
        }else
            {
                return false;
            }
    }

    public abstract void setAngleA(double angleA);
    public abstract void setAngleB(double angleB);
    public abstract void setAngleC(double angleC);
    public abstract void setHypotenuse(double hypotenuse);
    public abstract void setOpposite(double opposite);
    public abstract void setAdjacent(double adjacent);
    
    public double getAngleOne() {
        return angleA;
    }

    public double getAngleTwo() {
        return angleB;
    }

    public double getAngleThree() {
        return angleC;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getOpposite() {
        return opposite;
    }

    public double getAdjacent() {
        return adjacent;
    }

}
