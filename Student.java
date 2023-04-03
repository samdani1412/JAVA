public class Student {
    private String name;
    private int ID;
    private Book[] borrowedBooks;

    Student(String name,int ID,int borrowedBook){
        this.name=name;
        this.ID=ID;
        this.borrowedBooks = new Book[borrowedBook];
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void display(){
        //System.out.println("List of students(borrowed books):");
        System.out.println("Student's name: "+this.name);
        System.out.println("ID: "+this.ID);
        System.out.println("Borrowed books: ");
        for(int i=0; this.borrowedBooks[i]!=null; i++) {
            this.borrowedBooks[i].display();
        }
    }

    public void borrowBook(Book book){
        int i = 0;
        for(; i<this.borrowedBooks.length; i++){
            if(this.borrowedBooks[i]==null){
                break;
            }
        }
        if(i==borrowedBooks.length){
            System.out.println("You can not take any more books");
            return;
        }
        borrowedBooks[i] = book;
    }

    void returnBook(Book book){
        int k = findbook(book);
        if(k==-1){
            System.out.println(this.getName()+" didn't borrowed the book "+book.getName());
        }
        for(; k<borrowedBooks.length-1; k++){
            borrowedBooks[k]=borrowedBooks[k+1];
        }
    }

    int findbook(Book book){
        int k = 0;
        for(; k<this.borrowedBooks.length; k++){
            if(this.borrowedBooks[k]==book) return k;
        }
        return -1;
    }



}
