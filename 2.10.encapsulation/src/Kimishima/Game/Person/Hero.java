package Kimishima.Game.Person;
import  Kimishima.Game.Weapon.*;

public class Hero{
  private int     hp;   // HP
  private String  name; // 名前
  static  int     money = 1000;  //所持金
  static public Sword sword;

  public void status(){
    System.out.println("******************");
    System.out.println("キャラのステータス");
    System.out.println("名前  " + this.name);
    System.out.println("HP   " +  this.hp + "ポイント");
    System.out.println("所持金" + Hero.money + "ゴールド");
    System.out.println("******************");
  }

  // コンストラクタ
  // 名前を引数にする
  public  Hero(String name){
    this.hp  = 100;
    this.name = name;
    System.out.println("\nキャラクター:" + this.name + "を作成!!!\n");
  }
  // コンストラクタ
  // 引数無し
  public Hero(){
    this.hp = 100;
    this.name = "勇者ヨシヒコ";
    System.out.println("\nキャラクター:" + this.name +  "を作成!!!\n");
  }

}
