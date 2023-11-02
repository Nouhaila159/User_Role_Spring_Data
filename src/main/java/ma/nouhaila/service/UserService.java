package ma.nouhaila.service;

import ma.nouhaila.entities.Role;
import ma.nouhaila.entities.User;


public interface UserService {

    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User autehticate(String userName,String password);

}
