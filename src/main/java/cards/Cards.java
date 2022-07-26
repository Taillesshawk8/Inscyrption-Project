package cards;

import java.util.ArrayList;

public class Cards extends Wolf {
    public static void main(String[] args){
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Stoat");
        cards.add("Snake");
        cards.add("Wolf");
        cards.add("Squirrel");
        int draw = (int) (Math.random()*4);
        System.out.println(cards.get(draw));
        switch (draw) {
            case 0 -> StoatInfo();
            case 1 -> SnakeInfo();
            case 2 -> wolfInfo();
            case 3 -> SquirrelInfo();
        }
    }
}
