
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Berk Karaman
 */
public class GCD {
    public static int findGCD(int number1, int number2){
        
        int gcd = 1;
        
        for (int i = 1; i <= number1 && i <= number2 ; i++) {
            if ((number1 % i == 0) && (number2 % i == 0) ){
                
                gcd = i;
            }
           
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First Number : ");
        int first_number = scanner.nextInt();
        
        System.out.print("Second Number : ");
        int second_number = scanner.nextInt();
        System.out.println("GCD of Two Numbers : " + findGCD(first_number, second_number));
    }
    
}
