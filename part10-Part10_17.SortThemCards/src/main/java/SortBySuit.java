
import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        return c2.getSuit().ordinal() - c1.getSuit().ordinal();
    }
}