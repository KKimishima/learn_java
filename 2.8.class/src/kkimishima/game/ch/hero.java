// ヒーロクラス
// ゲームキャラクタと状態と操作を示す
package kkimishima.game.ch;

public class hero{
  // これら、変数をjavaではフィールドという
  public  int     hp;     // ヒットポイント
  public  String  name;   // プレイヤーの名前

  //  名前    : sleep
  //  必要情報: なし
  //  結果    : なし
  //  処理内容: hpを+100して画面にメッセージを出す
  public void sleep(){
    // thisは自分自身のインスタンスを示すもの
    this.hp = 100;
    System.out.println(this.name + "は,眠って回復した");
  }

  //  名前    : sit
  //  必要情報: int型数値
  //  結果    : なし
  //  処理内容: 必要情報の数値だけhpに追加して
  //          : メセージを表示
  public void sit(int sec){
    this.hp += sec; // 引数の値だけhpに追加
    
    System.out.println(this.name + "は、" + sec + "秒座った" );
    System.out.println("HPが" + sec + "ポイント回復");
  }

  // 転んだときのメソッド
  // hpを-5する
  public void slip(){
    this.hp -= 5;

    System.out.println(this.name + "転んだ");
    System.out.println("5のダメージ");
  }
  
  // 逃げ出したときの表示
  public void run(){
    System.out.println(this.name +"は逃げ出した");
    System.out.println("ゲームオーバー");
    System.out.println("最終HPは" + this.hp +"でした");
  }
}
