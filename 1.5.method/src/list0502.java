class list0502 {
  public static void main(String args[]) {
    int add[]     = {10,30};
    String messe  = new String("文字表示メソッド");

    System.out.println("メソッドを呼び出し");
    hello("helloメソッド呼び出し");
    System.out.println("メソッドが正常に呼び出されました");

    plus(add);
    messe_print(messe);
  }
  public static void hello(String method_name){
    System.out.println(method_name);
    hello2("hello2メソッド呼び出し");
  }
  public static void hello2(String method_name){
    System.out.println(method_name);
  }
  public static void plus(int [] add){
    System.out.println("足し算:" + (add[0] +add[1]));
  }
  public static void messe_print(String messe){
    System.out.println(messe);
  }
}
