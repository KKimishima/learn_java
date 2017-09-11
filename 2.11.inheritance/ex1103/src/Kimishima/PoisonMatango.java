package Kimishima;
import  Kimishima.*;

// コンストラクタ
public class PoisonMatango extends Matango{
  // フィールド
  private int poison_count = 5;  // 毒攻撃をできる上限回数

  public PoisonMatango(char suffix){
    super(suffix);
    super.setName("ポイズンマタンゴ");
  }

/*
  // setter
  public void setPoison_count(int poison_count){
    this.poison_count = poison_count;
  }
  // getter
  public void getPoison_count(){
    return this.poison_count;
  }
*/

  public void poisonAttck(Hero he){
    super.attack(he);                   // スーパクラスの実行
    
    // 追加攻撃判定
    if(this.poison_count <= 0){
      System.out.println("\n=============================");
      System.out.println(super.getName() + super.getSuffix() + "の毒胞子がないようだ");
      System.out.println("=============================");
      this.poison_count = 0;            // カウントをマイナスにしないように
      return;
    }

    // 追加攻撃
    int poison_damage = he.getHp() / 5; // 体力の1/5ダメージ
    he.setHp(he.getHp() - poison_damage);
    this.poison_count -= 1;             //毒攻撃回数現象
    
    System.out.println("\n=============================");
    System.out.println(super.getName() + super.getSuffix() + "の毒攻撃");
    System.out.println(poison_damage +  "ダメージ");
    System.out.println("毒攻撃の残り回数" + this.poison_count + "回");
    System.out.println("=============================");
    
   
  }
}
