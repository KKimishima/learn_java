package Kimishima;
import  Kimishima.Character;
import  Kimishima.Hero;

public class Monster extends Character{
   public Monster(){
    super.setJob("モンスター");
    super.setName("スライム");
    super.setHp(50);
    super.setMp(10);
    super.setPower(20);
    super.setDefens(1.5);
    super.setMagic(8);
  }
  
   @Override
  public void setMax_hp(int max_hp){
    super.initMax_hp(max_hp);
  }
  @Override
  public void setMax_mp(int max_mp){
   super.initMax_mp(max_mp);
  }

//  @Override
  public void attck(Hero hero){
    System.out.println("\n=====================================");
    System.out.println(super.getName() + "が、普通攻撃");

    int damage       = (int)(super.getPower() * super.rand_pont());
    int defens_point = (int)((hero.getHp() * hero.getDefens()) - hero.getHp());
    int damage_result= damage - defens_point;

    if(damage_result <= 0){
      damage_result = 0;
      System.out.println("攻撃失敗");
    }

    hero.setHp((int)(hero.getHp() - damage_result));
    
    System.out.println(super.getName() + "は、" + hero.getName() + "に攻撃!!!");
    System.out.println(hero.getName() + "は、" + damage_result  + "ポイントのダメージ!!!");
    System.out.println("=====================================");

  }

//  @Override
  public void protect(){
    int protectUp = (int)(super.getDefens() * super.rand_pont());
    super.setDefens(super.getDefens() +(protectUp *0.1));

    System.out.println("\n=====================================");
    System.out.println(super.getName() + "は、身を守った!!!");
    System.out.println(super.getName() + "は、" + protectUp  + "ポイント防御力アップ!!!");
    System.out.println("\n=====================================");
    
    }

//  @Override
  public void magic_attck(Hero hero){
    System.out.println("\n=====================================");
    System.out.println(super.getName() + "が、魔法攻撃");
    
    int magic_damage = (int)(super.getMagic() * super.rand_pont());
    int defens_point = (int)((hero.getHp() * hero.getDefens()) - hero.getHp());
    int magic_damage_result= magic_damage - defens_point;

    if(magic_damage_result <= 0){
      magic_damage_result = 0;
      System.out.println("攻撃失敗");
    }

    hero.setHp((int)(hero.getHp() - magic_damage_result));
    
    System.out.println(super.getName() + "は、" + hero.getName() + "に魔法攻撃!!!");
    System.out.println(hero.getName() + "は、" + magic_damage_result  +  "ポイントのダメージ!!!");
    System.out.println("=====================================");
  }

}
