package youssef.com.restfullapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import youssef.com.restfullapi.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
