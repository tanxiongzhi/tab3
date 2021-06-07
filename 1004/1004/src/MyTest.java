
import org.junit.Test;

import java.util.ArrayList;

public class MyTest {
    @Test
    public void test1(){
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        Solusion1 solusion1 = new Solusion1();
        int res = solusion1.longestOnes(arr,2);
        System.out.println(res);
    }

    @Test
    public void test2(){
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        Solusion1 solusion1 = new Solusion1();
        int res = solusion1.longestOnes(arr,3);
        System.out.println(res);
    }
}
