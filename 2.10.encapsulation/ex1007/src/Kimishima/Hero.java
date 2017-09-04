package Kimishima;

public class Hero{
  // フィールド
  private String name;
  private int hp;
  private int mp;
  
  // 定数
  private final int max_hp = 100;
  private final int max_mp = 30;

  // コンストラクタ
  public Hero(String in_name,int in_hp,int in_mp){
    this.name = in_name;
    this.hp   = in_hp;
    this.mp   = in_mp;
    System.out.println(this.name + "が、インスタンスされました");
  }

  public String getName(){
    return this.name;
  }

  public int getHp(){
    return this.hp;
  }
  public void setHp(int in_hp){
    this.hp = in_hp;
  }
  public void printStatus(){
    System.out.println("************");
    System.out.println("名前:" + this.name );
    System.out.println("HP:" + this.hp + "/" + this.max_hp);
    System.out.println("MP:" + this.mp + "/" + this.max_mp);
    System.out.println("************");
  }
}
