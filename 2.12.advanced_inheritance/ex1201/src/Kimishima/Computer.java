package Kimishima;

public class Computer extends TangibleAsser{
  private String  makerName;

  public Computer(String name,int price,String color,String makerName){
    super(name,price,color);
    this.makerName =makerName;
  }

  public String getMakerName(){return this.makerName;}
  //多態性を使う場合
  //スーパクラスをオーバラドする
  //@Override
  //public String getEtc1(){return this.makerName;}
}
