import java.util.Scanner;

public class Pattern7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int m =sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m; j++){
              if(i==1 || i==m || j==1 || j==m){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            

            }
            System.out.println();
        }
    }
    
}
