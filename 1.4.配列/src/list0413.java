// 配列の片付け
//

class list0413 {
  public static void main(String args[]) {
    // ガベージコレクション
    // 配列は、値の参照なのでブロックを超えても
    // 値として生きている
     // javaでは、ガベージコレクションが参照がなくなった値を
    // 削除してくれる
    // 参照を切る方法をここでやる
    int [] array_test = new int [] {0,11,22,33};
    System.out.println("参照が接続配列:" + array_test[1]); 
    // 参照を切る
    array_test = null;
    // 参照が切れたので"ぬるぽ"がでる
    //System.out.println("参照を切った配列" + array_test[1]);

    // 多次元配列
    // ここでは2次元配列の演習を行う
    int [][] tow_dim_array = new int [2][3];
    tow_dim_array[0][0] = 1;
    tow_dim_array[0][1] = 2;
    tow_dim_array[0][2] = 3;
    tow_dim_array[1][0] = 4;
    tow_dim_array[1][1] = 5;
    tow_dim_array[1][2] = 6;

    System.out.println("二次元配列:" + tow_dim_array[1][2]);
    // 下記の方法での初期化もok
    int [][] tow_dim_array2 = {
      {10,20,30},
      {30,40,50}
    };

    System.out.println("1次元目の要素数:" + tow_dim_array2.length);
    System.out.println("2次元目の要素数:" + tow_dim_array2[0].length);
  }
}
