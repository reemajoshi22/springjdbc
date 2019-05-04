package com.example.maven.hibernate.springjdbc;


public class Dept {
	private Emp emp;
	
	
	

	/*public Dept(Emp emp) {
		super();
		System.out.println("dept constructor");
		this.emp = emp;
	}
*/
	public Emp getEmp() {
		return emp;
	}



//@Autowired
	public void setEmp(Emp emp) {
		System.out.println("setter of emp");
		this.emp = emp;
	}




	public void showDep(){
		 System.out.println("dept");
	 }
	
	  
}
