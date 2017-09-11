package Kimishima;
import  Kimishima.Wand;
import  Kimishima.Hero;

public class Wizard{
  private int hp;
  private int mp;
  private String name;

  // 定数 
  private final int max_hp = 80;
  private final int max_mp = 80;
  // Wandクラスから紐付け
//  Wand wand = new Wand("魔法の杖",1.5);
  //private Wand wand;
  private Wand wand;

  // コンストラクタ
  public Wizard(){
    this.name = null;
    this.hp = 0;
    this.mp = 0;
    System.out.println(this.name + "が、インスタンスされました");
  }
  
  // メソッド
  // 名前のメソッド
  public void setName(String name){// setterメソッド
    if (name == null || (name.length() > 10 || name.length() == 0)){
      throw new IllegalArgumentException
        ("不正な名前の規則です");
    }
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  // HPのメソッド
  public void setHp(int hp){
   if (hp < 0 || hp > this.max_hp){
    throw new IllegalArgumentException
      ("不正なHPの値です");
    }
    this.hp = hp;
  }
  public int getHp(){
    return this.hp;
  }

  // MPのメソッド
  public void setMp(int mp){
   if (mp < 0 || mp > this.max_mp){
    throw new IllegalArgumentException
      ("不正なMPの値です");
    }
    this.mp = mp;
  }
  public int getMp(){
    return this.mp;
  }

  // wandのメソッド
  public void setWand(Wand wand){
    if (wand == null){
      throw new IllegalArgumentException
        ("設定されようとしている杖がぬるです");
    }
    this.wand = wand;
  }
  public Wand getWand(){
    return this.wand;
  }

  public void heal(Hero h){
    int costMpPoint = 5;
    int basePont = 10;
    int addPoint = (int)(basePont * wand.getPower());

    h.setHp(h.getHp() + addPoint);  // 回復
    this.mp -= 5;
    System.out.println(this.name + "は、ヒール発動");
    System.out.println(this.name + "は、MPを" + costMpPoint + "ポイント消費した");
    System.out.println(h.getName() + "は、" + addPoint + "回復した");
  }
  
  public void printStatus(){
    System.out.println("************");
    System.out.println("名前:" + this.name );
    System.out.println("HP:" + this.hp + "/" + this.max_hp);
    System.out.println("MP:" + this.mp + "/" + this.max_mp);
    System.out.println("武器:" + this.wand.getName());
    System.out.println("武器:" + this.wand.getPower());
    System.out.println("************");
  }
}
