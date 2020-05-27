import com.czk.config.SpringConfig;
import com.czk.pojo.Role;
import com.czk.service.RoleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RoleService roleService = context.getBean(RoleService.class);
        Role role = roleService.getRole(1);
        System.out.println(role);
    }
}
