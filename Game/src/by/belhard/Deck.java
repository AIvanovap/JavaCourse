package by.belhard;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by NotePad on 07.04.2015.
 */
public class Deck {
    private static ArrayList<Card> arrayCard = new ArrayList<Card>();
    private static String[] name = {"6", "7", "8", "9", "10", "V", "D", "K", "T"};
    private static String[] suit = {"\u2660", "\u2662", "\u2663", "\u2665"};
    private  static String[] value = {"1", "2", "3", "4"};
    private static int sizeDeck = 36;

    public static ArrayList<Card> createDeck() {
        for(String j:suit) {
            for (String i : name) {
                if(Character.isDigit(i.charAt(0))){
                    Card card = new Card(i, j, Integer.valueOf(i));
                    arrayCard.add(card);
                }      else{
                    if(i.equals("V")){
                        Card card = new Card(i, j, Integer.valueOf(value[1]));
                        arrayCard.add(card);
                    }else{
                        if(i.equals("D")){
                            Card card = new Card(i, j, Integer.valueOf(value[2]));
                            arrayCard.add(card);
                        }else{
                            if(i.equals("K")){
                                Card card = new Card(i, j, Integer.valueOf(value[3]));
                                arrayCard.add(card);
                            }else{
                                if(i.equals("T")){
                                    Card card = new Card(i, j, Integer.valueOf(value[0]));
                                    arrayCard.add(card);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayCard;
    }
    public static ArrayList<Card> getArrayCard(){
        return arrayCard;
    }

    public static ArrayList<Card> shuffle(){
        Collections.shuffle(arrayCard);
        return arrayCard;
    }

    public static Card getCard(){
        Card yourCard =  arrayCard.get((int)Math.random()*sizeDeck);
        sizeDeck--;
        arrayCard.remove(yourCard);
        return yourCard;
    }
}
