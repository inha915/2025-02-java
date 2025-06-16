package blackjack;

import java.util.List;

public class Rule {
    public static void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        // 1. 둘 다 21점 초과 >> 무승부
        if (dealerScore > 21 && gamerScore > 21) {
            System.out.println("무승부입니다. (둘 다 21점 초과)");
            return;
        }

        // 2. 둘 다 21점 이하이면서 점수가 같음 >> 무승부
        if (dealerScore <= 21 && gamerScore <= 21 && dealerScore == gamerScore) {
            System.out.println("무승부입니다. (점수 같음)");
            return;
        }

        // 3. 딜러 > 21, 게이머 ≤ 21 >> 게이머 승
        if (dealerScore > 21 && gamerScore <= 21) {
            System.out.println("게이머 승!");
            return;
        }

        // 4. 둘 다 21 이하인데 게이머가 더 높음 >> 게이머 승
        if (dealerScore <= 21 && gamerScore <= 21 && gamerScore > dealerScore) {
            System.out.println("게이머 승!");
            return;
        }

        // 5. 게이머 > 21, 딜러 ≤ 21 >> 딜러 승
        if (gamerScore > 21 && dealerScore <= 21) {
            System.out.println("딜러 승!");
            return;
        }

        // 6. 둘 다 21 이하인데 딜러가 더 높음 >> 딜러 승
        if (dealerScore <= 21 && gamerScore <= 21 && dealerScore > gamerScore) {
            System.out.println("딜러 승!");
        }
    }


    public static int getScore(List<Card> cards) {
        int score = 0;
        for (Card card : cards) {
            int eachScore =convertDenominationToScore(card.getDenomination());
            score+=eachScore;
        };

        return score;
    }

    private static int convertDenominationToScore(String denomination) {
        denomination = denomination.toUpperCase(); // 소문자 방지
        return switch (denomination){
            case "A" ->1;
            case "J", "Q", "K" ->10;
            default -> Integer.parseInt(denomination);
        };
    }
}
