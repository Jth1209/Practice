package Java0715;

public class Sam06 {

	public static void main(String[] args) {
		Sample01<Integer> age = new Sample01<>();
		Sample01<String> name = new Sample01<>();
		
		age.setT(123);
		name.setT("홍길동");
		System.out.println(age.getT() + " , "+ name.getT());
	}

}
