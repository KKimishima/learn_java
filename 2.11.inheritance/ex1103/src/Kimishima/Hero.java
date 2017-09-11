package Kimishima;
import  Kimishima.*;

public class Hero{
  private int     hp;
  private String  name;

  // コンストラクタ
  // 引数なし
  public Hero(){
    this.hp = 200;
    this.name = "勇者";
  }
  // 名前の引数があるとき
  public Hero(String name){
    this.hp = 100;
    this.name = name;
  }

  // setter
  public void setHp(int hp){
    this.hp = hp;
  }

  // getter
  public int getHp(){
    return this.hp;
  }

  public String getName(){
    return this.name;
  }
  public void showStatus(){
    System.out.println("\n=============================");
    System.out.println("名前      :" + this.name);
    System.out.println("HP        :" + this.hp);
    System.out.println("=============================");
  }

}
