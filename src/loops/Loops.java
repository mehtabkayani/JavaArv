package loops;

import java.util.Scanner;

public class Loops {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;

        while (loop) {

            System.out.println("How many starts do you want?");
            int tal = scan.nextInt();
            
            
            
            
            for(int i = 0; i < tal; i++){
                System.out.println("*");
                
            }

            System.out.println("do you want to try again? y/n");
            scan.nextLine();
          

            String svar = scan.nextLine();

            if (svar.equalsIgnoreCase("y")) {
                loop=true;
            } 
            else if (svar.equalsIgnoreCase("n")) {
                loop = false;
                System.out.println("Welcome back! Goodbye!");
            }

        }

    }

}
