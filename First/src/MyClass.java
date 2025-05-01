import java.util.*;
public class MyClass extends second {
	int a=200;
public static void main(String[]args) {
	
	MyClass t=new MyClass();
	
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	
	
	
}

@Override
void m1() {
	System.out.println("Calling Thrid");
}
@Override
void m3() {
	System.out.println("Calling Second");
}


}
