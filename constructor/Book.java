public class Book {
    String title;
    String author;
    double price;

        public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

      public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);

        b1.display();
        b2.display();
    }
}
