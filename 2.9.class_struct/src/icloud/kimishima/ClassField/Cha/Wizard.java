package icloud.kimishima.ClassField.Cha;

public class Wizard   {
  public String name;
  int    hp;

 public void heal(Hero player){
    player.hp += 10;
    System.out.println(this.name + "回復を起動");
    System.out.println(player.name + "のHPは10ポイント回復"); 
  }
}
