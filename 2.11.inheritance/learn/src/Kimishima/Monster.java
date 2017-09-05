package Kimishima;

public class Monster{
  private String  name;
  private int     hp;
  private int     power;

  public Monster(){
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

}
