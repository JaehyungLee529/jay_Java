package human.com.exampleCustom;

public class java03_custom20220916 {
	// 메인메서드 : 자바 프로그램의 시작점!

	// 메인메서드 : 자바 프로그램의 시작점!
	public static void main(String[] args) {

		// 자바의 시작점은 public static void main에서 시작
		// 순차적으로 한 줄씩 실행
		// examEvenAndOddCustom(); 코드가 실행!
		double result = examEvenAndOddCustom(30);
		System.out.println(result);
		// public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내용이 다 실행되면 다음 줄 실행

		// 관점 : 하나의 행동, 물체 모든 것을 다양한 시점으로 보는 것
		// 1.개발자 관점 : 코드의 가독성 : 다른 사람이 본인의
		// 코드를 객관적으로 분석할 수 있는가?
		// --변수이름 : 변수이름으로 변수(메서드, 클래스 이름)의 속성을
		// 알 수 있어야 한다 (구체적으로 쓰기)
		// --띄어쓰기 : 코드영역{}을 구분짓고, 가독성을 높혀서 본인 코드
		// 보기 편하게 수정할 것
		// --조건절, 반복문의 위치를 전체적으로 볼 수 있도록 코드 정렬
		// 2.컴퓨터(시스템) 관점: 리소스 관리(컴퓨터 성능 최적화)
		// --컴퓨터가 개발자가 쓴 코드를 해석하고 실행하는 횟수를 줄이는 작업
		// 시간적 튜닝(알고리즘 개선(빅오표기법))
		// 공간적 튜닝(메모리 공간 개선(변수의 갯수를 줄이는 작업)
		// <3>.사용자 관점: (일반 유저) > 문제해결능력
	};

	// 짝수와 홀수
	public static double examEvenAndOddCustom(int num) {
		double count = 0;
		double count2multiple = 0;
		double count3multiple = 0;
		double count4multiple = 0;
		double count5multiple = 0;

		// (i가)1부터 30까지 1씩 증가하면서 그 숫자가
		// 2,3,4,5의 배수인지 확인하는 for문
		for (int i = 1; i <= num; i++) {
			// i의 숫자가 2의 배수인지 확인 (2로 나누어서 나머지가 0이면 2의 배수)
			if (i % 2 == 0) {
				count++;
				count2multiple++;
				if (i % 4 == 0) {
					count++;
					count4multiple++;
				}
			}
			if (i % 3 == 0) {
				count++;
				count3multiple++;
			}

			if (i % 5 == 0) {
				count++;
				count5multiple++;
			}
		}

		// 1) 2,3,4,5의 배수의 개수중 비교해서 많은 배수의 수를 갖고있는 변수 만들기
		// 2의배수의 값이 많다 라는 결과
		int multiple2win = 2;
		int multiple3win = 3;
		int multiple4win = 4;
		int multiple5win = 5;

		int resultFirst = 0;
		int resultSecond =0;

//		if (count2multiple > count3multiple) {
//			// 2)배수의 개수가 같을 경우 처리
//			if (count2multiple == count3multiple) {
//			} else {
//				// 2의 배수가 3의 배수의 갯수보다 많다는 것을
//				// resultFirst 변수에 저장
//				resultFirst = multiple2win;
//				
//				
//				
//				
//			}
//		}
		
		double  a =count2multiple;
		double  b =count3multiple;
		double  c =count4multiple;
		double  d =count5multiple;
		
		

		if(a<b && a>c && a>d) {
			resultSecond= multiple2win;
		}else if(a>b && a<c &&a>d) {
			//c>a>>b>d
			resultSecond= multiple2win;
		}else if(a>b && a>c &&a<d) {
			//d>a>c>d
			resultSecond= multiple2win;
		}
		if(b<a && b>c && b>d) {
			//a>b>c>d
			resultSecond= multiple3win;
		}else if(b>a && b<c &&b>d) {
			//c>b>a>d
			resultSecond= multiple3win;
		}else if(b>a && b>c &&b<d) {
			//d>b>a>c
			resultSecond= multiple3win;
		}
		if(c<a && c>b && c>d) {
			//a>c>b>d
			resultSecond= multiple4win;
		}else if(c>a && c<b &&c>d) {
			//b>c>a>d
			resultSecond= multiple4win;
		}else if(c>a && c>b &&c<d) {
			//d>c>a>b
			resultSecond= multiple4win;
		}
		if(d<a && d>b && d>c) {
			//a>d>b>c
			resultSecond= multiple5win;
		}else if(d>a && d<b &&d>c) {
			//b>d>a>c
			resultSecond= multiple5win;
		}else if(d>a && d>b &&d<c) {
			//c>d>a>b
			resultSecond= multiple5win;
		}
		
//		if(a<b && a>c && a>d) {
//			resultSecond= multiple2win;
//		}else if(a>b && a<c &&a>d) {
//			//c>a>>b>d
//			resultSecond= multiple2win;
//		}else if(a>b && a>c &&a<d) {
//			//d>a>c>d
//			resultSecond= multiple2win;
//		}
////			a>b>c>d
//		if(b<a && b>c && b>d) {
//			resultSecond= multiple3win;
//		}else if(b>a && b<c &&b>d) {
//			//c>a>>b>d
//			resultSecond= multiple3win;
//		}else if(b>a && b>c &&b<d) {
//			//d>a>c>d
//			resultSecond= multiple3win;
//		}
//		
//		if(c<a && c>b && c>d) {
//			resultSecond= multiple4win;
//		}else if(c>a && c<b &&c>d) {
//			//c>a>>b>d
//			resultSecond= multiple4win;
//				//d>c>a>b
//		}else if(c>a && c>b &&c<d) {
//			//d>a>c>d
//			resultSecond= multiple4win;
//		}
//		
//		if(d<a && d>b && d>c) {
//			resultSecond= multiple5win;
//		}else if(d>a && d<b &&d>c) {
//			//c>a>>b>d
//			resultSecond= multiple5win;
//		}else if(d>a && d>b &&d<c) {
//			//d>a>c>d
//			resultSecond= multiple5win;
//		}
		
		
		// 배수 갯수 비교 후 결과 출력

		if (resultSecond == multiple2win) {
			System.out.println("2 번째로 많은 배수의 갯수를 가진 배수는 2의 배수입니다.");
		}
		if (resultSecond == multiple3win) {
			System.out.println("2 번째로 많은 배수의 갯수를 가진 배수는 3의 배수입니다.");
		}
		if (resultSecond == multiple4win) {
			System.out.println("2 번째로 많은 배수의 갯수를 가진 배수는 4의 배수입니다.");
		}
		if (resultSecond == multiple5win) {
			System.out.println("2 번째로 많은 배수의 갯수를 가진 배수는 5의 배수입니다.");
		}

		System.out.println("2의 배수의 개수는 " + count2multiple);
		System.out.println("3의 배수의 개수는 " + count3multiple);
		System.out.println("4의 배수의 개수는 " + count4multiple);
		System.out.println("5의 배수의 개수는 " + count5multiple);

		// (1)
		// 1부터 매개변수 num까지 범위 내에서 = for문 쓰기
		// 2의 배수, 3의 배수, 4의 배수, 5의 배수의 경우
		// 2의 배수 : 2,4,6,8,10,12...
		// 3의 배수 : 3,6,9,12,15...
		// 4의 배수 : 4,8,12,16...
		// 5의 배수 : 5,10,15,20...
		// >>?의 배수는 ?으로 나누어서 나머지가 0인 수
		// 각각
		// System.out.println(i+"의 값은 ?배수 입니다!")
		// 문구를 출력하고, main메서드에서
		// (2)
		// examEvenAndOddCustom return값인 [2의 배수,] 3의 배수, 4의 배수, 5의배수의
		// 개수를 double타입의 숫자로 출력하시오
		// ******(3)
		// 2,3,4,5의 배수의 갯수 중에 2번 째로 많은 배수의 갯수를 가진
		// ?배수의 이름을 출력하시오 (단, 지금까지 배웠던 내용을 활용하여 작성하세요)

		// int num은 double로 자동형변환(casting)이 가능함
		// () 강제형변환 가능
		return count;
	}

	// 나머지가 1이 되는 수 찾기
	public static void examRemainderOneCustom(int num) {
			   //num-1
			      //매개변수 n을 받아서 i로 나눈 나머지가 1인 
			      //가장 큰 자연수 i를 리턴하도록 구현하시오.
			      //(단, 컴퓨터 입장에서 최소한의 연산으로 구현 해 보세요)
			      int result = 0;
			      int i = num;
			      for(;num==2;num--) {
			         if(i%num == 1) {
			            result = i;
			            break;
			         }
			        

		   }
	}
	// 두 정수 사이의 합
	public static void examSumBetweenTwoIntegerCustom() {

	}

	// 부족한 금액 계산하기
	public static void examInsufficientAmountCalcCustom() {

	}

	// 2016년
	public static void exam2016yearCustom() {

	}

}
