class Main {
  public static void main(String[] args) {
    counting(5);
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
}