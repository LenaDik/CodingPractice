import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test

    public void testAscendingSequenceHappyPath() {
//1
        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

//2
        //"1, 2, 3, 4, 5"

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

//3
        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceZeroCase() {
        //1A
        int startNumber = 0;
        int endNumber = 3;
        int[] expectedResult = {0, 1, 2, 3};

        //2A
        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        //3A
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeNumbersCase() {
        int startNumber = -8;
        int endNumber = -4;
        int[] expectedResult = {-8, -7, -6, -5, -4};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequencePositiveNumbersCase() {
        int startNumber = -2;
        int endNumber = 3;
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
