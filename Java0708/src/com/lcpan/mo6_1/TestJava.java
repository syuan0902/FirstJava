package com.lcpan.mo6_1;

public class TestJava {

	public static void main(String[] args) {
		Employee e = new Employee();
		//e.empo = 111;
		//e.name = "Tom"
		e.setEmpno(111);
		e.setName("Tom");
		System.out.println("empnp = " + e.getEmpno());				
		System.out.println("name = " + e.getName()); 
	}

}
