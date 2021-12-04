import com.javasm.ApplicationStart;
import com.javasm.sys.service.IDictionaryDatasService;
import com.javasm.sys.service.IDictionaryTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author:19
 * @date: 2021/12/4 21:29
 * @className: Mytest
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */

@SpringBootTest(classes = ApplicationStart.class)
public class Mytest {
    @Autowired
    private IDictionaryDatasService service;
    @Autowired
    private IDictionaryTypeService typeService;
    @Test
    public void test1(){
        System.out.println(typeService.queryByTypes(new String[]{"base_color"}));
    }

}
