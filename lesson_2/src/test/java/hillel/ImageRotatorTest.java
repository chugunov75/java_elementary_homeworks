package hillel;

import static org.junit.Assert.*;
import org.junit.Test;

public class ImageRotatorTest 
{
    @Test
    public void test1()
    {
        int[][] img= new int[][]
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int[][] expected= new int[][]
        {
            {4, 8},
            {3, 7},
            {2, 6},
            {1, 5}
        };

        int[][] actual = ImageRotator.rotateIntoNewArray(img);

        assertArrayEquals(expected, actual);
    }

    public void test2()
    {
        int[][] img= new int[][]
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] expected= new int[][]
        {
            {3, 6, 9},
            {2, 5, 8},
            {1, 4, 7}
        };

        ImageRotator.rotateIntoSameArray(img);

        assertArrayEquals(expected, img);
    }
}
