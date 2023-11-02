package ma.nouhaila.repositories;

import ma.nouhaila.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRoleName(String roleName);


}
