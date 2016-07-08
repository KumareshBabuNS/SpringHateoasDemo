package pas.au.pivotal.spring.hateoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCLR implements CommandLineRunner
{

    private final EmployeeRestRepository employeeRestRepository;

    @Autowired
    public MyCLR (EmployeeRestRepository employeeRestRepository)
    {
      this.employeeRestRepository = employeeRestRepository;
    }

    @Override
    public void run(String... strings) throws Exception
    {
        employeeRestRepository.save(new Employee("pas"));
        employeeRestRepository.save(new Employee("lucia"));
        employeeRestRepository.save(new Employee("lucas"));
        employeeRestRepository.save(new Employee("siena"));
    }
}
