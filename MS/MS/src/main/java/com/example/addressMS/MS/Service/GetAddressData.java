package com.example.addressMS.MS.Service;

import com.example.addressMS.MS.Repository.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface GetAddressData extends JpaRepository<AddressEntity,Integer> {

}
