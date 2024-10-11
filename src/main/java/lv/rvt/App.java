package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a numbers: ");

        while (true) {
        
        int num = Integer.valueOf(scanner.nextLine());
            
        if (num == -1) {
            break   ;
        } 

        else{
            sum += num;
            count++;
                if (num % 2 == 0) {
                    even++;
                }

                else{
                    odd++;
                }
        }
        }
        
        double average = sum/count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);



        
    }
}
