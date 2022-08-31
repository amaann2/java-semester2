class library {
    String[] book;
    int no_of_Books;

    library() {
        this.book = new String[100];
        this.no_of_Books = 0;
    }

    public void addBooks(String books) {
        this.book[no_of_Books] = books;
        no_of_Books++;
        // System.out.println(books + " has been added successfully");
    }
    public void showavailableBooks() {
        System.out.println("Available book are:");
        for (String books : this.book) {
            if (books == null) {
                continue;
            }

            System.out.println("*" + books);

        }
    }

    public void issueBooks(String books) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(books)) {
                System.out.println(books + " book has been issue");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist");
    }

    public void returnBooks(String books) {
     addBooks(books);
     System.out.println(books+"retun successfully");
    }


}

public class challenge {
    public static void main(String[] args) {
        library a = new library();
        a.addBooks("Think and grow rich");
        a.addBooks("Atomic habbits");
        a.addBooks("Atomic ");
        a.addBooks("c++ ");
        a.addBooks("python ");
        a.addBooks("influence ");
        a.issueBooks("Atomic habbits");
        // a.returnBooks("Atomic habbits");
        a.showavailableBooks();

    }
}
