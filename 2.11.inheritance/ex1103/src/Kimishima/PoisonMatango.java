package Kimishima;
import  Kimishima.*;

public class PoisonMatango extends Matango{
  public PoisonMatango(char suffix){
    super(suffix);
    super.setName("ポイズンマタンゴ");
  }

  public void poisonAttck(Hero he){
    System.out.println("\n=============================");
    System.out.println(super.getName() + super.getSuffix() + "の毒攻撃");
    System.out.println("20ダメージ");
    System.out.println("=============================");
    he.setHp(he.getHp() - 20);
   
  }
}
