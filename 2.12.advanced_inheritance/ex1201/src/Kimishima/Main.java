package Kimishima;
//import  Kimishima.*;

class Main {
  public static void main(String args[]) {
//    多態性を使う場合
//    TangibleAsser book      = new Book("本",1000,"赤","sb1234");
//    TangibleAsser computer  = new Computer("MacBookPro",14000,"白","ag1204");
    Book book      = new Book("本",1000,"赤","sb1234");
    Computer computer  = new Computer("MacBookPro",14000,"白","ag1204");

    System.out.println("####################");
    System.out.println(book.getName());
    System.out.println(book.getPrice());
    System.out.println(book.getColor());
    System.out.println(book.getIsbn());
//    多態性を使う場合
//    System.out.println(book.getEtc1());
    
    System.out.println("####################");
    System.out.println(computer.getName());
    System.out.println(computer.getPrice());
    System.out.println(computer.getColor());
    System.out.println(computer.getMakerName());
//    多態性を使う場合
//    System.out.println(computer.getEtc1());
  }
}
