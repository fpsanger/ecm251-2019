package utilites;

public class Card {

    private CardNaipe naipe;
    private CardValue value;


    public Card(CardNaipe naipe, CardValue value){

        this.naipe = naipe;
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + value + " " + naipe;
    }
}
