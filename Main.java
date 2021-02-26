import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    counting(10);
    acceptValidinput(scan);
    System.out.println("Your input is valid");
  }

  //counting recursion
  public static void counting(int a){
    if(a == 0){
      System.out.println("Done, I can't remember anything else!");
    }else{
      System.out.println(a);
      a--;
      counting(a);
    }
  }

  public static void acceptValidinput(Scanner scan){
    System.out.println("Print a number that is greater than 10");
    int i = scan.nextInt();

    if(i <= 10){
      acceptValidinput(scan);
    }
  }
}