import com.javasm.SpringbootApplication;
import com.javasm.service.ProductService;
import com.javasm.sys.service.IDictionaryDatasService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = SpringbootApplication.class)
public class MyTest {
    @Autowired
    private IDictionaryDatasService datasService;
    @Autowired
    private ProductService productService;
    @Test
    public void test1(){
//        System.out.println(productService.getById(1001));
        System.out.println(datasService.list());
    }
}
