// 練習問題1103
package Kimishima;
import  Kimishima.*;

public class Matango {
  private String  name;
  private int     hp = 50;
  private char    suffix; // 識別記号
  
  public Matango(char suffix){
    this.name = "マタンゴ";
    this.suffix = suffix;
  }
  
  // stter
  public void setShffix(char suffix){
    this.suffix  = suffix;
  }
  public void setName(String name){
    this.name  = name;
  }
  
  // getter
  public String getName(){
    return this.name;
  }
  public int  getHp(){
    return this.hp;
  }
  public char getSuffix(){
    return this.suffix;
  }

  public void attack(Hero he){
    System.out.println("\n=============================");
    System.out.println(this.getName() + this.getSuffix() + "の攻撃");
    System.out.println("10ダメージ");
    System.out.println("=============================");
    he.setHp(he.getHp() - 10);
  }

  public void showStatus(){
    System.out.println("\n=============================");
    System.out.println("モンスター:" + this.getName());
    System.out.println("識別:     :" + this.getSuffix());
    System.out.println("HP        :" + this.getHp());
    System.out.println("=============================");
  }
  
}
