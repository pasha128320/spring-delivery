package com.pizza.delivery.service;

import com.pizza.delivery.dto.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> findAllAdressesByUserId(Long id);

    void saveAddress(AddressDto dto);
}
