import java.util.Scanner;

public class Stam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double CONVERTING_F = 1.8;
        System.out.println("celsius to fahrenheit ");


        System.out.println("Enter degree value in C:");
        int c = s.nextInt();
        //C -> F : C*(1.8) + 32
        double result = c * CONVERTING_F +32;
        System.out.println("The C is:"+c+"\nin F is="+result);
    }
}
