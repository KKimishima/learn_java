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
    super.max_hp = max_hp;
  }
  @Override
  public void setMax_mp(int max_mp){
    super.max_mp = max_mp;
  }
  @Override
  public void attck(Monster mon){
    int damage = (int)(super.power * rand_pont());
    mon.setHp = (mon.getHp * mon.getDefens) - damege;

    System.out.println("\n=====================================");
    System.out.println(super.name + "は、" + mon.name + "に攻撃!!!");
    System.out.println(mon.name + "は、" + damege  + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");

  }

  @Override
  public void protect(){
    int protectUp = (int)(super.getDefens() * rand_pont());
    super.setDefens = super.getDefens() + protectUp;

    System.out.println("\n=====================================");
    System.out.println(super.name + "は、身を守った!!!");
    System.out.println(super.name + "は、" + protectUp  + "ポイント防御力アップ!!!");
    System.out.println("\n=====================================");
    
    }

  @Override
  public void magic_attck(Monster mon){
    int magic_damage = (int)(super.magic * rand_pont());
    mon.setHp = (mon.getHp * mon.getDefens) - magic_damage;

    System.out.println("\n=====================================");
    System.out.println(super.name + "は、" + mon.name + "に魔法攻撃!!!");
    System.out.println(mon.name + "は、" + magic_damage + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");
   
  }
}
