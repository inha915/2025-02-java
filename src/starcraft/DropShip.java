package starcraft;

// 수송기
// 8개의 지상유닛을 태울 수 있다
public class DropShip extends FlyingUnit {
    GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = -1; // ✅ 0으로 시작 (비어 있음)

    // 유닛 하나를 태운다. 태웠으면 true, 가득 차면 false
    public boolean load(GroundUnit unit) {
        if (units.length - 1 == loadedIndex) {
            return false;
        } else {
            units[++loadedIndex] = unit;
            return true;
        }
    }
    // 유닛 하나를 떨군다. 없으면 null
    public GroundUnit unload() {
        if (loadedIndex == -1) {
            return null; // 비어 있음
        }
        GroundUnit groundUnit = units[loadedIndex];
        units[loadedIndex--] = null;
        return groundUnit;
    }
}
