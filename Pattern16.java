import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
