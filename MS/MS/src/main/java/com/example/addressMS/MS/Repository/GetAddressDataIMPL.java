package com.example.addressMS.MS.Repository;

import com.example.addressMS.MS.Service.GetAddressData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GetAddressDataIMPL {

    @Autowired
    GetAddressData getAddressData;

    public AddressEntity getfromtable(int id){

        AddressEntity addressEntity= getAddressData.findById(id).get();
        return addressEntity;

    }


}
