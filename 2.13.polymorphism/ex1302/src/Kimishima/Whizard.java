package Kimishima;

public class Whizard extends Character{
  private int mp;
  private final int damage      = 10;
  private final int magicDamage = 20;
  private final int magicCost   = 5;

  public Whizard(String job,String name,int hp,int mp){
    super(job,name,hp);
    this.mp = mp;
  }
  
  @Override
  public void attack(Character target){
    target.setHp(target.getHp() - damage);
  
    System.out.println(super.getName() + "は、" + target.getName() + "に攻撃した");
    System.out.println(target.getName() + "は、" + damage + "ポイントのダメージ");
  }

  public void fireball(Character target){
    if(this.mp <= magicCost){
      System.out.println("ファイヤーボールを発動するmpが足りません");
      return;
    }

    this.mp -= magicCost;
    target.setHp(target.getHp() - magicDamage);
    
    System.out.println(super.getName() + "は、" + target.getName() + "にファイヤーボールの発動");
    System.out.println(target.getName() + "に" + magicDamage + "ポイントのダメージ");
  }

  @Override
  public void showStatus(){
    System.out.println("職業  :" + super.getJob());
    System.out.println("名前  :" + super.getName());
    System.out.println("HP    :" + super.getHp());
    System.out.println("MP    :" + this.mp);
  }
}
