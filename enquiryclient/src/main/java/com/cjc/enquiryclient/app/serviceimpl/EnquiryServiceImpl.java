package com.cjc.enquiryclient.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.enquiryclient.app.model.Enquiry;
import com.cjc.enquiryclient.app.repository.EnquiryRepository;
import com.cjc.enquiryclient.app.servicei.EnquiryServiceI;
@Service
public class EnquiryServiceImpl implements EnquiryServiceI{

	@Autowired
	EnquiryRepository er;
	
	@Override
	public Enquiry saveEnquiry(Enquiry e) {
		
		return er.save(e);
	}

}
