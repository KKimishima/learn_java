package Kimishima;

class Monster{
  // フールド
  private String  name; // 名前
  private int     hp;   // 体力
  private int     ap;   // 攻撃力
  private int     dp;   // 防御力
  private int     sp;   // 素早さ

  //コンストラクタ
  public Monster(){
    name = "スライム";
    hp    = 60;
    ap    = 5;
    dp    = 2;
    sp    = 15;
    System.out.println(this.name + "が現れた");
  }
  public void  damege(int damege_value){
    int temp;
    temp =  this.hp - damege_value;
    System.out.println(this.name +"は" + damege_value + "のダメージ");
    System.out.println(this.name +"の残り体力は" + temp);
  }
}


