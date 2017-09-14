package Kimishima;

public class Monster extends Character{
  public Monster(String name,int hp){
    super();
    super.setName(name);
    super.setHp(hp);
    System.out.println("モンスタクラスのインスタント作成");
  }

  @Override
  public void test(){
    System.out.println(super.getName() + "のオーバーライド成功");
  }
}
