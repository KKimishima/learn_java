package Kimishima;
import  Kimishima.Hero;
import  Kimishima.Wizard;
import  Kimishima.Wand;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス実行");
    // インスタンス
    Hero    player1    = new Hero("勇者",50,20);
    Wizard  player2    = new Wizard();
    Wand    buki       = new Wand();
    
    player2.setWand(buki);
    
    player1.printStatus();      // ステータス表示
     
    // 賢者の設定
    //System.out.print("賢者の名前:");
    //player2.setName(new java.util.Scanner(System.in).nextLine());
    player2.setName("賢者");  // デバッグ用
    //System.out.print("賢者のHP:");
    //player2.setHp(new java.util.Scanner(System.in).nextInt());
    player2.setHp(40);        // デバッグ用
    //System.out.print("賢者のMP:");
    //player2.setMp(new java.util.Scanner(System.in).nextInt());
    player2.setMp(40);        // デバッグ用
    //System.out.print("武器名:");
    //player2.setMp(new java.util.Scanner(System.in).nextInt());
    player2.wand.setName("杖");        // デバッグ用
    //System.out.print("武器の強さ:");
    //player2.setMp(new java.util.Scanner(System.in).nextInt());
    player2.wand.setPower(0.7);        // デバッグ用
  
    player2.printStatus();
    
    // 回復
    player2.heal(player1);
    player2.printStatus();
    player1.printStatus();
    
  }
}

