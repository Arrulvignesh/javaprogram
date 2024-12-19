import java.util.*;
public class callbyvalue {
	int data = 50;
	void change(callbyvalue cv) {
		cv.data = cv.data +100;
	}
	public static void main(String args[]) {
		callbyvalue cv = new callbyvalue();
		System.out.println("before change=" + cv.data);
		cv.change(cv);
		System.out.println("after change=" + cv.data);
	}

}
