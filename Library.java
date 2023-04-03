public class Library {
    private Book[] books;
    private Student[] Student;

    public Library(int numOfBooks, int numOfStudents) {
        this.books = new Book[numOfBooks];
        this.Student = new Student[numOfStudents];
    }


    void addBook(Book book) {
        int i = 0;
        for(; i<this.books.length; i++){
            if(this.books[i]==book){
                this.books[i].setNumCopies(this.books[i].getNumCopies()+1);
                return;
            }
            if(this.books[i]==null){
                break;
            }
        }
        if(i==this.books.length){
            System.out.println("Books capacity full!");
            return;
        }
        this.books[i] = book;
    }

    void addStudent(Student student) {
        int i = 0;
        for(; i<this.Student.length; i++){
            if(this.Student[i]==null){
                break;
            }
        }
        this.Student[i] = student;
    }

    void displayBooks() {
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i]==null){
                return;
            }
            System.out.println("Book no: " + (i + 1));
            System.out.println("Book's name: " + this.books[i].getName() + ".");
            System.out.println("Author: " + this.books[i].getAuthor() + ".");
            System.out.println("ISBN: " + this.books[i].getISBN() + ".");
            System.out.println("Copies: " + this.books[i].getNumCopies());
            System.out.println();
        }
    }

    Book findBook(String name){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].getName()==name){
                this.books[i].display();
                return books[i];
            }
        }
        System.out.println("There is no book named "+name+".");
        return null;
    }

    void borrowBook(String name, Student student){
        int k = searchBook(name);
        Book[] tempBooks = student.getBorrowedBooks();
        for(int i=0; i<tempBooks.length; i++){
            if(tempBooks[i]==null) break;
            else if(tempBooks[i].getName()==name){
                System.out.println("You can't borrow the same book twice.");
                return;
            }
        }

        if(books[k].getNumCopies() == 0) {
            System.out.println("There is no book named " + books[k].getName());
            return;
        }

        student.borrowBook(books[k]);
        this.addStudent(student);
        this.books[k].borrow();
        System.out.println(student.getName()+" has borrowed "+name);
    }

    void returnBook(String name, Student student){
        int k = searchBook(name);
        int flag=0, j=0;
        for(; j<this.Student.length; j++){
            if(this.Student[j]==student){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(student.getName()+" did not borrowed "+name+".");
            return;
        }

        for(; j<this.Student.length-1; j++){
            this.Student[j] = this.Student[j+1];
        }

        student.returnBook(books[k]);
        this.books[k].return_book();
        System.out.println(student.getName()+" has returned the book "+name);
    }

    int searchBook(String name){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].getName()==name){
                return i;
            }
        }
        return -1;
    }


}

