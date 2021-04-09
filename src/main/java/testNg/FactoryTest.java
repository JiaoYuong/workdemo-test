package testNg;

import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;



@Listeners
class FactoryTest {

    private String host;
    private int ip;

    public FactoryTest(String host,int ip) {
        this.host = host;
        this.ip = ip;
    }
    @Test
    public void login(){
        System.out.println("登录：" + ip + host);
    }
    @Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("退出:" + ip  + host);
    }
    @Factory
    public static Object[] create(){
        List<FactoryTest> list = new ArrayList<FactoryTest>();
        list.add(new FactoryTest("192.168.10.16",8082));
        list.add(new FactoryTest("192.168.10.16",8082));
        return list.toArray();
    }
}
