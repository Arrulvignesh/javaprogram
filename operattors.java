
public class operators {
	public static void main(String[]args) {
		//% operator 
		int a = 13,b= 4,ans,ans1,ans2;
		ans = a%b;
		System.out.println("modules answer" + ans);
		// / operator
		ans1 = a/b;
		System.out.println("division ans:" + ans1);
		// *
		ans2=a*b;
		System.out.println("multiplication"+ ans2);
		//-unary operator(++)
		//post Increment
		System.out.println("%valur is" + (a++));
		System.out.println("%valur is" + (++a));
		System.out.println("%valur is" + (a--));
		System.out.println("%valur is" + (--a));
		//assignment operator are arithmetic operators
		System.out.println(a+b);
		System.out.println(a%b);
		//comparison operator 
		int x=6,h=8;
		int e1= 20, f1=10,g1=30,result;
		result = ((e1>f1)?(e1>g1)?e1:g1:(f1>g1)?f1:g1);
		System.out.println("maximum of three numbers"+ result);
		int d = 0b1010;
		int e7=0b1100;
		System.out.println("d&e7:"+(d&e7));
		System.out.println("d!e7:" +(d|e7));
		System.out.println("d^e7"+(d^e7));
		System.out.println("d~e7:"+(~d));
		operators op1 = new operators();
		operators op2 = new operators();
		System.out.println((op1 instanceof operators));
		System.out.println((op2 instanceof operators));
		
	}

}


		int e1= 20, f1=10,g1=30,result;
		result = ((e1>f1)?(e1>g1)?e1:g1:(f1>g1)?f1:g1);
		System.out.println("maximum of three numbers"+ result);
		int d = 0b1010;
		int e7=0b1100;
		System.out.println("d&e7:"+(d&e7));
		System.out.println("d!e7:" +(d|e7));
		System.out.println("d^e7"+(d^e7));
		System.out.println("d~e7:"+(~d));
		operators op1 = new operators();
		operators op2 = new operators();
		System.out.println((op1 instanceof operators));
		System.out.println((op2 instanceof operators));
		
			
		
	}

}


