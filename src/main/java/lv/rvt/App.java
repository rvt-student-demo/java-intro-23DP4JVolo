package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

 
        int sum = 0;
        int sk = 0;
        while(true){

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 0) {
            System.out.println("Number of numbers: " + sk);
            System.out.println("Sum of the numbers: " + sum);
            break;
        }  else{   
            sk = sk + 1;
            sum = sum + number;
            }
        }
    }
}
