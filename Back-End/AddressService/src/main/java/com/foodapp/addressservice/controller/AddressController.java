package com.foodapp.addressservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.foodapp.addressservice.model.Address;
import com.foodapp.addressservice.service.AddressService;
@Validated
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/fooddelivery/address")
public class AddressController {

   
   private final AddressService addressService;
   
   @Autowired
    public AddressController(AddressService addressService) {
    	this.addressService=addressService;
    }

    @PostMapping
    public ResponseEntity<Address> registerAddress(@RequestBody Address address){

        Address savedAddress = addressService.registerAddress(address);

        return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<Address> updateAddress(@RequestBody Address address){

        Address updatedAddress = addressService.updateAddress(address);

        return new ResponseEntity<>(updatedAddress, HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity<Address> deleteAddress(@PathVariable Integer addressId){

        Address removedAddress = addressService.deleteAddressById(addressId);

        return new ResponseEntity<>(removedAddress, HttpStatus.OK);

    }

    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getAddressbyId(@PathVariable Integer addressId){

        Address address = addressService.getAddress(addressId);

        return new ResponseEntity<>(address, HttpStatus.OK);

    }
    @GetMapping("/addresses/{userId}")
    public ResponseEntity<List<Address>> getAddressesByUserId(@PathVariable Integer userId) {
        List<Address> addresses = addressService.getAddressesByUserId(userId);
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

}
