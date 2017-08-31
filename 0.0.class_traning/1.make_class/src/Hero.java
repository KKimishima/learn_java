package Kimishima;

// 登場人物クラス 
class  Hero{
  // フィールド
  private String  name; // 名前
  private int     hp;   // 体力
  private int     ap;   // 攻撃力
  private int     dp;   // 防御力
  private int     sp;   // 素早さ

  // コントラクト
  // 引数なしのコントラクト
  public Hero(){
    name  = "勇者";
    hp    = 100;
    ap    = 7;
    dp    = 5;
    sp    = 10;
   System.out.println(this.name + "が生成されました");

  }
  
  // メソッド
  public int attck(int random_value){
    int ap_ran_vlue;

    ap_ran_vlue = this.ap * random_value;

    System.out.println(this.name + "の攻撃\n" );
    return ap_ran_vlue;
  }
}
