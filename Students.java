package week3.day1assign;

public class Students {
	
	public void getStudentsInfo(int id) {
		System.out.println("Student ID is: "+ id);
	}
	public void getStudentsInfo(int id,String name) {
		System.out.println("Student ID is: "+ id);
		System.out.println("Student Name is: "+ name);
	}
	public void getStudentsInfo(String email,long mob) {
		System.out.println("Student Mail ID is: "+ email);
		System.out.println("Student MobileNumber is: "+ mob);
	}

	public static void main(String[] args) {
		Students studobj=new Students();
		studobj.getStudentsInfo(1308);
		studobj.getStudentsInfo(1308, "Dharani");
		studobj.getStudentsInfo("abc@gmail.com",987654321 );
		

	}

}
