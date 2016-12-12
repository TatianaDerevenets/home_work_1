package hillel;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length cathetus of a right triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the length of the second cathetus: ");
        int b = sc.nextInt();
        double s =(double) a * b / 2;
        System.out.println("Area of a triangle: " + s);
        double c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
        double p = a + b + c;
        System.out.println("Perimeter of the triangle: " + p);
    }
}
