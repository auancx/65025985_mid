class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Product Name : " + name);
        System.out.println("Product Price : " + price);
    }
}
class Electronics extends Product {
    String brand;
    String model;
    public Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}
class Smartphone extends Product {
    String brand;
    String model;
    String os;
    public Smartphone (String name, double price, String brand, String model, String os) {
        super(name, price);
        this.brand = brand;
        this.model = model;
        this.os = os;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Operating System : " + os);
    }
}
class Book extends Product {
    String author;
    int numOfPages;
    public Book(String name, double price, String author, int numOfPages) {
        super(name, price);
        this.author = author;
        this.numOfPages = numOfPages;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author : " + author);
        System.out.println("Number of Pages : " + numOfPages);
    }
}
public class mid {
    public static void main(String[] args) {
        Product chair = new Product("chair", 500.0);
        chair.displayInfo();

        System.out.println();

        Electronics television = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        television.displayInfo();

        System.out.println();

        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        iphone.displayInfo();

        System.out.println();

        Book book = new Book("OOP Programming", 250.0, "John Doe", 300);
        book.displayInfo();
    }
}