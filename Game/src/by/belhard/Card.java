package by.belhard;

/**
 * Created by NotePad on 07.04.2015.
 */
public class Card {
    private String name;
    private int value;
    private String suit;

    public Card(String name, String suit, int value){
        this. name = name+suit;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return "   name: " + this.name + "   value: "  + this.value;
    }
}
