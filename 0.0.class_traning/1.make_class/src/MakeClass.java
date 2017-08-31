// クラスの作成練習
package Kimishima;
import  java.util.Random;

class MakeClass {
  public static void main(String args[]) {
    System.out.println("メインクラス実行");
    // 型の宣言
    Hero player;  // ヒーロークラス
    Monster emeny;// モンスタークラス
    int random_value;
    int ap_value;
    // インスタンス
    player = new Hero();
    emeny = new Monster();

   random_value =  random_init();
   System.out.println("ランダム生成" + random_value);
   emeny.damege(player.attck(random_value));
  }
  static public int  random_init(){
    // Randクラスのインスタンス
    Random rm = new Random();

    return rm.nextInt(3) + 1;
  }
}
