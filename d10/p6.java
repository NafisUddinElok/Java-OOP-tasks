import java.util.Scanner;
import java.util.ArrayList;

class books{
    String bookname, author, yearofpub;
    int bookid;
    float price;
    String status; // available, issued

    books() {
        this.bookname = null;
        this.author = null;
        this.yearofpub = null;
        this.bookid = 0;
        this.price = 0.0f;
        this.status = null;
    }

    void addnewbook(String name, String author, String year, int id, float price) {
        this.bookname = name;
        this.author = author;
        this.yearofpub = year;
        this.bookid = id;
        this.price = price;
        this.status = "available";
    }
    void deletebook() {
        this.bookname = null;
        this.author = null;
        this.yearofpub = null;
        this.bookid = 0;
        this.price = 0.0f;
        this.status = null;
    }
    void displaybook() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearofpub);
        System.out.println("Book ID: " + bookid);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquirebook() {
        if(status.equals("available")) {
            System.out.println("The book is available.");
        } else {
            System.out.println("The book is issued.");
        }
    }

}
class librarian{
    int id;
    String name;

    librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }


    void searchbook(String name){
        System.out.println("Searching for book: " + name);
    }

    boolean verifymember(int memberid) {
        System.out.println("Verifying member with ID: " + memberid);
        return true; 
    }

    void orderbooks() {
        System.out.println("Ordering books...");
    }
    void sellbooks() {
        System.out.println("Selling books...");
    }
}
class publisher{
    int id, phone;
    String name, address;

    publisher(int id, String name, String address, int phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    void addpub(){
        System.out.println("Adding publisher...");
    }
    void deletepub(){
        System.out.println("Deleting publisher...");
    }
    void modifypub(){
        System.out.println("Modifying publisher...");
    }
    void orderstatus(){
        System.out.println("Checking order status...");
    }
}
class user{
    int userid, phone;
    String name, address;
    user(int id, String name, String address, int phone) {
        this.userid = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    void returnbook() {
        System.out.println(name + " is returning book...");
    }
    int payfine(int dayslate) {
        int fine = dayslate * 10; 
        System.out.println("Fine amount: " + fine + " for " + dayslate + " days late.");
        return fine;
    }

    void adduser() {
        System.out.println(name + " is added.");
    }
    void deleteuser(){
        System.out.println(name + " is deleted.");
    }
    void updatedetails(){
        System.out.println("updated user : " + name);
    }
    void bookspurchased(){
        System.out.println("Books purchased by user: " + name);
    }
}

public class p6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        books b1 = new books();
        b1.addnewbook("The Great Gatsby", "F. Scott Fitzgerald", "1925", 1, 10.99f);
        b1.displaybook();
        b1.inquirebook();

        librarian lib = new librarian(1, "Alice");
        lib.searchbook("The Great Gatsby");
        lib.verifymember(123);
        lib.orderbooks();
        lib.sellbooks();

        publisher pub = new publisher(1, "Penguin Books", "123 Main St", 1234567890);
        pub.addpub();
        pub.deletepub();
        pub.modifypub();
        pub.orderstatus();

        user u1 = new user(1, "Nafis", "halishahar, Chattogram", 1870891129);
        u1.adduser();
        u1.deleteuser();
        u1.updatedetails();
        u1.bookspurchased();

    }
}