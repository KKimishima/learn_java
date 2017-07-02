public class list301 {
  public static void main(String[] args) {
    // if 条件分岐 (C言語とほぼ同じ)
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("条件一致");
    } else {
      System.out.println("条件不一致");
    }
    // while 繰り返し処理
    int i = 0;
    while (i < 3) {
      i++;
      String str = "スコープテスト";
      /*
      ブロック内での変数宣言が可能 (C言語でもできる)
      ブロックのを出ると値は、廃棄される
      */
      System.out.println("繰り返し回数:" + i + "回目" + str);
    }
    // 値が廃棄されるの下記の処理は行うことができない
    // System.out.println(str);

    // 文字の比較
    // 文字列型の変数.equals(比較相手の数値)
    System.out.println("文字列を入力してください");
    String inpStr = new java.util.Scanner(System.in).nextLine();
    if (inpStr.equals("a")) {
      System.out.println("文字列一致");
    } else {
      System.out.println("文字列不一致");
    }
    // 複雑な条件分岐
    // 例.年齢が18以上,かつ男性
    // と年齢が16以上の女性のどちかのとき文字を返す
    System.out.println("年齢");
    int age = new java.util.Scanner(System.in).nextInt(); // 数値の場合は,Int
    System.out.println("性別");
    String sex = new java.util.Scanner(System.in).nextLine();
    if ((age >= 18 && sex.equals("男性")) || (age >= 16 && sex.equals("女性"))) {
      System.out.println("一致");
    } else {
      System.out.println("不一致");
    }

    // switch文の使い方
    int r = new java.util.Random().nextInt(4);
    System.out.println("ランダムの値" + r);
    switch (r) {
      case 0:
        System.out.println("大吉");
        break;
      case 1:
        System.out.println("中吉");
        break;
      case 2:
        System.out.println("吉");
        break;
      case 3:
        System.out.println("凶");
        break;
      default:
        System.out.println("エラー");
    }
  }
}
