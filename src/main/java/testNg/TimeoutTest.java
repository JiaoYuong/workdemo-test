package testNg;

import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(invocationCount = 6, invocationTimeOut = 4900,threadPoolSize = 2)
    public void loginTest() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("login test");

    }
}
