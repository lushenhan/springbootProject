import com.javasm.CommodityManagement.service.ProductService;
import com.javasm.SpringbootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = SpringbootApplication.class)
public class MyTest {

    @Autowired
    private ProductService productService;
    @Test
    public void test1(){
        System.out.println(productService.getById(1001));
    }
}
