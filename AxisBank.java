package week3.day1assign;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit in AxisBank");
	}
	
	public static void main(String[] args) {
		AxisBank axisobj=new AxisBank();
		axisobj.savings();
		axisobj.fixed();
		axisobj.deposit();
	}
}
