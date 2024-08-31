package youssef.com.restfullapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import youssef.com.restfullapi.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
