package Kimishima;

class Hero {
  private String  name;
  private int     hp;
  private int     power;

  public Hero(){
    this.name = null;
    this.hp   = 0;
    this.power= 0;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    this.hp = hp;
  }
  public int getPower(){
    return this.power;
  }
  public void setPower(int power){
    this.power = power;
  }

  public void attck(Monster mon1){
    System.out.println(this.name + "攻撃");
    mon1.setHp(mon1.getHp() - this.power);
    System.out.println(mon1.getName() + "に、" + this.power + "ポイントダメージ");
  }

  public void hello(){
    System.out.println(this.name + "は、こんちわと言った");
  }
}
