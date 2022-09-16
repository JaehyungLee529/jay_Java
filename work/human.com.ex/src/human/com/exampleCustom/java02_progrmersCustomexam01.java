package human.com.exampleCustom;

public class java02_progrmersCustomexam01 {

	// 메인메서드: 자바 프로그램의 시작점!
	public static void main(String[] args) {

		// 자바의 시작점은 6번째 줄인 public static void main에서 시작
		// 순차적으로 7줄부터 8,9,0.. 한줄씩 실행
		// 11번쨰 줄은 examEvenAndOddCustom(); 코드가 실행!
		examEvenAndOddCustom(30);
		// 16번째 줄은 public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내용이 다 실행되면 다시 12번쨰 줄 부터 시작

		// 관점: 하나의 행동, 물체 모든 것을 다양한 시점으로 보는 것
		// 1. 개발자 관점: 코드의 가독성: 다른 사람이 본인의
		// 코드를 객관적으로 분석할 수 있는가?
		// --변수이름: 변수이름으로 변수(메서드, 클래스이름)의 속성을
		// 알 수 있어야 한다 (구체적으로 쓰기)
		// --띄어쓰기 :코드영역{}을 구분짓고, 가족성을 높혀서 본인 코드
		//보기 편하게 수정할 것.
		//-- 조건절, 반복문의 위치를 전체적으로 볼 수 있도록 코드 정렬
		// 2. 컴퓨텨(시스템) 관점: 리소스 관리(컴퓨터 성능 최적화)
		//---컴퓨터가 개발자가 쓴 코드를 해석하고 실행하는 횟수를 줄이는 작업 
		//시간적 튜닝(알고리즘 개선(빅오표기법)
		//공간적 튜닝(메모이 공간 개선(변수의 객수를 줄이는 작업)ㄴ
		// <3>. 사용자 관점:(일반유저)> 문제해결능력
	}

	// 짝수와 홀수
	public static double examEvenAndOddCustom(int num) {

		// System.out.println("매개변수는"+num+"입니다");

		// 1부터 매개변수 num까지 범위 내에서
		// 2의 배수, 3의 배수, 4,5의 배수의 경우
		// 각각
		// System.out.println(i+"의 값은 ?배수 입니다!")
		// 문구를 출력하고, main메서드에서
		// (2)
		// examEvenAndOddCustom return값인 3의 배수, 4의배수, 5의배의
		// 개수를 double타입의 숫자로출력하시오.
		double count = 0;
		for (double a = 1; a <= num; a++) {
			if (a % 2 == 0) {

				System.out.println(a + "의 값은 " + 2 + "배수 입니다!");
				count = count + 1;
			}
			if (a % 3 == 0) {
				System.out.println(a + "의 값은 " + 3 + "배수 입니다!");
				count = count + 1;
			}
			if (a % 4 == 0) {
				System.out.println(a + "의 값은 " + 4 + "배수 입니다!");
				count = count + 1;
			}
			if (a % 5 == 0) {
				System.out.println(a + "의 값은 " + 5 + "배수 입니다!");
				count = count + 1;
			}

			// int num은 double로 자동형변환(casting)이 가능함

		}
		System.out.println(count);
		return count;

	}
}

