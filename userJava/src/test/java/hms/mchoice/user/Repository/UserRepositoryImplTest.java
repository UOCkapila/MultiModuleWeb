package hms.mchoice.user.Repository;

import hms.mchoice.user.Domain.User;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class UserRepositoryImplTest extends TestCase {
    UserRepository testRepo = new UserRepositoryImpl();

    @Test
    public void testViewAll() throws Exception {
        List<User> userList =testRepo.viewAll();
        for(User user:userList){
            System.out.println(user.getUserId());
        }
    }

    public void testAddUser() throws Exception {

    }

}