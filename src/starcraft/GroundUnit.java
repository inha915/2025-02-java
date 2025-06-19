package starcraft;

public abstract class GroundUnit extends Unit {
    @Override
    public void move(int x, int y) {
        super.move(x,y);
        System.out.println("공중으로 이동한다");

    }
}
