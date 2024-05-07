package _01print;

public class T02_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1 = 'a';
		char ch2 = '1';
		char ch3 = 'ㄱ';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		
		//아스키코드 A 가 64라서 64+1은 아스키코드 B로 B 출력됨
		char ch4 = 'A' + 1 ;
		System.out.println(ch4);
		
// char ch6 = ch5 + 1 ; 자동형변환때문에 오류남
		char ch5 = 'B' +9;
		System.out.println(ch5);
		
		//A의 유니코드 +5 로 계산되어 v 출력
	    char ch7 = 'A' + '5';
	    System.out.println(ch7);
	}

}
