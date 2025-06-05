package ch02.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100);
        System.out.println(randomScore);

        int randomScore2 = getRandomValue(1, 5);
//        System.out.println(randomScore2);

        char grade = getGrade(randomScore);
        System.out.println("score: "+grade);
    }

    public static int getRandomValue(int min, int max){
        return(int)(Math.random() * (max - min + 1))+min;

    }
    public static char getGrade(int score) {
        if(score > 100 || score < 0){
            return ' ';
        }
        return switch (score / 10){
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };
    }

}
