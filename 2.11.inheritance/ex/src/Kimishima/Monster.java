package Kimishima;
import  Kimishima.Character;
import  Kimishima.Hero;

public class Monster extends Character{
   public Monster(){
    super.setJob("モンスター");
    super.setName("スライム");
    super.setHp(50);
    super.setMp(10);
    super.setPower(10);
    super.setDefens(1.1);
    super.setMagic(8);
  }
  
   @Override
  public void setMax_hp(int max_hp){
    super.setMax_hp(max_hp);
  }
  @Override
  public void setMax_mp(int max_mp){
   super.setMax_mp(max_mp);
  }

//  @Override
  public void attck(Hero hero){
    int damage = (int)(super.getPower() * super.rand_pont());
    hero.setHp((int)(hero.getHp() * hero.getDefens()) - damage);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、" + hero.getName() + "に攻撃!!!");
    System.out.println(hero.getName() + "は、" + damage  + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");

  }

//  @Override
  public void protect(){
    int protectUp = (int)(super.getDefens() * super.rand_pont());
    super.setDefens(super.getDefens() + protectUp);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、身を守った!!!");
    System.out.println(super.getName() + "は、" + protectUp  + "ポイント防御力アップ!!!");
    System.out.println("\n=====================================");
    
    }

//  @Override
  public void magic_attck(Hero hero){
    int magic_damage = (int)(super.getMagic() * super.rand_pont());
    hero.setHp((int)(hero.getHp() * hero.getDefens()) - magic_damage);

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、" + hero.getName() + "に魔法攻撃!!!");
    System.out.println(hero.getName() + "は、" + magic_damage + "ポイントのダメージ!!!");
    System.out.println("\n=====================================");
   
  }

}
