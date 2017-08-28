// メインクラス
package icloud.kimishima.ClassField;
import  icloud.kimishima.ClassField.Weapon.*;
import  icloud.kimishima.ClassField.Cha.*;

public class GameMain {
  public static void main(String args[]) {
    // 剣のインスタンス
    Sword ken = new Sword();
    ken.name = "鋼の剣";
    ken.damage = 5;
    ken.sword_status();
    // 同一のインスタンスを指す変数
    // インスタンスは参照なので下記の処理を行うと
    // ２つの変数が一つのインスタンスを参照する
    
    // 型を宣言する
    Sword ken2;
    ken2 = ken;
    // 参照先を"鋼の剣"から書き換え
    ken2.name = "黄金の剣";
    System.out.println("\n参照書き換え ken.name :" + ken.name );
    // 参照を切る
    ken2 = null;
    
    // ヒーローのインスタンス
    // コンストラクトに引数を与える
    Hero player1 = new Hero("勇者");
    player1.status();

    // コンストラクト引数あり
    Hero player2 = new Hero();
    player2.status();

    // 静的変数の確認
    // ２つのインスタンスで変更が共有される
    player1.dropMoney();

    player1.status();
    player2.status();

    // swordフィールドに生成済みの剣インスタンスのアドレスを代入
    player1.sword = ken;
    System.out.println("ヒーロクラスからソードクラスを繋いで表示:" + player1.sword.name);
    
    // オブジェクトを引数にしてクラスに渡す
    // ウィザードのインスタンス
    Wizard player3 = new Wizard();
    player3.name = "魔術師";
    player3.heal(player2);

  }
}
