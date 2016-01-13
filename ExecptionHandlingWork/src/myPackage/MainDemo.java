package myPackage;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * @author Aimal Khan
		 * This class is used to call the method of add class
		 * @params
		 */
		
	
		Add add = new Add();
		try{
			add.add();
		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}		
	}

}
