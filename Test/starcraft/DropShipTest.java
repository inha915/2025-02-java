package starcraft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DropShipTest {
   @Test
    public void test1(){

       DropShip dropShip = new DropShip();

       final int createUnitCount = 3;
       for(int i=0; i<createUnitCount; i++){
           dropShip.load(new Marine());
       }
       int loadedCount =0;

       for(GroundUnit unit : dropShip.units){
           if(unit !=null){
               loadedCount++;
           }
           System.out.printf("%d. %s\n", loadedCount,unit);
       }
       //첫번째 인자은 기대하는 값 expected value
       //두번째 인자는 실제처리 된 값 actual value
       assertEquals(createUnitCount, loadedCount);
       assertEquals(createUnitCount-1, dropShip.loadedIndex);
    }
    @Test
    @DisplayName("가득 태웠다가 2명 떨어트리기")
    public void test2(){
       DropShip dropship = new DropShip();
       for(int i=0; i<dropship.units.length; i++){
           dropship.load(new Marine());
       }
       for(GroundUnit gu : dropship.units){
           assertNotNull(gu);
       }
       boolean result = dropship.load(new Marine());
       assertEquals(false, result);

       GroundUnit gu = dropship.unload();
       assertNotNull(gu);
       assertNull(dropship.units[dropship.units.length -1]);
       assertEquals(6, dropship.loadedIndex);

        GroundUnit gu2 = dropship.unload();
        assertNotNull(gu);
        assertNull(dropship.units[dropship.units.length -2]);
        assertEquals(5, dropship.loadedIndex);

        assertNotEquals(gu, gu2);
    }
}