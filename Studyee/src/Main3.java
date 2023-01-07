import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main3 {

 
    public static void main(String[] args) throws Exception {
 
       Scanner sc = new Scanner(System.in);
       
       int price, count;
       price = sc.nextInt();
       count = sc.nextInt();
       
       int product[][] = new int[count][2];
       
       int comp = 0;
       
       for(int i=0;i<product.length;i++) {
    	   product[i][0] = sc.nextInt();
    	   product[i][1] = sc.nextInt();
    	   comp+=product[i][0] * product[i][1];
       }
       if(price == comp) {
    	   System.out.println("Yes");
       }else {
    	   System.out.println("No");
       }
    }
}