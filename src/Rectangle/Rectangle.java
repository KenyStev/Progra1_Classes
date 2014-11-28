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

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
        this.area=width*height;
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 23);
        //rect.width=10;
        //rect.height=23;
        //rect.area = rect.width * rect.height;
        System.out.println("Width: "+rect.width);
        System.out.println("Height: "+rect.height);
        System.out.println("Area: "+rect.area);
    }
}
