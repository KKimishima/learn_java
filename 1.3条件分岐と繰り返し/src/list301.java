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
    while (i <= 3) {
      i++;
      System.out.println("繰り返し回数:" + i + "回目");
    }
  }
}
