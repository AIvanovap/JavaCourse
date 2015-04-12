package by.belhard;

public class Main {

    /**
     * comments
     *
     * @param args
     */
    public static void main(String[] args) {
        Deck.createDeck();
        System.out.println(Deck.getArrayCard());
        System.out.println(Deck.shuffle());
        System.out.println(Deck.getCard());
    }
}
