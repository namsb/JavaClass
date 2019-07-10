package org.dimigo.oop;

public class BookText {
    public static void main(String[] args) {
        Book book;
        book =new Book();
        int i=10;
        Book book2=new Book();

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getAuthor());
        System.out.println(book.getPage());


        book.setTitle("수학의 바이블");
        book.setAuthor("민경도");
        book.setPage(200);

        System.out.println(book.getTitle());
        System.out.println(book.getPage());
        System.out.println(book.getAuthor());

        Book book3 = new Book("1984", "조지 오웰", 300);
        Book book4 = new Book("1984", "조지오웰");
        System.out.println(book3.getTitle());
    }
}
