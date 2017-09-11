package Kimishima;
import  Kimishima.Hero;
public class SuperHero extends Hero{
  private int mp;

  public int getMp(){
    return this.mp;
  }
  public void setMp(int mp){
    this.mp = mp;
  }

  public void fire(Monster mon){
    System.out.println(super.getName()  + "ファイヤー発動");
    mon.setHp(mon.getHp() - this.mp);
    System.out.println(mon.getName() + "は、" + this.mp  + "ポイントのダメージ");
  }
}
