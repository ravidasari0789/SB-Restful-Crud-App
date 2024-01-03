package com.sbrestcrudapi.model;


public class Customer {

	
	          private Integer cid;
	          
	          private String name;
	          
	          private String address;
	          
	          private Long salary;
	          
	     

			public Customer(Integer cid, String name, String address, Long salary) {
				super();
				this.cid = cid;
				this.name = name;
				this.address = address;
				this.salary = salary;
			}

			public Integer getCid() {
				return cid;
			}

			public void setCid(Integer cid) {
				this.cid = cid;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public Long getSalary() {
				return salary;
			}

			public void setSalary(Long salary) {
				this.salary = salary;
			}

			@Override
			public String toString() {
				return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
			}
}
