package demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo.models.Role;


@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
}