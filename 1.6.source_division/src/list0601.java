class list0601 {
  public static void main(String args[]) {
    int value1  = 100;
    int value2  = 20;

    int total   = method1(value1,value2);
    int delta   = method2(value1,value2);

    System.out.println("足すと:" + total + "\n引くと:" + delta);
  }
  public static int method1(int value1,int value2){
    return value1 + value2;
  }
  public static int method2(int value1,int value2){
    return value1 - value2;
  }
}
