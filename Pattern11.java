import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
           for(int j=n-i; j>1 ;j--){    // if 5 value then first row take 3 gap
               
              System.out.print(" ");
           }

          for(int j=0; j<=i; j++){
            System.out.print("* ");
          }
          System.out.println();
        }
        
   
    } 
    
}

