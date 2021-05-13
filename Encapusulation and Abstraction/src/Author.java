import java.util.*;
import java.io.*;
class Author{
	public static String name;
    public static String email;
    public static char gender;
    Author(String n,String e,char g)
    {
        name = n;
        email = e;
        gender = g;
    }
}

class Book{
    String name,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name = n1;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice()
    {
        price = 200;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock = 15;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("Gender :"+Author.gender);
    }
}

class Main
{
    public static void main(String args[])
    {
        Book b=new Book("Mathematics");
        Author a=new Author("Siddharth","siddharthreddy8125@gmail.com",'M');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The No. of books available in stock is :"+b.getQtyInStock());
        b.getAuthor();
    }
}