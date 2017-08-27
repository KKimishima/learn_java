// ゲームの操作を行うメインクラス
//
package game.main;
import game.charC.*;

class game_main {
  public static void main(String args[]) {
    // 1.ヒーロクラスのインスタンス作成
    hero player1 = new hero();
    // 2.フィールドに初期値を入力
    player1.hp = 100;
    player1.name = "ななしのごんべい";

    System.out.println("勇者\"" + player1.name + "\"を生み出した");

    // 3. 
  }
}
