package junit;

import ArrayHandle.ArrayHandle;
import org.junit.Assert;
import org.junit.Test;

public class Junit4Test {
    @Test
    public void testArraySort(){
        ArrayHandle arrayHandle = new ArrayHandle();
        Integer[] source = {1,2,3,4,5};
        Integer[] expet = {3,2,1,4,5};
        Integer[] actual = arrayHandle.arraySort(expet);
        Assert.assertArrayEquals(source,actual);

    }
}
