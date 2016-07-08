package pas.au.pivotal.spring.hateoas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface EmployeeRestRepository extends JpaRepository<Employee, Long>
{
}
