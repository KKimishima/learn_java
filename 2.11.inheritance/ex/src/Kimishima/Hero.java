package Kimishima;
import  Kimishima.Character;
import  Kimishima.Monster;

public class Hero extends Character{
  public Hero(){
    super.setJob("勇者");
    super.setName("ヨシヒコ");
    super.setHp(100);
    super.setMp(30);
    super.setPower(30);
    super.setDefens(1.4);
    super.setMagic(10);
  }
  @Override
  public void setMax_hp(int max_hp){
    super.setMax_hp(max_hp);
  }
  @Override
  public void setMax_mp(int max_mp){
    super.setMax_mp(max_mp);
  }
  @Override
  public void attck(Monster mon){
    int damage = (int)(super.getPower() * super.rand_pont());
    mon.setHp((int)(mon.getHp() * mon.getDefens()) - damage);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、" + mon.getName() + "に攻撃!!!");
    System.out.println(mon.getName() + "は、" + damage  + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");

  }

  @Override
  public void protect(){
    int protectUp = (int)(super.getDefens() * super.rand_pont());
    super.setDefens(super.getDefens() + protectUp);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、身を守った!!!");
    System.out.println(super.getName() + "は、" + protectUp  + "ポイント防御力アップ!!!");
    System.out.println("\n=====================================");
    
    }

  @Override
  public void magic_attck(Monster mon){
    int magic_damage = (int)(super.getMagic() * rand_pont());
    mon.setHp((int)(mon.getHp() * mon.getDefens()) - magic_damage);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、" + mon.getName() + "に魔法攻撃!!!");
    System.out.println(mon.getName() + "は、" + magic_damage + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");
   
  }
}
