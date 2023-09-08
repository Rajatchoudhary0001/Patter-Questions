import java.util.Scanner;

public class Pattern10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int m =sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<i; j++){
                System.out.print("   ");
            }
            for(int j=i; j<=m; j++){
                System.out.print("*  ");
            }
            for(int k=i;k<=m-1; k++ ){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
}
