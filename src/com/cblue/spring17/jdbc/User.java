package com.cblue.spring17.jdbc;

public class User {
	
		private int id;  
	    private String name;  
	    private String pass;
	   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", pass=" + pass + "]";
		}
		public void setName(String name) {
			this.name = name;
		}
		
	    
	     
	
}
