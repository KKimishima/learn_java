package Kimishima;

public abstract class Character{
  private String  job;
  private String  name;
  private int     hp;

  public Character(String job,String name,int hp){
    this.job  = job;
    this.name = name;
    this.hp   = hp;
  }

  public String getJob(){return this.job;}
  public String getName(){return this.name;}
  public int    getHp(){return this.hp;}

  public void   setJob(String job){this.job = job;}
  public void   setName(String name){this.name = name;}
  public void   setHp(int hp){this.hp = hp;}

  public abstract void attack(Character Target);

  public void run(){
    System.out.println("逃げ出した");
    System.exit(1);
  }

  public void heal(){
    this.hp += 10;
    System.out.println("10ポイント回復");
  }

  public void showStatus(){
    System.out.println("職業  :" + this.job);
    System.out.println("名前  :" + this.name);
    System.out.println("HP  :" +   this.hp);
  }
}
