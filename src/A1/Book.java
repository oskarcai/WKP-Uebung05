package A1;

public class Book extends Article {
    private String isbn;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ISBN: " + isbn);
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
