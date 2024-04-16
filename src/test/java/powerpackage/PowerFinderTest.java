package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.power(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.power(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert PowerFinder.power(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert PowerFinder.power(3, 2) == 9;
    }

    @Test
    public void twoRaisedToMinusOneIsHalf() {
        assert PowerFinder.power(2,-1) == 0.5;
    }

    @Test
    public void twoRaisedToZeroIsOne() {
        assert PowerFinder.power(2,0) == 1;
    }
}
