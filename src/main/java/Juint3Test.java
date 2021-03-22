import ArrayHandle.ArrayHandle;
import junit.framework.TestCase;
import org.junit.Assert;



//Junit3的测试类必须继承至TestCase
public class Juint3Test extends TestCase {
    ////Junit3的测试方法必须以test开头
    public void testArraySort(){
        ArrayHandle arrayHandle = new ArrayHandle();
        Integer[] source = {1,2,3,4,5};
        Integer[] expet = {3,2,1,4,5};
        Integer[] actual = arrayHandle.arraySort(expet);
        Assert.assertArrayEquals(source,actual);

    }

}
