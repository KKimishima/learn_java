// モンスターの情報
package kkimishima.game.ch;

public class monsterInfo{
  public int       hp;         // ヒットポイント
  // 定数宣言
  final int LEVEL = 10; //モンスタのレベル
  public char suffix;

  public void run(){
    System.out.println("モンスター" + this.suffix + "逃げ出した");
  }

}
