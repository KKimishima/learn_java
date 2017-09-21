interface Creature{
  void run();
}

interface Human extends Creature{
  void talk();
  void watch();
  void hear();
}

abstract class  Character{
  private String name;
//  private int    hp;

  public Character(){
    this.name = "ほげほげ";
  }
  
  public abstract void run();
  public abstract void attack();

  public String getName(){
    return this.name;
  }
}

class Fool extends Character implements Human{

  public Fool(){
    super();
  }
  public void run(){
    System.out.println("逃げ出した");
  }
  public void talk(){
    System.out.println("話した");
  }
  public void watch(){
    System.out.println("観察した");
  }
  public void hear(){
    System.out.println("聞き耳を立てた");
  }
  public void attack(){
    System.out.println("攻撃をした");
  }
}

class Inter {
  public static void main(String args[]) {
    Creature  cr = new Fool();
    Human     hu = new Fool();
    Character ch = new Fool();
    Fool      fo = new Fool();

    System.out.println("##クリーチャーの可能メソッド##");
    cr.run();

    System.out.println("##フューマンの可能メソッド##");
    hu.run();
    hu.talk();
    hu.watch();
    hu.hear();

    System.out.println("##キャラクタの可能メソッド##");
    ch.run();
    ch.attack();
    System.out.println(ch.getName());

    System.out.println("##キャラクタの可能メソッド##");
    fo.run();
    fo.talk();
    fo.watch();
    fo.hear();
    fo.attack();
    System.out.println(fo.getName());

  }
}
