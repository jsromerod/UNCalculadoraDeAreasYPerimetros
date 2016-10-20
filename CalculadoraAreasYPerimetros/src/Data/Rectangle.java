/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author joseb
 */
public class Rectangle extends Quadrilateral {

    public Rectangle(double base, double high) {
        super(base, high, base, high);
        this.buildId();
    }

    @Override
    public void calculateArea() {
        double a = this.getSide1() * this.getSide2();
        this.setArea(a);
    }

    @Override
    public void buildId() {
        this.setId("Rectangle");
    }

}
