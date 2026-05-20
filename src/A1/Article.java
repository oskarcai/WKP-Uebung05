package A1;

public class Article {
    static int counter;
    protected String name = "Unknown name";

    public Article() {
        counter++;
    }

    public void showInfo() {
        System.out.println("Counter: " + counter + "\n Name: " + name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
