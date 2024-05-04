package com.example.TelephoneNumberAndAddressDB.personalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalDetailService {

    @Autowired
    private PersonalDetailRepository personalDetailRepository;

    public List<PersonalDetail> listAll(){
        return (List<PersonalDetail>) personalDetailRepository.findAll();
    }

    public void save (PersonalDetail personalDetail){
        personalDetailRepository.save(personalDetail);
    }

    public PersonalDetail get (Integer intID) throws PersonalDetailNotFoundExemption {
        Optional<PersonalDetail> personalDetailRepositoryOptional = personalDetailRepository.findById(intID);
        if (personalDetailRepositoryOptional.isPresent()){
            return personalDetailRepositoryOptional.get();
        }
        throw new PersonalDetailNotFoundExemption(intID);

    }
    public void delete (int intID) throws PersonalDetailNotFoundExemption{
        Optional<PersonalDetail> personalDetailRepositoryOptional = personalDetailRepository.findById(intID);
        if (personalDetailRepositoryOptional.isPresent()){
            personalDetailRepository.delete(personalDetailRepository.findById(intID).get());
        }
        throw new PersonalDetailNotFoundExemption(intID);

    }
}
