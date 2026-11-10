
package Inheritance;
import java.util.*;
class Shape{
    String color;
    Shape(String color){
        this.color = color;

    }
    void disp(){
        System.out.println("Color of Shape : " + color);

    }
}
class Reactangle extends Shape{
    int Lenght;
    int Width;
    Reactangle(String color,int Lenght,int Width){
        super(color);
        this.Lenght = Lenght;
        this.Width = Width;

    }
    void calculateArea(){
        int area = Lenght*Width;
        System.out.println("Area of Reactangle : " + area);
        System.out.println("Enter the  color of Shape: " + color);
        System.out.println("Enter the Lenght of the Reactangle : " + Lenght);
        System.out.println("Enter the Width of the Reactangle : " + Width);
        

    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  color of Shape: ");
                         String color = sc.nextLine();
                         
                         System.out.println("Enter the Lenght of the Reactangle ");
                       int Lenght= sc.nextInt();
                         System.out.println("Enter the Width of the Reactangle : " );
                         int Width = sc.nextInt();
                         System.out.println("Area of Reactangle: ");

                        Reactangle R = new Reactangle(color,Lenght,Width);
                        R.calculateArea();

    }
}