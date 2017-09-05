package Kimishima;
import  Kimishima.Hero;
import  Kimishima.SuperHero;

class Main {
  public static void main(String args[]) {
    System.out.println("メインクラス実行開始");

    // インスタンス
    //Hero player1 = new Hero();
    SuperHero player1 = new SuperHero();
    Monster player2 = new Monster();
    Wizard  player3 = new Wizard();

    // Heroのsetter
    player1.setName("スーパー勇者");
    player1.setHp(100);
    player1.setPower(10);
    player1.setMp(5);
    //Heroのgetter
    System.out.println("***************************");
    System.out.println("名前:"  + player1.getName());
    System.out.println("HP:"    + player1.getHp());
    System.out.println("MP:"    + player1.getMp());
    System.out.println("Power:" + player1.getPower());
    System.out.println("***************************");
    player1.hello();

    // Wizardのsetter
    player3.setName("魔法使い");
    player3.setHp(80);
    player3.setPower(5);
    player3.setMp(20);
     //Wizardのgetter
    System.out.println("***************************");
    System.out.println("名前:"  + player3.getName());
    System.out.println("HP:"    + player3.getHp());
    System.out.println("MP:"    + player3.getMp());
    System.out.println("Power:" + player3.getPower());
    System.out.println("***************************");
   
    player3.hello();
    // Monsterのsetter
    player2.setName("スライム");
    player2.setHp(40);
    player2.setPower(5);
    //Monsterのgetter
    System.out.println("***************************");
    System.out.println("名前:"  + player2.getName());
    System.out.println("HP:"    + player2.getHp());
    System.out.println("Power:" + player2.getPower());
    System.out.println("***************************");
   
    //  スーパー勇者攻撃
    player1.fire(player2);
    player3.fire(player2);
    
    // 攻撃後のモンスターの値
    System.out.println("***************************");
    System.out.println("名前:"  + player2.getName());
    System.out.println("HP:"    + player2.getHp());
    System.out.println("Power:" + player2.getPower());
    System.out.println("***************************");

 }
}
