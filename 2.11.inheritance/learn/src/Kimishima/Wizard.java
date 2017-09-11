package Kimishima;

public class Wizard extends SuperHero{
  // オーバライド
  public void fire(Monster mon){
    int attckPoint = (int)(this.getMp() * 1.4);
    System.out.println( "灼熱ファイヤー発動");
    mon.setHp(mon.getHp() - attckPoint);
    System.out.println(mon.getName() + "は、" + attckPoint  + "ポイントのダメージ");
  }
}
