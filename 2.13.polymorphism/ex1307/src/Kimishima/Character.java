package Kimishima;

//public abstract class Character implements Human{
public abstract class Character {
  // フィールド
  private String  name;
  private int     hp;
  private int     attckPoint;
  private int     defensePoint;
//  private double  randPonit;
  
  // 最大HP
//  private abstract int     max_hp;
//  private abstract int     max_mp;

  // コンストラクタ
  public Character(String name,int hp,int attckPoint,int defensePoint,int max_hp,int max_mp){
    System.out.println("キャラククラスのコンストラクタ");
    this.name = name;
    this.hp   = hp;
    this.attckPoint  = attckPoint;
    this.defense = defense:
//    this.max_hp = 0;
//   this.max_mp = 0;
  }

  // getter
  // name
  public String getName(){return this.name;}
  // HP
  public int getHp(){return this.hp;}
  // attckPoint
  public int getAttckPoint(){return this.attckPoint;}
  // defense
  public int getDefensePoint(){return this.defense;}

  // setter
  // name
  public void setName(Strin name){this.name = name;}
  // HP
  public void setHp(int hp){this.hp = hp;}
  // attckPoint
  void setAttckPoint(int setAttckPoint){this.attckPoint = attckPoint;}
  // defense
  void getDefensePoint(int getDefensePoint){this.name};

  // 動的メソッド
  // 逃げる(終了)
  @Override
  public void run(){
    System.out.println(this.name + "は逃げ出した");
    System.out.println("ゲームを終了させます");
    System.exit(1);
  }
  // 回復
  @Override
  public void heal(){
    double randPonit = rand();
    this.max_mp
    System.out.println(this.name + " 回復を行った");
  }


  //静的メソッド
  // ランダム数値作成
  public static double rand(){
    return (java.util.Randomi().nextDouble()) + 1;
  }

}
