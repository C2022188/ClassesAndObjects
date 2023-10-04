/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Triangle;

/**
 *
 * @author caroo
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle tril1 = new Triangle(); // creating an object
        Triangle tril2 = new Triangle();
        Triangle tril3 = new Triangle();
        Triangle tril4 = new Triangle();
        Triangle tril5 = new Triangle();
        Triangle tril6 = new Triangle();
        
        int[] sideLenghts = new int [18];
        //the lengths of tril's sides will be first, then the lengths of tril2's sides etc
        
        sideLenghts [0] = 5;
        sideLenghts [1] = 8;
        sideLenghts [2] = 9;
        
        //tri5 (4,7,2)
        sideLenghts [12] = 4;
        sideLenghts [13] = 7;
        sideLenghts [14] = 2;
        
        //we want to set the middle side of each triangle to be 3
        sideLenghts [1] = 3;
        sideLenghts [4] = 3;
        sideLenghts [7] = 3;
        sideLenghts [10] = 3;
        sideLenghts [13] = 3;
        sideLenghts [16] = 3;
        
        Person sam = new Person ();
        sam.favTriangle = tril5;
        
        
    }
    
}
