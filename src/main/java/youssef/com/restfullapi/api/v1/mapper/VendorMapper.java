package youssef.com.restfullapi.api.v1.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import youssef.com.restfullapi.api.v1.model.VendorDTO;
import youssef.com.restfullapi.domain.Vendor;

@Mapper(componentModel = "spring")
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
