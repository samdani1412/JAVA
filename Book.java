public class Book {
    private String name;
    private String author;
    private String ISBN;
    private int numCopies;

    Book(String name,String author,String ISBN,int numCopies){
        this.name=name;
        this.author=author;
        this.ISBN=ISBN;
        this.numCopies=numCopies;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public void display(){
        System.out.println("Book name:"+name);
        System.out.println("Authors name:"+author);
        System.out.println("ISBN:"+ISBN);
        System.out.println("Number of copies:"+numCopies);
    }

    public void borrow(){
        numCopies--;
    }

    public void return_book(){
        numCopies++;
    }
}
