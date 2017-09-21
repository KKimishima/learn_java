package Kimishima;

// インターフェイス
public interface Human{
  // メソッド
  // 攻撃
  void attck(character target);
  // 魔法攻撃
  void magicAttck(character target);
  // 回復
  void heal();
  // 防御
  void defense();
  // 逃げる(終了)
  void run();

  // getter
  // name
  String getName();
  // HP
  int getHp();
  // attckPoint
  int getAttckPoint();
  // defense
  int getDefensePoint();
  // あとで追加
  // max_hp
  // max_mp

  // stter
  // name
  void setName(Strin name);
  // HP
  void setHp(int hp);
  // attckPoint
  void setAttckPoint(int setAttckPoint);
  // defense
  void getDefensePoint(int getDefensePoint);
  // あとで追加
  // max_hp
  // max_mp

}
