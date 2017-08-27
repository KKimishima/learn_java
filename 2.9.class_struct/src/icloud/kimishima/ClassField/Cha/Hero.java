// ヒーローのクラス
package icloud.kimishima.classfield.Cha;

public class Hero {
  public String  name;
  public int     hp;
  
  //Sword sword;

  public void attack(){
    System.out.println(this.name + "は攻撃した!");
    System.out.println("敵に5ポイントのダメージ");
  }
}
