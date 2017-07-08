public class list0402 {
  public static void main(String[] args) {
    // 配列の宣言
    int[] a;
    // 配列のインスタンス
    a = new int[5];
    // 配列の宣言省略
    int[] b = new int[5];
    // 配列の要素数
    int c = b.length;
    System.out.println("bの配列要素は" + c + "です");
    // 配列の要素に代入
    int[] d = new int[5];
    for (int i = 0;i < d.length;i++) {
      d[i] = i;
    }
    for (int j = 0;j < d.length;j++) {
      System.out.println("d[" + j +"]" + "=" + d[j]);
    }
    // 配列要素の宣言省略
    int[] e = new int[] {10,20,30,40};
    for (int k = 0;k < e.length;k++) {
      System.out.println("e[" + k +"]" + "=" + e[k]);
    }
  }
}
