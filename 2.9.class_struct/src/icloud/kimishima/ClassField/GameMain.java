// メインクラス
package icloud.kimishima.Classfield;
//package icloud.kimishima.classfield.Sword;
import  icloud.kimishima.classfield.Weapon.*;
import  icloud.kimishima.classfield.Cha.*;
//package icloud.kimishima.classfield.Hero;
//import  icloud.kimishima.classfield.Hero;

public class GameMain {
  public static void main(String args[]) {
    // 剣のインスタンス
    Sword ken = new Sword();
    ken.name = "鋼の剣";
    ken.damage = 5;
    ken.sword_status();
    // ヒーローのインスタンス
    Hero player = new Hero();
    player.name = "ヒーロー";
    player.hp = 100;
  }
}
