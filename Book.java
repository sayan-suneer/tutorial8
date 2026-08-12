package tutorial;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Technical(
            "Java Programming",
            "Herbert Schildt",
            "Programming"
        );
        Book b3 = new Story(
            "Harry Potter",
            "J.K. Rowling",
            "Fantasy"
        );

        // Runtime polymorphism
        Book ref;

        ref = b1;
        ref.display();

        System.out.println();

        ref = b2;
        ref.display();

        System.out.println();

        ref = b3;
        ref.display();
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String genre) {
        super(title, author, "Story");
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}