import Graphics.*;
import java.util.Scanner;

public class Graphicsmain {
    public static void main(String [] args){
        double r,l,b,h,sum=0,s;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("circle area");
        System.out.println("enter the radius of the circle");
        r=sc.nextDouble();
        Graphics.graPkg cir=new Graphics.cirArea(r);
        sum=cir.Area();
        System.out.println(sum);

        System.out.println("reactangle area");
        System.out.println("enter the length and breadth of the rectangle");
        l=sc.nextDouble();
        b=sc.nextDouble();
        Graphics.graPkg rect=new Graphics.rectArea(l,b);
        sum=rect.Area();
        System.out.println(sum);

        System.out.println("Triangle area");
        System.out.println("enter the breadth and height of the triangle");
        b=sc.nextDouble();
        h=sc.nextDouble();
        Graphics.graPkg tri=new Graphics.rectArea(b,h);
        sum=tri.Area();
        System.out.println(sum);

        System.out.println("square area");
        System.out.println("enter the side of the square");
        s=sc.nextDouble();
        Graphics.graPkg sq=new Graphics.cirArea(s);
        sum=sq.Area();
        System.out.println(sum);

    }
    
}
