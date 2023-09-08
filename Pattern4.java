import java.util.Scanner;

public class Pattern4 {
        public static void main(String []args){

            Scanner sc = new Scanner(System.in);
            int rows =sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print("    "); // Print spaces for indentation
                }
                for (int j = 0; j <= i; j++) {
                  
                    System.out.print("*   ");
                }
                System.out.println(); // Move to the next line for the next row
            }
        }
}