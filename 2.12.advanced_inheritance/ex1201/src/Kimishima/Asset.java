package Kimishima;

// 資産クラス
public abstract class Asset{
  private String  name;   //名前
  private int     price;  //価格

  // コンストラクタ
  public Asset(String name,int price){
    this.name = name;
    this.price = price;
  }

  // getter
  public String getName(){return this.name;}
  public int getPrice(){return this.price;}
 
  // setter
  public void setName(String name){this.name = name;}
  public void setPrice(int price){this.price = price;}
}
