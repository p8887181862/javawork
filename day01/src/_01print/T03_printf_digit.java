package _01print;

public class T03_printf_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//d앞에 7써주면 앞으로 7자리 먹겠다 라는뜻
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 3200);
		
		System.out.printf("%9d\n", 3200);
		
		//숫자앞에 0 써주면 빈자리는 0으로 채우겠다
		System.out.printf("%09d\n", 3200);
		//0 말고 다른숫자는 안되네..ㅋㅋ
		System.out.printf("%19d\n", 3200);
		
		
		System.out.printf("[%10s]" , "abcdefg");
		//-를쓰면 왼쪽정렬로 뒤가 빈다
		System.out.printf("[%-10s]" , "abcdefg");
		//숫자안쓰면 글자에 맞춰서 적힙니다
		System.out.printf("[%s]" , "abcdefg");
		
		//소수점 두자리까지만 나타내는데 반올림하네
		System.out.printf("%6.2f\n" , 13.426);
		
		System.out.printf("%6.5f\n" , 13.423476);
		
		
	}

}
