package Kimishima;
import  Kimishima.Hero;
import  Kimishima.Monster;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス実行");

    // インスタンス
    Hero    he = new Hero();
    Monster mo = new Monster();
    
    // 最大設定
    he.setMax_hp(100);
    he.setMax_mp(30);
    mo.setMax_hp(50);
    mo.setMax_mp(10);

    // ステータス表示
    he.showStatus();
    mo.showStatus();

    // ヒーロ攻撃
    he.attck(mo);
    mo.showStatus();

    // 魔法攻撃
    he.magic_attck(mo);
    mo.showStatus();
 
    // 身を守る
//    he.protect();
//    he.showStatus();
    
    // モンスタ攻撃
    mo.attck(he);
    he.showStatus();
 
    // モンスタ魔法攻撃
    mo.magic_attck(he);
    he.showStatus();
    
    // 身を守る
    mo.protect();
    mo.showStatus();
 
    // 再度ステータス表示
    he.showStatus();
    mo.showStatus();
   
 }
}
