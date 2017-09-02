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
   Battel(player,emeny,random_value);
   emeny.status();
   //emeny.damege(player.attck(random_value));
  }
  static public int  random_init(){
    // Randクラスのインスタンス
    Random rm = new Random();

    return rm.nextInt(5) + 1;
  }
  static public void Battel(Hero player,Monster emeny,int random_value){
    System.out.println("クラスの受け渡しテスト");
    player.attck(random_value);
    emeny.damege(random_value);
  }
}
