import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
  int number1=scanner.nextInt();
  int number2=scanner.nextInt();
  int cem1=0,cem2=0;
  for (int i=1;i<number1;i++) {
      if(number1%i==0) {
          cem1+=i;
      }
  }
  for (int j=1;j<number2;j++) {
            if(number2%j==0) {
                cem2+=j;
            }
        }
  if(number1==cem2 && number2==cem1) {
      System.out.println("This numbers are friend numbers");
  }
  else {
      System.out.println("This numbers aren't friend numbers");
  }

    }
}