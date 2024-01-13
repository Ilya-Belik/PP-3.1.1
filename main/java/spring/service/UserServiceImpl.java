package spring.service;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.DAO.UserDAO;
import spring.Model.User;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }
    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
