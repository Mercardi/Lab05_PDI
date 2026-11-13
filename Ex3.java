package lab05;
class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price : $%.2f%n", price);
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 39.99);
        System.out.println("--- Book 1 (default constructor) ---");
        defaultBook.display();
        System.out.println("\n--- Book 2 (parameterised constructor) ---");
        cleanCode.display();
    }
}
