package com.example.addressMS.MS.Controller;

import com.example.addressMS.MS.Repository.AddressEntity;
import com.example.addressMS.MS.Repository.GetAddressDataIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    GetAddressDataIMPL getAddressDataIMPL;

    @GetMapping("/hi")
    public String printOnScreen(){
        return "HELLO WORLD!";
    }

    @GetMapping("/getbyID/{id}")
    public AddressEntity getfromTable(@PathVariable("id") int id){

         AddressEntity e=  getAddressDataIMPL.getfromtable(id);

        return e;
    }

}
