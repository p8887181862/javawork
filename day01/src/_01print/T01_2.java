package _01print;

class T01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본자료형
		/* 정수 : int
		 * 실수 : double
		 * 참, 거짓 : 눈에안보임 ㅠ
		 * 문자3개 : char 눈에안보임 ㅠ
		 * 
		 * 
		// 단축키 ctrl + /
		 */
         /* 단축키 ctrl + shift + /
		/*정수타입 : byte(1byte), char(2byte), short, int , long
		 * 
		 * 정수타입 : 
		 * byte 1바이트
		 * char 2바이트
		 * short 2바이트
		 * int 4바이트
		 * long 8바이트
		 */
		int num1;
		int num2 = 10;
	
		num1=11;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1 + num2);
		System.out.println(num1 + 3 + num2);
		
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println(sum + 7);
		System.out.println(num1 + num2 + 10);
		System.out.println(10 + num1 + num2 + 10);
		
//		변수를 하나 만들어 sum + 5를 한 결과를 넣으시오 그리고 출력하시오
		int num3 = 10;
		int num4 = 1;
		int sum1 = num3 + num4;
		
		System.out.println(sum1 + 5);
		
		
		long long01 = 5000000000000000000L;
		
		double double01 = 37.123455;
		System.out.println(double01);
		double double02 = 22.4862222;
		System.out.println(double02 + double01);
//		 더블이 플롯보다 소수점이 조금더 정확 6자리까지라고하셨나..
		
		
		//기본자료형 8바이트를 플로트 4바이트에 ( 큰자료형을 작은자료형에 넣어서 오류남
		float float01 = 12.102358f;
		System.out.println(float01);
	
		
	}

}
