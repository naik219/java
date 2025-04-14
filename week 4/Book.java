class Book {
    // Declaring attributes
    String Title_of_the_book;
    String Author;
    int Year_of_publication;

    // Constructor to initialize values
    Book(String Title_of_the_book, String Author, int Year_of_publication) {
        this.Title_of_the_book = Title_of_the_book;
        this.Author = Author;
        this.Year_of_publication = Year_of_publication;
        System.out.println("Your book: " + this.Title_of_the_book);
    }

    // Creating a method
    public void getbook() {
        System.out.println("The Title of the Book: " + Title_of_the_book);
        System.out.println("Author: " + Author);
        System.out.println("Published Year: " + Year_of_publication);
    }

    public static void main(String[] args) {
        // Creating objects for class Book
        Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
        book1.getbook();

        Book book2 = new Book("Maze Runner", "James Dashner", 2009);
        book2.getbook();
    }
}
