package com.sbrestcrudapi.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbrestcrudapi.model.Customer;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@PostMapping(value = "/addcustomerdata", produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> saveCustomerDetails(@RequestBody Customer customer) {
		logger.info("saveCustomerDetails() method statred");
		System.out.println(customer);
		logger.info("saveCustomerDetails() method endded");
		String data = "customer saved in sucessfully";
		return new ResponseEntity<String>(data, HttpStatus.CREATED);

	}

	@PutMapping(value = "/updatecustomerdata", produces = "text/plain", consumes = "Application/json")
	public String updateCustomerData(@RequestBody Customer customer) {
		logger.info("updateCustomerData() method statred");
		System.out.println(customer);

		String update = "updated sucessfully";
		logger.info("updateCustomerData() method endded");
		return update;
	}

	@DeleteMapping(value = "/deleteCustomerData", produces = "text/plain")
	public ResponseEntity<String> deleteCustomerData(@RequestParam("id") int id) {
		logger.info("deleteCustomerData() method statred");
		System.out.println(id);
		String delete = "delete sucessfully";
		logger.info("deleteCustomerData() method endded");
		return new ResponseEntity<String>(delete, HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/getCustomer", consumes = "Application/json")
	public ResponseEntity<Customer> getCustomer() {
		logger.info("getCustomer() method statred");
		Customer customer = new Customer(10001, "ravi", "blr", (long) 200000);
		logger.info("getCustomer() method endded");
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllCustomerdata", consumes = "Application/json")
	public List<Customer> getAllCustomer() {
		logger.info("getAllCustomer() method statred");
		Customer customer = new Customer(10001, "ravi", "blr", (long) 200000);
		Customer customer1 = new Customer(10002, "abc", "hyd", (long) 100000);
		Customer customer2 = new Customer(10003, "hussain", "blr", (long) 200000);

		List<Customer> list = Arrays.asList(customer, customer1, customer2);
		logger.info("getAllCustomer() method endded");
		return list;
	}
}
