package Kimishima;

public class Main {
  public static void main(String args[]) {
    // 何もないインスタンスを作成できる  
    // クラスを定義する際に親クラスがない場合,
    // 自動的にjava.lang.Objectを親クラスとして継承される
    Empty e = new Empty();    // 下記のメソッドを使える
    String s = e.toString();  //自分自身の内容を文字列で返す
            // e.equals();    //インスタンスと比較

    // 大本のオブジェクト使用して多変性をつかい
    Object o1 = new Empty();
    Object o2 = "こんにちわ";
    Object o3 = 123;

    System.out.println(s);
    System.out.println(o1.toString());
    System.out.println(o2);
    System.out.println(o3);
  }
}
