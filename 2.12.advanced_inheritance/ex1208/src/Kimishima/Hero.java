package Kimishima;

public class Hero extends Character{
  public Hero(String name,int hp){
    super();
    super.setName(name);
    super.setHp(hp);
    System.out.println("ヒーローのインスタント作成");
  }

  @Override
  public void test(){
    System.out.println(super.getName() + "のオーバーライド成功");
  }
}
