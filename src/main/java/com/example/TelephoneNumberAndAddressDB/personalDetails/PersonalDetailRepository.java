package com.example.TelephoneNumberAndAddressDB.personalDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailRepository extends JpaRepository<PersonalDetail, Integer> {
}
