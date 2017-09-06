package Kimishima;
import  Kimishima.Character;
import  Kimishima.Hero;

public class Monster extends Character{
   public Monster(){
    job   = "モンスター";
    name  = "スライム";
    hp    = 50;
    mp    = 10;
    power = 10;
    defens =1.1;
    magic  =8;
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
  public void attck(Hero hero){
    int damage = (int)(super.power * rand_pont());
    hero.setHp = (hero.getHp * hero.getDefens) - damege;

    System.out.println("\n=====================================");
    System.out.println(super.name + "は、" + hero.name + "に攻撃!!!");
    System.out.println(hero.name + "は、" + damege  + "ポイントのダメージ!!!");
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
  public void magic_attck(Hero hero){
    int magic_damage = (int)(super.magic * rand_pont());
    hero.setHp = (hero.getHp * hero.getDefens) - magic_damage;

    System.out.println("\n=====================================");
    System.out.println(super.name + "は、" + hero.name + "に魔法攻撃!!!");
    System.out.println(hero.name + "は、" + magic_damage + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");
   
  }

}
