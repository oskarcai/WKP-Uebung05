package A1;

public class A1_Main {
    public static void main(String[] args) {

        Article article = new Article();
        article.showInfo();

        System.out.println();

        Book book = new Book();
        book.setName("Lord of the Rings- The Fellowship of the Ring");
        book.setIsbn("978-0-261-10235-4");
        book.showInfo();

        System.out.println();

        Game game = new Game();
        game.setName("Monopoly");
        game.setNumPlayers(6);
        game.showInfo();

    }
}
