// ソースの分割
// このソースとlist0601_calcに分割
// スタティックなメソッドを呼び出し
// パッケージ名をつける
package calc.main;
import calc.logics.*;

class list0601_main {
  public static void main(String args[]) {
    int value1 = 100;
    int value2 = 20;
    
    int total = list0601_calc.method1(value1,value2);
    int delta = list0601_calc.method2(value1,value2);

    System.out.println("足すと:" + total + "\n引くと:" + delta);
  }
}
