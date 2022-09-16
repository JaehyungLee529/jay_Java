package human.com.code20220915;

public class java02_casting {

//	﻿
//	20220915
//
//	1.if/else문과 동일한 조건이라도 상단에 있는 if문이 실행
//
//	2.break :for문을 종료시키는 구문(가장 가까이 있는 [반복문]을 종료 시킴
//
//	3/casting:다른 타입에 있는 벼ㅓㄴ수에 데이터를 할당하기 위해 타입을 변환
//
//	묵시적 형변환(btye가 큰 범위에서 byte작은 범위로)과
//
//	강제 형변환 존재 (byte가 작은범위에서 byte큰 범위로), 데이터 손실 위험있음
//
//	4/jvm(컴파일과 런타임)
//
//	컴파일: 자바코드를 컴퓨터가 이해할 수 있는 코드(바이너리코드)로 변환시키는 작업
//
//	런타임: 바이너리코드를 OS에서 실행시키는 행위(프로그램 실행)
//
//	5.연산자(연산자 우선순위와 산술연산자/ 대입연산자/ 비교연산자/논리연산자)

	// 산술연산자: +,-,*,/ 등등

	// 대입연산자 ; +,+=,-=,*= 등등 (우측 데이터를 좌측변수에 넣기(할당)

	// 비교연산자 :==, <, <= 등등 (좌측, 우측 데이터를 비교하여 "true/flase" 확인

	// 논리 연산자 : !,&& ,||등등 (논리적으로 구분

	// ! (반전, 거꾸로) , && _and_(좌측과 우측이 모두 참일 경우 참). ||_or_( 좌측과 우측 중에 하나만 참이여도
	// 참(true)

	public static void main(String[] args) {

		// int 4byte
		// double 8byte: int보다 더 많은 숫자를 표현 할 수 있음
		// int 타입의 숫자는 double 타입으로 바꿀 수 있음!

		// 변수의 선언부는 바꿀 수 없지만, (정적 타입선언)
		// 데이터는 이동이 가능하므로 형변환(casting)이 존재

		// 자동캐스팅x 강제캐스팅o double >>> int
		int intDataCasting = 1000;
		double doubleDataCasting = 990;
		// double 영역은 int영역보다 크므로,
		// int영역에서 double 데이터 영역을 포함하지 못하여 에러가 발생
		// 강제 캐스팅을 할 경우 캐스팅대상 타입(int)에서 벗어난 데이터일 경우
		// 손실 발생 위험 있음
		// (int) 문구 작성으로 double데이터를 int타입 변수에 강제적으로 할당

		// intDataCasting =doubleDataCasting;(너무 길어서 에러뜸) 밑에껄로 교체
		intDataCasting = (int) doubleDataCasting;

		// 자동캐스팅 int >> double
		int intData = 1000;
		double doubleData = 990;
		System.out.println(intData);
		System.out.println(doubleData);
		// intData 변수에 할당된 1000을 대입연산자(=)를 통해 doubleData변수에 저장(할당)
		doubleData = intData;
		System.out.println(doubleData);

		// for(int i =0; i<5; i++) {
		// System.out.println("hello world "+i+" 번째 입니다");
		// 1.for문이 0번째 실행되고 종료된다
		// 2.for문 안에 if문 넣고 break를 실행하면 for문 까지 종료된다!
		// > for문에 특정 값이 되면 강제적으로 for문 종료할 수 있다!
		// if(i==2) {
		// break;

		double sum = 1048;
		for (int i = 1; i < 30; i++) {
			System.out.println("현재 for문 실행 순서" + i + "번째");
			sum = sum / 2;
			// 1.for문이 0번째 실행되고 종료된다
			// 2.for문 안에 if문 넣고 break를 실행하면 for문 까지 종료된다!
			// > for문에 특정 값이 되면 강제적으로 for문 종료할 수 있다!
			if (sum < 2) {
				System.out.println(+i + "번쨰에서 종료합니다. 현재 sum은 " + sum + "입니다");
				break;
			}

		}

		// for문안에 for문이 있고,
		// 2번쨰 포문안에 if문 (break)가 있을 경우?
	}

}
