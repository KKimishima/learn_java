package Kimishima.Game;
import  Kimishima.Game.Person.*;

public class GameMain{
  public static void main(String args[]){
      // 変数宣言
    String  playerName;   // キャラクター名前
    Hero    playChar;      // 操作するキャラ

    System.out.println("***");
    System.out.println("ゲームスタート");
    System.out.println("***");

    // キャラクター作成
    System.out.println("キャラクター名を入力してください");
    System.out.print("キャラクタ名:");
    playerName = new java.util.Scanner(System.in).nextLine(); // 名前入力   
    playChar = new Hero(playerName);                          // インスタンス
    playChar.status();                                        // ステータスメソッド

  }
}
