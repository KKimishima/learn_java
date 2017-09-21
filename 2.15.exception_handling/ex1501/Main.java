import  java.io.*;

public class Main {
  public static void main(String args[]) {
    System.out.println("エラーキャッチテスト");
    try {
      // 本来の処理
      FileWriter fw = new FileWriter("data.txt");
      // 例外が発生した時場合
    } catch (IOException e) {
      System.out.println("エラー" + e.getMessage());
      e.printStackTrace();
      // 上記以外の例外が発生した場合
    } catch (NullPointExceptionei e) {
      System.out.println("ぬるぽ");
      e.printStackTrace();
      // エラーの親クラスですべてキャッチ(大雑把に)
    } catch  (Exception e){
      System.out.println("親クラスでキャッチ");
      // 例外があってもなくて実行
    }finally{
      fw.close();
    }
  }
}
