package com.cjc.enquiryclient.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.enquiryclient.app.model.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>{

}
