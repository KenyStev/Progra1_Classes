/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author zerokull
 */
public class Rectangle {
    public double width, height, area;
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width=10;
        rect.height=23;
        rect.area = rect.width * rect.height;
        System.out.println("Area: "+rect.area);
    }
}
