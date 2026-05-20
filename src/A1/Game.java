package A1;

public class Game extends Article {
    private int numPlayers;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Players: " + numPlayers);
    }

    public int getNumPlayers() {
        return numPlayers;
    }
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
