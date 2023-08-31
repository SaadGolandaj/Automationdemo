package PropertyfileOperation;

public class Propertyfiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadPropertyfile rd=new ReadPropertyfile();
		String finalname=rd.getName("Name");
		System.out.println(finalname);
		String finaladdress=rd.getName("Address");
		System.out.println(finaladdress);
		
		
		

	}

}
