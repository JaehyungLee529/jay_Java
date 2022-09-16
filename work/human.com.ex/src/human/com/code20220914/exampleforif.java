package human.com.code20220914;

public class exampleforif {

	public static void main(String[] args) {
		// double num10= 1048을 할당해주고,(정수는 0,1,2,3,4,5..수소표현)
		// 1048을 지속적으로 1/2로 줄이면 몇 번에 걸펴서 줄여야
		// 2보다 작게 되는 지 알 수 있는 출력하는 for문을 작성하시오.
		// ==2보다 작으면 for문을 종료해도된다.
		// console 예)
		// for문 시작 3 입니다.
		// num10은 지금 **입니다

		// double : num10이라는 변수에 들어갈 수 있는 타입을 선언
		// num10 변수이름
		// = 1048; :1048이라는 데이터를 =(대입연산자) 좌측에 있는 변수에다가 넣기 (할당)
		double num10 = 1048;
		// int i =1; :for()은 변수가i가 1부터 시작
		// i<20; : i가 20이하 일때까지 for문을 반복 실행
		// i++ : i가 for문을 한 번 돌아갈 때마다 i는 1씩 증가한다 (i++)= (i=i+1)
		for (int i = 1; i <= 20; i++) {
			// =(대입연사자) 기준으로 우측에 있는 코드를 실행하고, 결과값을 좌측에 할당
			// num10/2의 값이 대입연산자 좌측에 있는 num10이라는 변수에 넣기 (할당)

			// System.out.println("for문시작 "+i+ " 입니다");
			// System.out.println("num10은 지금 " +num10+ "입니다");
			num10 = num10 / 2;
			if (num10 < 2) {
				System.out.println("for문시작 " + i + " 입니다");
				System.out.println("num10은 지금 " + num10 + "입니다");
			}

			// System.out.println(num10);

			// int i는 for문을 몇 번 돌렸는지 확인하는 변수 (변하는 수)
			// int i= 1;
			// double num10 =1048은 초기값
			// num10>2; 조건씩으로써 unm10이 2보다 클 떄까지 (조건이 성립이 되서) for문을 돌리겠다!
			// for(조건식)에서 먼저 확인되는 우선순위
			// 1.초기식 double num10= 1048;
			// 2.조건식 num10<2; 확인
			// 3.코드실행
			// 4.증감식 i++은 for문이 1회 모두 실행 된 후에 i의 값이 변동뒤 2번으로 이동 실행
			// 5. 조건식 unm10>2; for문 실행여부 확인
			// for(double num10=1048; num10>2; i++) {
			// System.out.println("for문시작 "+i+ " 입니다");
			// System.out.println("num10은 지금 " +num10+ "입니다");
			// num10 = num10/2;

		}
	}
}