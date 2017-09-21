package Kimishima;
import  java.util.*;

class Main {
  public static void main(String args[]) {
    // Data型のインスタンス(Data型の時間)
    Date now = new Date();  // 現在の時間

    // エポックタイム(long型の時間表現)
    long start = System.currentTimeMillis();  // スタート
    
    // 入力待ち時間もカウントしてくれる
    System.out.println("Enterをおしてください");
    String input = new Scanner(System.in).nextLine();
    
    long end = System.currentTimeMillis();    // エンド
    
    // Data型からlong型に変換
    Date past = new Date(now.getTime());

    // Calenderから正数として日付を習得(int型の時間)
    Date now2 = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int year = c.get(Calendar.YEAR);
    int month= c.get(Calendar.MONTH ) +1; //javaでは0月から始まるので1足す
    int day  = c.get(Calendar.DAY_OF_MONTH);
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println("long型の処理時間      :" + (end -start) + "ミリ秒");
    System.out.println("Data型の現時間        :" + now);  //一番下と結果は同じ
    System.out.println("Date型からlong型      :" + now.getTime()); //現在の時間(エポックタイムになる)
    System.out.println("long型からDate型      :" + past);
    System.out.println("Calenderのint型現.年  :" + year );
    System.out.println("Calenderのint型現.月  :" + month );
    System.out.println("Calenderのint型現.日  :" + day );
    System.out.println("Calenderのint型現.時  :" + hour );
    System.out.println("Calenderのint型現.分  :" + minute );
    System.out.println("Calenderのint型現.秒  :" + second );
  }
}
