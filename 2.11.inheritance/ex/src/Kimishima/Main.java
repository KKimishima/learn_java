package Kimshima;
import  Kimishima.Hero;
import  Kimishima.Monster;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス実行");

    // インスタンス
    Hero    he = new Hero();
    Monster mo = new Monster();
    
    // 最大設定
    he.setMax_hp = 100;
    he.setMax_mp = 30;
    mo.setMax_hp = 50;
    mo.setMax_mp = 10;

    // ステータス表示
    he.showStatus();
    mo.showStatus();

    // ヒーロ攻撃
    he.attck(mo);
    he.magic_attck(mo);
    he.protect();

    // モンスタ攻撃
    mo.attck(he);
    mo.magic_attck(he);
    mo.protect();
 }
}
