package Kimishima;

public class Book extends TangibleAsser{
  private String    isbn;

  public Book(String name,int price,String color,String isbn){
    super(name,price,color);
    this.isbn = isbn;
  }

  public String getIsbn(){return this.isbn;}
  //多態性を使う場合
  //スーパクラスを上書きする
  //@Override
  //public String getEtc1(){return this.isbn;}
}
