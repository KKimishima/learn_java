package Kimishima.Game;
import  Kimishima.Game.Person.*;
import  Kimishima.Game.Weapon.*;

public class GameMain{
  public static void main(String args[]){
      // 変数宣言
    String  playerName;   // キ:wャラクター名前
    Hero    playChar;      // 操作するキャラ
    Sword   buki;         // 装備

    System.out.println("***");
    System.out.println("ゲームスタート");
    System.out.println("***");

    // 武器のインスタンス
    buki = new Sword();

    // キャラクター作成
    System.out.println("キャラクター名を入力してください");
    System.out.print("キャラクタ名:");
    playerName = new java.util.Scanner(System.in).nextLine(); // 名前入力   
    playChar = new Hero(playerName);                          // インスタンス
    playChar.status();                                        // ステータスメソッド
    //buki = new Sword();
    Hero.sword = buki;
  }
}
