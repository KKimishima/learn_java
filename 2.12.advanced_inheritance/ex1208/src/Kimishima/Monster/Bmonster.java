package Kimishima.Monster;

public abstract class Bmonster{
  private String  name;
  private int     hp;

  // コンストラクタ
  public Bmonster(String name,int hp){
    this.name = name;
    this.hp   = hp;
  }
  
  // setter
  public void setName(String name){
    this.name = name;
  }
  public void setHp(int hpe){
    this.hp = hp;
  }
  // getter
  public String setName(){
    return this.name;
  }
  public int setHp(){
    return this.hp;
  }

  // メソッド
  public void run(){
    System.out.println(this.name + "逃げ出した");
  }
  // 抽象メソッド
  public abstract void attck( m);
 
}
