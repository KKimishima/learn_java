package Kimishima;

public class Person{
  int age;
  
  // コンストラクタ
  public Person(){
    this.age = 0;
  }

  public void setAge(int age){
    if(age < 0 ||age >100){
      throw new IllegalArgumentException
        ("正確な数値を入力してください");
    }
    this.age =age;
  }
}
