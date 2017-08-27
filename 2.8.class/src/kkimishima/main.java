// ゲームの操作を行うメインクラス
//
package kkimishima;
import  kkimishima.game.ch.*;
//import  kkimishima.game.mon.*;

class game_main {
  public static void main(String args[]) {
    // 1.ヒーロクラスのインスタンス作成
    hero player1 = new hero();
    // 2.フィールドに初期値を入力
    player1.hp = 100;
    player1.name = "ななしのごんべい";

    System.out.println("勇者\"" + player1.name + "\"を生み出した");
    
    // 4. モンスタクラスのインスタンス作成
    monsterInfo mo1 = new monsterInfo();

    mo1.hp = 20;
    mo1.suffix = 'A';

    System.out.println("もんすた\"" + mo1.suffix + "\"を生み出した");
    monsterInfo mo2 = new monsterInfo();

    mo2.hp =30;
    mo2.suffix = 'B';
     
    System.out.println("もんすた\"" + mo2.suffix + "\"を生み出した");
    // 5.もんたクラスのメソッド
    mo1.run();
    mo2.run();

    // 3.メソッドの呼び出し
    player1.sit(5);   // ５秒座る
    player1.sleep();  // 寝て回復
    player1.slip();   // 転ぶ
    player1.run();    // 逃げて終わり
  }
}
