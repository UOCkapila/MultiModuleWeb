package hms.mchoice.user.Repository;

import hms.mchoice.user.Domain.User;

import java.util.List;

/**
 * Created by kapila on 9/4/15.
 */
public interface UserRepository {
    public List viewAll();
    public void addUser(User user);
    public void removeUser(User user);
    public void updateUser(User user);
}
