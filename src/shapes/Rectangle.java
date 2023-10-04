/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author caroo
 */
public class Rectangle extends Shape{
    
    private String colour;
    private boolean isFilled;
    private double height = 5.0;
    private int width = 6;

    public double getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return width*height;
        
    }
    
}
