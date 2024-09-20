package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        //Koda sakums
        Scanner scanner = new Scanner(System.in);

        


        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());


        int suma = first + second;
        int minus = first - second;
        int multi = first * second;
        double del = first / second;

        System.out.println(first + "+" + second + "=" + suma);
        System.out.println(first + "-" + second + "=" + minus);
        System.out.println(first + "*" + second + "=" + multi);
        System.out.println(first + "/" + second + "=" + del);


       




        //Koda beigas
    }
}
