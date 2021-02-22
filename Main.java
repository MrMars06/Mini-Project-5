import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("What do you want your first value to be for recursion #2? to be?");
    int valOne = scan.nextInt();
    System.out.println("What do you want your second value for recursion #2 to be?");
    int valTwo = scan.nextInt();

    counting(10);
    addition(5);
  }

  //test
  public static void counting(int a){
    if(a == 0){
      System.out.println("Done, I can't remember anything else!");
    }else{
      System.out.println(a);
      a--;
      counting(a);
    }
  }

  //another test
  public static void addition(int b){
    if(b == 0){
      System.out.println("Done!");
    }else{
      System.out.println(valOne + valTwo);
      b--;
      addition(b);
    }
  }
}