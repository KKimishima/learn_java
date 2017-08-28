// ヒーローのクラス
package icloud.kimishima.ClassField.Cha;
import  icloud.kimishima.ClassField.Weapon.*;
public class Hero {
  public String  name;
  public int     hp;
  static public int money = 1000;
  // ソードクラスから引っ張ってくる
  public Sword sword;

  public void dropMoney(){
    money -= 100;
    System.out.println("\n" + this.name + "は,お金を落とした\n");
  } 

  public void attack(){
    System.out.println(this.name + "は攻撃した!");
    System.out.println("敵に5ポイントのダメージ");
  }
  
  public void status(){
    System.out.println("\n" + this.name + "ステータスを表示");
    System.out.println("HP =" + this.hp);
    System.out.println("お金 =" + this.money + "\n");
  }

  // コンストラクタの実行
 public  Hero(String name){
    this.hp = 100;
    this.name = name;
    System.out.println("\n" + this.name + "のインスタンスを作成\n");
  }
 public Hero(){
    this.hp = 100;
    this.name = "勇者ヨシヒコ";
    System.out.println("\n" + this.name + "のインスタンスを作成\n");
 }
}
