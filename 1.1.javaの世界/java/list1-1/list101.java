// list1-1
// プログラムの骨格

/*  コメントの書き方
 ソースの書き順
 1.メインブロックを書く
 2.メソッドブロックの書く
 3.内容をもりもり書いていく
*/
public class list101{ //クラスブロック
  // 解説.文法
  //      最初クラス名は、ファイル名と同じにする
  //      ここでは、クラスの宣言を行なっている
  public static void main(String[] args){ //メソッドブロック
  // 解説.文法
  //      mainはmainメソッドと呼ばれる
  //      mainの(string[] args)は必ず宣言する
  //      staiticはおいおい調べる
    System.out.println("HelloWolrd");
    // System.out.println("HelloWolrd");はコンソール出力ようメソッド

    // 変数宣言
    int age;  // 整数型
    age = 30;
    // 数値出力
    System.out.println(age);

    int a = 40; // 宣言と初期化
    System.out.println(a);

    double b = 1.2; // 実数型
    float c = 67.5F;  // 不動少数型
    boolean d = true; // 真偽型
    char e = 'A';     // 文字型
    String f = "AAABBB"; // 文字列型
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    // 定数宣言
    final int g = 1;
    // g = 2; // これを行うとエラーになる
    System.out.println(g);
  }
}
