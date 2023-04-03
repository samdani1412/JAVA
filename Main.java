public class Main {
    public static void main(String[] args) {
        Book book1=new Book("JAVA THE COMPLETE REF","Herbert Schildt","21-3242-432-3213",1);
        Book book2=new Book("Teach Yourself C","Herbert Schildt","21-2313-232-6788",5);
        Book book3=new Book("Statistics","Sheldon Ross","333-1232-342-2342",3);
//        book1.display();
//        book2.display();
//        book2.borrow();
//        book1.return_book();
//
//        book1.display();
//        book2.display();

        Student student1 = new Student("SAMDANI", 1412, 3);
        Student student2 = new Student("ADNAN", 1442, 3);
        Student student3 = new Student("SUKANYA", 1426, 3);

        Library lib = new Library(10,3);
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        

        lib.displayBooks();
        lib.findBook("Statistics");
        lib.borrowBook("Statistics", student1);
        book3.display();
        lib.returnBook("Statistics", student1);
        book3.display();
        lib.borrowBook("Teach Yourself C", student1);
        lib.borrowBook("Teach Yourself C", student2);
        lib.displayBooks();


        student1.display();
        student2.display();

//        book1.display();
//        book1.return_book();
//        System.out.println(book1.getNumCopies());
//        book1.borrow();
//        System.out.println(book1.getNumCopies());
    }
}