package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int number = Integer.valueOf(scanner.nextLine());
        int time = 0;
        while (time < number) {
            printText();
            time = time + 1;
        }
        
       
      
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
}
