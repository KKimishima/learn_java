// オーバーロードを使ってみる
// 仮引数が異なれば同じ名前のメソッドを複数適宜できる
//
class list0510 {
  // 正数のメソッド
  public static int add(int value1,int value2){
    return value1 + value2;
  }
  // 実数のメソッド
  public static double add(double value1,double value2){
    return value1 + value2;
  }
  // 文字連結のメソッド 
  public static String add(String value1,String value2){
    return value1 + value2;
  }
  // 引数が３つのとき
  public static int add(int value1,int value2,int value3){
    return value1 + value2 + value3;
  }
  // 返り値なしのメソッド呼び出し
  public static void add(){
    System.out.println("返り値なしのメソッド");
  }
  // メイン
  public static void main(String args[]) {
    // 正数メソッドをオーバーロード
    System.out.println("正数ののメソッド:" + add(1,2));
    // 実数のメソッドをオーバーロード
    System.out.println("実数のメソッド:" + add(1.1,1.2));
    // 文字連結のメソッド
    System.out.println("文字連結のメソッド:" + add("Hello","World"));
    // 引数の個数を変更
    System.out.println("引数の3のメソッド:" + add(1,2,3));
    // 返り値なしの場合
    add();
  }
}
