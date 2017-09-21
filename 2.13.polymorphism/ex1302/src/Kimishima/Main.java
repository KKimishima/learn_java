package Kimishima;

class Main {
  public static void main(String args[]) {
//    Character whizard = new Whizard("魔法使い","にこらす",100,50);
//    Character monster = new Monster("スライム","スライムA",30);

    Character[] chara = new Character[3];

    chara[0] = new Whizard("魔法使い","にこらす",100,50);
    chara[1] = new Monster("スライム","スライムA",30);
    chara[2] = new Monster("スライム","スライムB",30);

    for (Character ch : chara) {
      ch.heal();
    }
    // ダウンキャスト
     
    if(chara[0]  instanceof Whizard){
      Whizard origin_whi = (Whizard) chara[0];
      for (int i = 1; i  <= 2 ;i++) {
        origin_whi.fireball(chara[i]);
        origin_whi.showStatus();
      }
    }

    chara[0].showStatus();
    

  }

}
