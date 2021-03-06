package kimishima;
//import  kimishima.System.out.println;
//import  kimishima.java.ulit.*;

public class ex0802 {
  public static void main(String args[]) {
    System.out.println("メインクラス実行開始");
    Cleric player = new Cleric(40,8);
    player.get_status();
    player.selfAid();
    player.get_status();
    player.pray(3);
    player.get_status();
  }
}

class Cleric{
  // フィールド
  private String  name; // 名前
  private int     hp;   // ヒットポイント
  private int     mp;   // マジックポイント
  // 最大値
  private final int max_hp = 50;
  private final int max_mp = 10;

  // コンストラクト
  public Cleric(int in_hp,int in_mp){
    this.hp = in_hp;
    this.mp = in_mp;
    this.name = "賢者";
  }
  // メソッド
  public void selfAid(){
    this.mp -= 5;
    this.hp = this.max_hp;

    System.out.println("セルフエイド発動!!!\n" + this.name + "は,MPを5ポイント消費し体力を最大まで回復した");
  }
  public int pray(int pray_time){
    System.out.println(this.name + "は、祈りを捧げた");
    
    // 理論上の回復値を計算
    int rand_point = new java.util.Random().nextInt(3) + pray_time;
    
    // 最大を超えたとき
    int recover = Math.min(this.max_mp - this.mp,rand_point);

    this.mp += recover;
    System.out.println("MPが" + recover + "ポイント回復した");
    
    /*考えいたロジック
    if (this.mp >= this.max_mp){
      System.out.println("MPが最大まで回復した");
      rand_point = this.max_mp -this.mp;
      this.mp = this.max_mp;
    }
    */
    return recover;
  }

  public void get_status(){
    System.out.println("\n*********************************");
    System.out.println("ステータス");
    System.out.println("名前:" + this.name);
    System.out.println("HP:"+ this.hp);
    System.out.println("MP"+ this.mp);
    System.out.println("*********************************\n");
  }
}
