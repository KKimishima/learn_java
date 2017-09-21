package Kimishima;

public class Monster extends Character{
  private final int damage  =5;

  public Monster(String job,String name,int hp){
    super(job,name,hp);
  }
  
  public void attack(Character target){
    target.setHp(target.getHp() - damage);
    System.out.println(super.getName() + "は、" + target.getName() + "に攻撃した");
    System.out.println(target.getName() + "は、" + damage + "ポイントのダメージ");
  }
}
