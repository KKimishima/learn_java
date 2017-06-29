// 式と演算子

public class list201 {
  public static void main(String[] args) {
    /* エスケープシーケンス
      \"  : ”を認識しないための
      \`  : `を認識しないため
      \\  : \を認識しないため
      \n  : 改行
    */
    System.out.println("\"エスケープシーケンス\"の\'テスト\'です。");
    System.out.println("\\￥もこのように\n回避される");

    // ディクリメント・インクリメント
    int a = 0;
    int b = 0;
    a++;
    System.out.println(a);
    a--;
    System.out.println(a);
      // 前方インクリメントは式の実行前に+1される
    System.out.println("前方インクリメントの場合の50 + a = " + (++a + 50));
      // 後方インクリメントは式の実行後に+1がなされる
    System.out.println("後方インクリメントの場合の50 + a = " + (b++ + 50));

    // 型の変換
    /*  1.代入時の自動型変換
        2.明示的な型変換
        3.演算時の自動変換
    */
      // 1.代入時の自動変換
    float f = 3;
    double d = f; // 数値型でお起きれば変換できる
    System.out.println(f);
    System.out.println(d);

      // 2.明示的な型変換(キャスト変換)
    int g = (int)d; // 無理やり整数型に変換
    String h = "私の年齢は" + g + "さいだ"; // 文字型に変換してくれる

    System.out.println(g);
    System.out.println(h);

    // 命令
      /*代表的な命令
        コンソール出力
      System.out.println(式);
        大きい方を比較して代入する
      int m = Math.max(1,2);
        文字列を数値に変換
      int n = Integr.pareInt(値);
        乱数を発生させる
      int r = new java.util.Random().nexInt(数値の上限);
        キーボードからの入力
          文字列
      String inpt = new java.ulit.Scanner(System.in).nexLine();
          数値
      int inpt = new java.ulit.Scanner(System.in).nexLine();
      */
    // 大きい方を比較して代入する
    int aa = 1;
    int bb = 2;
    int max = Math.max(aa, bb);
    System.out.println(aa + "と" + bb + "では" + max + "の方が大きい");

    // 文字と数値のキャスト変換命令
    String cc = "123";
    int dd = 456;
    int nn = Integer.parseInt(cc);  // 文字列から数値 変換できないとエラー
    String ss = String.valueOf(d);  // 数値から文字列
    System.out.println("文字列から数値に変換 = " + cc);
    System.out.println("数値から文字に変換 = " + cc);

    // 乱数を発生させる
    int r = new java.util.Random().nextInt(100);
    System.out.println("0から100から乱数 = " + r);

    // キーボード入力
    System.out.println("文字列を入力してください");
    String inpStr = new java.util.Scanner(System.in).nextLine();
    System.out.println("入力した文字列は" + inpStr + "です");

    System.out.println("数値を入力してください");
    int inpInt = new java.util.Scanner(System.in).nextInt();
    System.out.println("入力した数値は" + inpInt + "です");
  }
}
