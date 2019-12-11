package com.jsonb.example.JsonbExample.controllers;

import com.jsonb.example.JsonbExample.model.Address;
import com.jsonb.example.JsonbExample.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member")
public class AddressController {
  @Autowired AddressRepository addressRepository;

  @GetMapping(value = "/address/{memberId}")
  public String getDetails(@PathVariable String memberId) {

    Address address = addressRepository.getOne(memberId);
    System.out.println(address.getOtherAddresses());
    return "Success";
  }
}
