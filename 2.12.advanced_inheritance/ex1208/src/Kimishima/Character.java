package Kimishima;

// 親クラス
public abstract class Character{
  private String  name;
  private int     hp;

  // コンストラクタ
  public Character(){
    this.name = null;
    this.hp   = hp;
  }
  
  // setter
  public void setName(String name){
    this.name = name;
  }
  public void setHp(int hp){
    this.hp = hp;
  }
  // getter
  public String getName(){
    return this.name;
  }
  public int getHp(){
    return this.hp;
  }

  public void run(){
    System.out.println(this.name  + "逃げた");
  }

  public void showStatus(){
    System.out.println("名前:" + this.name);
    System.out.println("HP  :" + this.hp);
  }

  public void attct(Character target){
    this.hp -= 10;
    System.out.println(this.name + "は、" + target.getName() + "に攻撃を行った");
  }
  // オーバーライド
  public abstract void test();
  
}
