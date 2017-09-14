package Kimishima;

public class WearableComputer implements Waerable{
  // インターフェイスの実装
  public void putOn(){
    System.out.println("パソコンを起動しました");
  }
  public void putOff(){
    System.out.println("パソコンを落としました");
  }
}
