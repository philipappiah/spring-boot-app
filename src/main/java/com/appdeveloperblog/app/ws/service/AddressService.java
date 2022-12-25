package com.appdeveloperblog.app.ws.service;

import java.util.List;

import com.appdeveloperblog.app.ws.shared.dto.AddressDto;

public interface AddressService {
    List<AddressDto> getAddresses(String userId);
    AddressDto getAddress(String addressId);
    
}
