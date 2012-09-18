/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Ninja
 */
public class RightTriangle extends Triangle{
    private double angleA;
    private double angleB;
    private double angleC;
    
    private double hypotenuse;
    private double opposite;
    private double adjacent;
    
    RightTriangle(double angleA,double angleB, double angleC){
        this.setAngleA(angleA);
        this.setAngleB(angleB);
        this.setAngleC(angleC);
    }
    
    @Override
    public final void setAngleA(double angleA) {
        //validation required
        this.angleA = angleA;
    }

    @Override
    public final void setAngleB(double angleB) {
        //validation required
        this.angleB = angleB;
    }

    @Override
    public final void setAngleC(double angleC) {
        if(angleC == 90){
            this.angleC = angleC;
        }else{
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }

    @Override
    public void setHypotenuse(double hypotenuse) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOpposite(double opposite) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAdjacent(double adjacent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double area() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double volume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double coordinates(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
