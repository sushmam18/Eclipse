package com.xworkz.crudoperator;

public class stadiumStarter {

	
	public static void main(String[] args) {
		
		Stadium st=new Stadium();
		st.addname("chinnaswami");
		st.addname("Jawaharlal Nehru");
		st.addname("Rajiv Gandh");
		st.addname("Greenfield Internationa");
		st.addname("ghdkj");
		
		
		st.delete(4);
		st.update(2, "cm");
		st.display();
		
		// TODO Auto-generated method stub

	}

}
