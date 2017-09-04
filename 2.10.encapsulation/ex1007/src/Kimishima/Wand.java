package Kimishima;

public class Wand{
  private String name;
  private double power;

  // コンストラクタ
  public Wand(){
    this.name = null;
    this.power = 0;
    System.out.println("武器のインスタンス作成");
  }
  public String getName(){
    return this.name;
  }

  public void setName(String name){
    //if(name == null || ( name.length() > 3 || name.length() < 10) ){
    if(name == null || name.length() > 3){
      throw new IllegalArgumentException
        ("不正な命名規則です");
    }
    this.name = name;
  }
  
  public double  getPower(){
    return this.power;
  }

  public void setPower(double power){
    if(power < 0.5 || power > 1.0){
      throw new IllegalArgumentException
        ("不正な数値です");
    }
    this.power = power;
  }
}
