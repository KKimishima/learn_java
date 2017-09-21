interface Inter1{
  void hoge();
  void hogehoge();
  void foo();
  void foofoo();
  int getNo();
  void  setNo(int no);
  void add(SuperC addNum);
}

abstract class SuperC implements Inter1{
  private String  name;
  private int     no;

  public SuperC(String name,int no){
    this.name = name;
    this.no   = no;
  }

  @Override
  public int getNo(){return this.no;}

  @Override
  public void setNo(int no){this.no = no;}

  @Override
  public void hoge(){
    System.out.println("ほげ");
  }
  @Override
  public void foo(){
    System.out.println("ふう");
  }

  @Override
  public void add(SuperC addNum){
    this.no += addNum.getNo();
  }
  public abstract void hogehoge();

  public abstract void foofoo();
}

class Sub1 extends SuperC{
  public Sub1(String name,int no){
    super(name,no);
  }
  
  @Override
  public void hogehoge(){
    System.out.println("ほげほげ");
  }
  @Override
  public void foofoo(){
    System.out.println("ふうふう");
  }
}

class Sub2 extends SuperC{
 public Sub2(String name,int no){
    super(name,no);
  }
  
  @Override
  public void hogehoge(){
    System.out.println("ほげほげ2");
  }
  @Override
  public void foofoo(){
    System.out.println("ふうふう3");
  }

}
class Test {
  public static void main(String args[]) {
//    Inter1 su1 = new Sub1("さぶ1",1);
    SuperC su1 = new Sub1("さぶ1",1);
    Inter1 su2 = new Sub2("さぶ2",2);
    su1.hoge();
    su1.foofoo();

    su2.add(su1);
    System.out.println(su2.getNo());
  }
}

