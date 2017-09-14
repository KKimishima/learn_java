package Kimishima;
import  Kimishima.*;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス実行");
    // 多態性の実現
    Character mon  = new Monster("モンスター",30);
    Character hero = new Hero("勇者",150);

    hero.run();
    hero.test();
    hero.attct(mon);
    hero.showStatus();
    
    mon.run();
    mon.test();
    mon.attct(hero);
    mon.showStatus();
   
  }
}
