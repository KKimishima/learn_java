package Kimishima;

public class Headphone implements Waerable{
  private int volume = 0;

  // インターフェイスの実装
  public void putOn(){
    System.out.println("ヘッドホンをつけました");
  }
  public void putOff(){
    System.out.println("ヘッドホンを外しました");
  }
  public void reset(){
    this.volume = volume;
    System.out.println("ボリュームを" + volume + "に変更しました");
  }
}
