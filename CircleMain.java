/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.driver.s220596794;
import za.ac.wsu.s220596794.Circle;
/**
 *
 * @author 27767
 */
public class CircleMain {
    public static void main(String[]args){
         //creates 3 Circle objects
         Circle cS = new Circle();
         Circle cI = new Circle();
         Circle cY = new Circle();
         
         //set values to circle objects
         cS.setRadius(20);
         cS.setX(6);
         cS.setY(12);
         
         cI.setRadius(10);
         cI.setX(15);
         cI.setY(20);
         
         cY.setRadius(8);
         cY.setX(15);
         cY.setY(18);
         
         
        //displays the information of these circles
        System.out.println("Circle S information");
        displayInformation(cS);
        System.out.println("\nCircle I Infomation");
        System.out.println("\nCircle Y Informtion");
        displayInformation(cY);
        
    }
    /**
     * Displays information of circle
     * @param c
     */
    public static void displayInformation(Circle c){
        System.out.println("Radius:"+c.getRadius()+",Center:("+c.getX()+","+c.getY()+")");
        System.out.printf("Area:%.2f",c.calculateArea());
        System.out.printf("\nCircumferrnce:%.2f",c.calculateCircumference());
        System.out.printf("\nDiameter:%.2f",c.calculateDiameter());
        System.out.println();
    }
    
}
