/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public class Scalene extends Triangle{
    
    public Scalene(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public void buildId() {
        this.setId("Scalene triangle");
    }
    
}
