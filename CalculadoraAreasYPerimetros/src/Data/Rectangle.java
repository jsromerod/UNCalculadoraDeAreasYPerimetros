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
public class Rectangle {

    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}