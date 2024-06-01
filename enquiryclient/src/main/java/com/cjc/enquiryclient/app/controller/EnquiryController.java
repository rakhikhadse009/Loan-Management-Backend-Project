package com.cjc.enquiryclient.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.enquiryclient.app.model.Enquiry;
import com.cjc.enquiryclient.app.servicei.EnquiryServiceI;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	@Autowired
	EnquiryServiceI esi;

	@PostMapping("/saveEnquiry")
	public Enquiry saveEnquiry(@RequestBody Enquiry e) {
		Enquiry enquiry=esi.saveEnquiry(e);
		return enquiry;
	}
}
