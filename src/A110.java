import java.util.Scanner;

public class A110 {
   public static void main(String args[]) {
      System.out.println("달을 입력하세요(1~12)");
      Scanner scanner = new Scanner(System.in);
      
      int x = scanner.nextInt();
      switch(x) {
      case 3: case 4: case 5:{
    	  System.out.println("봄");
    	  break;
      }
      case 6: case 7: case 8:{
    	  System.out.println("여름");
    	  break;
      }
      case 12: case 1: case 2:{
    	  System.out.println("겨울");
    	  break;
      }
      
      default:{
    	  System.out.println("잘못입력");
    	  
      }
      scanner.close();
      
   }
}
}