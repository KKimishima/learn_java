package Kimishima.Game.Weapon;

public class Sword{
  private int  damegea = 5; //ダメージポイント
  private String     name;        // 武器の名前

  public Sword(){
    this.name =    "ソード";
    System.out.println("\n" + this.name + "の装備");
    System.out.print("威力.." + this.damegea + "ポイント");
  }
}
