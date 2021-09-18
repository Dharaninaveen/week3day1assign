package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop size is 30cm");
	}
	
	public static void main(String[] args) {
		Desktop deskobj=new Desktop();
		deskobj.desktopSize();
		deskobj.computerModel();
	}

}
