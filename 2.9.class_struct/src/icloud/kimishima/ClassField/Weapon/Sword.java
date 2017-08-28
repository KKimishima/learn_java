// ソードのクラス
package icloud.kimishima.ClassField.Weapon;

public class Sword {
  public int     damage; // 与えるダメージ
  public String  name;   // ソードの名前

  public void sword_status(){
    System.out.println("ソードのステータス");
    System.out.println("名前:" + this.name + "ダメージ" + this.damage);
  }
}
