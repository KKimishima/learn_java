// 登場人物の基礎クラス

package Kimishima;

// 抽象クラス
// インスタンスできない
public abstract class Character{
  private   String  job;
  private   String  name;
  private   int     hp;
  private   int     mp;
  private   int     power;
  private   double  defens;
  private   double  magic;
  private   int     max_hp;
  private   int     max_mp;
  
  // コンストラクタ
  public Character(){
    this.job   = null;
    this.name  = null;
    this.hp    = 0;
    this.mp    = 0;
    this.power = 0;
    this.defens =0.0;
    this.magic  =0;
    this.max_hp = 0;
    this.max_mp = 0;
  }

  //setter
  public void setJob(String job){
    this.job = job;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setHp(int hp){
    this.hp = hp;
  }
  public void setMp(int mp){
    this.hp = mp;
  }
  public void setPower(int power){
    this.power = power;
  }
  public void setDefens(double  defens){
    this.defens = defens;
  }
  public void setMagic(double magic){
    this.magic = magic;
  }

  // 抽象クラスクラス
  // オーバライド必須
   public abstract void setMax_hp(int max_hp);
  
   public abstract void setMax_mp(int Max_mp);

  // getter
  public String getJob(){
    return this.job;
  }
  public String getName(){
    return this.name;
  }
  public int getHp(){
    return this.hp;
  }
  public int getMp(){
    return this.mp;
  }
  public int getPower(){
    return this.power;
  }
  public double getDefens(){
    return this.defens;
  }
 public double getMagic(){
    return this.magic;
  }
  public int getMax_hp(){
    return this.max_hp;
  }
  public double getMax_mp(){
    return this.max_mp;
  }

  // showStatus
  public void showStatus(){
    System.out.println("\n***********************");
    System.out.println("職業:" + this.job);
    System.out.println("名前:" + this.name);
    System.out.println("HP:" + this.hp +  "/" + this.max_hp);
    System.out.println("MP:" + this.mp +  "/" + this.max_hp);
    System.out.println("攻撃力:" + this.power);
    System.out.println("防御力:" + this.defens);
    System.out.println("魔力:" + this.magic);
    System.out.println("\n***********************");
  }

  // メソッド
  // 抽象クラス
  public  abstract void attck();

  public  abstract void protect();

  public  abstract void magic_attck();
  
  // 関数的
  public static double rand_pont(){
    return new java.util.Random().nextDouble();
  }
}
