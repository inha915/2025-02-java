package blackjack;

public class Card {

    //객체를
    private String pattern;
    private String denomination;


    //set string this
    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern(){
        return pattern;
    }
    public String getDenomination(){
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("%s (%s)", this.getPattern(), this.getDenomination());
    }


}
// 생성자: 전달받은 pattern과 denomination 값을 이 객체의 멤버 변수에 저장

// pattern과 denomination 값을 받아 해당 멤버 변수에 초기화하는 생성자