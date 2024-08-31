package youssef.com.restfullapi.services;

import org.springframework.context.annotation.ComponentScan;
import youssef.com.restfullapi.api.v1.model.VendorDTO;
import youssef.com.restfullapi.api.v1.model.VendorListDTO;

public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
