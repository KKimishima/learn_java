public class list3012 {
  public static void main(String[] args) {
    // 基本的for文
    for (int i = 0; i < 3;  i++ ) {
      System.out.println((i +1) + "回目表示");
    }
    // 二重for文
    for (int i = 1; i <= 9;  i++) {
      for (int j = 1;j <= 9;j++) {
        System.out.println(i + "x" + j + "=" + (i * j));
      }
    }
    //  無限ループ(break)
    int a = 1;
    while (true) {
      System.out.println(a + "回目無限ループ");
      if (a == 3) {
        break;
      }
      a++;
    }
    //  無限ループ(continue)
    // これだと無限ループになる
    // 下のインクリメントにたどり着かず永遠にループ
    int b = 1;
    while (true) {
      System.out.println(b + "回目無限ループ");
      if (b == 3) {
        continue;
      }
      b++;
    }
  }
}
