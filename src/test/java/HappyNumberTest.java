import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HappyNumberTest {

    HappyNumber happyNum = new HappyNumber();

    @Test
    void test1(){
        assertEquals(happyNum.TongHaiSo(139, 188),327);
    }

    @Test
    void test2(){
        assertEquals(happyNum.TongHaiSo(139, 1), 140);
    }

    @Test
    void test3(){
        assertEquals(happyNum.TongHaiSo(139, 500), 0);
    }

    @Test
    void test4(){
        assertEquals(happyNum.TongHaiSo(139, 2), 0);
    }

    @Test
    void test5(){
        assertEquals(happyNum.TongHaiSo(139, 499), 0);
    }
}
