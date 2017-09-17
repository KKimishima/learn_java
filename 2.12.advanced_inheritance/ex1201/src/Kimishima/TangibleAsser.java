package Kimishima;

// 有形資産クラス
public abstract  class TangibleAsser extends Asset implements Thing{
  private String  color;  // 色の
  private double  whight;

  // コンストラクタ
  public TangibleAsser(String name,int price,String color){
    super(name,price);
    this.color= color;
    this.whight = whight;
  }
  
  // getter
  public String getColor(){return this.color;}
  public double getWheight(){return this.whight;}

  // setter
  public void setColor(int Color){this.color =  color;}
  public void setWheight(double whight){this.whight = whight;}
//  public abstract String getEtc1();
}
