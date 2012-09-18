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
    private double angleOne;
    private double angleTwo;
    private double angleThree;
    
    private double hypotenuse;
    private double opposite;
    private double adjacent;
    
    public static final int NUM_SIDES = 3;
    
    public void setAngles(int angleOne, int angleTwo, int angleThree){
        if ((angleOne + angleTwo + angleThree) == 180){
            this.angleOne = angleOne;
            this.angleTwo = angleTwo;
            this.angleThree = angleThree;
        }
    }

    public double getAngleOne() {
        return angleOne;
    }

    public abstract void setAngleOne(double angleOne);

    public double getAngleTwo() {
        return angleTwo;
    }

    public abstract void setAngleTwo(double angleTwo);

    public double getAngleThree() {
        return angleThree;
    }

    public abstract void setAngleThree(double angleThree);

    public double getHypotenuse() {
        return hypotenuse;
    }

    public abstract void setHypotenuse(double hypotenuse);

    public double getOpposite() {
        return opposite;
    }

    public abstract void setOpposite(double opposite);

    public double getAdjacent() {
        return adjacent;
    }

    public abstract void setAdjacent(double adjacent);
    
    
    
}
