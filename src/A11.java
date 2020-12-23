import java.util.Scanner;

public class A11 {
   public static void main(String args[]) {
      System.out.println("달을 입력하세요(1~12)");
      Scanner scanner = new Scanner(System.in);
      
      int x = scanner.nextInt();
      
      if(x>=3 && x<=5) {
    	  System.out.println("봄");
      }
      else if(x>=6 && x<=8) {
    	  System.out.println("여름");
    	  
      }
      else if(x==12 || x==1 || x==2) {
    	  System.out.println("겨울");
     
   }
      else {
    	  System.out.println("잘못입력");
      }
      scanner.close();

}
}