import com.czk.config.SpringConfig;
import com.czk.dao.RoleDao;
import com.czk.pojo.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RoleDao bean = context.getBean(RoleDao.class);
        Role select = bean.select(1);
        System.out.println(select);

    }
}
