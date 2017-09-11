package Kimishima;
import  Kimishima.*;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス起動");

    // インスタンス
    Hero    he = new Hero();
//    Matango ma = new Matango('a');
    PoisonMatango pma = new PoisonMatango('b');

    // メソッド
    // ステータス
    he.showStatus();
//    ma.showStatus();
    pma.showStatus();
    // 攻撃
//    ma.attack(he);
    
    for (int i = 0;i < 6 ;i++) {
      pma.poisonAttck(he);
    }

    // 体力が減った確認
    he.showStatus();
  }
}
