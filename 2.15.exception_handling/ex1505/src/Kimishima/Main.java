package Kimishima;
import  java.util.*;

class Main {
  public static void main(String args[]) {
    Person pe = new Person();
    
    
    System.out.println("年齢を入力してください");
    int input = new Scanner(System.in).nextInt();
    pe.setAge(input);
  }
}
