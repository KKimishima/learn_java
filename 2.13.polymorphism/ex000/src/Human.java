// インターフェイスの練習

// インターフェイス
interface Inter1{
  void hello();
  void run();
}

//interface Inter2{
//}

// スーパークラス
abstract class SuperCa implements Inter1{
//  private String name;

//  public SuperCa(String name){
  public SuperCa(){
//    this.name = name;
    System.out.println( "スーバークラスのコストラクタ実行");
  }
  public void hello(){
    System.out.println("こんにちわ");
  }
  public abstract void run();

  public void hogehoge(){
    System.out.println("ほげほげ");
  }
}

class Sub1 extends SuperCa{
  public Sub1(){
    super();
    System.out.println("Sub1コンストラクタ実行");
  }
  @Override
  public void run(){
    System.out.println("Sub1は走る");
  }
}

class Sub2 extends SuperCa{
  public Sub2(){
    super();
    System.out.println("Sub2コンストラクタ実行");
  }
  @Override
  public void run(){
    System.out.println("Sub2は走る");
  }
}

class Main {
  public static void main(String args[]) {
    Inter1 in1 = new Sub1();
    Inter1 in2 = new Sub2();

    SuperCa su1 = new Sub1();
    SuperCa su2 = new Sub2();

    in1.hello();
    in2.hello();
    
    in1.run();
    in2.run();
    
    su1.hogehoge();
    su2.hogehoge();
  }
}
