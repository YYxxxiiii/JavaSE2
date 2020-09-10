package poker;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        // List 作为线性表，表现生活中很多有前后关系的物品都可以
        // 例如这里的牌组/衣柜/鞋柜 ...
        List<Card> cards = new ArrayList<>();

        // 初始化扑克牌
        initializeCards(cards);
        System.out.println(cards);
    }

    private static void initializeCards(List<Card> cards) {
        for (String suit : new String[] {"♠", "♥", "♦", "♣"}) {
            for (int rank = 1; rank <= 5; rank++) {
                Card card = new Card(suit, rank);

                // 把扑克牌放入牌组中
                cards.add(card);
            }
        }
    }
}
