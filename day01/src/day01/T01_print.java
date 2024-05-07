package day01;

public class T01_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 한줄주석 설명이나 기타 사항들을 적는다
		/*
		 여러줄 주석
		 여러줄에 걸쳐 설명이나 특이사항들을 적을 때 사용
		  
		 */
		// 출력문 : println -> 출력후 줄바꿈
//		 문자열을 출력할 때는 반드시 쌍따옴표("")를 넣어준다
		
		System.out.println("더조은 컴퓨터 학원");
		System.out.println("내이름 : 홍길동");
		
		System.out.println(3+7);
		System.out.println(5+3);
		System.out.println(7+1);
		
		// + 기호는 숫자였을때는 연산을 하고
		// 문자열 이었을 때는 문자들을 연결
		System.out.println(5+2+"+문자열 연결");
		System.out.println("강의실 : "+" 801호");
		
		//앞에가 문자열이면 뒤도 문자열로 인식  연산하려면 앞에다 해야하나
		System.out.println("연산결과 : " +12+34);
		//뒤에다 괄호치면 앞에 문자열있어도 숫자 연산함 ㅋㅋ
		System.out.println("연산결과 : " +(3+1));
		
		//곱하기는 괄호없이 연산가능 + - 기호만 문자열로 인식하나?
		System.out.println("연산결과 : " +3*4);
		
		//print쓰면 줄바꿈 없이 연결되어 출력
		System.out.print("줄바꿈 안함");
		System.out.print("이제 줄바꿈안됨");
		//print 쓰고나서 다음줄에 영향이 오나봄 프린트라인썼는데 줄밤꿈함? 에서 내려감
		System.out.println("줄바꿈함");
		System.out.print("줄바꿈함?");
		
		System.out.println("줄바꿈 끝");
		
		System.out.println("이제 새 줄바꿈");
	}

}
