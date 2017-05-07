import com.pmtu.caffe.dao.GenericDAO;
import com.pmtu.caffe.dao.Impl.UserDaoImpl;
import com.pmtu.caffe.entity.RoleEntity;
import com.pmtu.caffe.entity.UserEntity;
import com.pmtu.caffe.service.Impl.UserService;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mr Tu on 06-05-2017.
 */
public class UserTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService=(UserService)context.getBean("userService");
    @Test
    public void createUser(){

        UserEntity u=new UserEntity();
        u.setUsername("test 1");
        u.setPassword("123456");
        u.setCreatedDate(new LocalDate());
        u.setStatus(1);
        /*RoleEntity role=new RoleEntity();
        role.setName("admin");
        role.setStatus(1);
        role.setCreatedDate(new LocalDate());
        u.setRoleEntity(role);*/
        try {
            userService.create(u);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }
    @Test
    public void testGetUser(){
        Long id=new Long(6);
        try {
            UserEntity userEntity =(UserEntity)userService.get(id);
            Assert.assertNotNull(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
    @Test
    public void testGetAllUser(){
        Long id=new Long(6);
        try {
            List<UserEntity> list=userService.getall();
            Assert.assertNotNull(list);
            Assert.assertEquals(1,list.size());
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void updateUser(){

        UserEntity u=new UserEntity();
        u.setId(6L);
        u.setUsername("test 2");
        u.setPassword("654321");
        u.setCreatedDate(new LocalDate());
        u.setStatus(0);
        try {
            userService.update(u);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }
    @Test
    public void deleteUser(){

        Long id=new Long(6);
        try {
            userService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }
}
