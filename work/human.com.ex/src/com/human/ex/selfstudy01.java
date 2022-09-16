package com.human.ex;

public class selfstudy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가로 32cm, 세로 27cm의 1cm단위의 눈금종이가 있다
				//1줄씩 확인하며(가로) 1cm 마다 움직이는 로봇이 있는데, 
				//(가로를 모두 확인하면 세로 한 줄 넘어가서 가로 다시 확인)
				//가로 세로 길이 cm합이 3의 배수 일 경우
				//"가로 ?cm 더하기 세로 ?cm는 3의 배수입니다" 구문을 출력하시오
				//for문 안에 for문을 사용하고 if을 통해 조건을 확인하시오
		
		//for(int b=1; b<=27; b++) {
		//	for(int a=1; a<=32; a++) {
		//		if((a+b)%3==0) {
			//		System.out.println("가로" +a+"cm 더하기"+" 세로"+b+"cm는 3의 배수입니다" );
		//		}
	//		}
	//	}
		
		
		//134페이지
		//for문을 이용하여 1부터 100까지 정수중에서 
		//3의배수의 총합을 구하는 코드를 작성해보시오
		int sum=0;
		for(int a=1; a<=100; a++) {
			if(a%3==0) {
				sum += a;
			}
		}
				System.out.println(sum);
			}
		
	

}
