import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: ZhengTianLiang
 * @date: 2022/02/14  18:08
 * @desc:
 */
@SpringBootTest(classes = OtherTest.class)
public class OtherTest {

    @Test
    public void test1(){
        System.out.println(123);
    }
}
