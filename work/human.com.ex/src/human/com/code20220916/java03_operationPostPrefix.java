package human.com.code20220916;

public class java03_operationPostPrefix {

	 public static void main(String[] args) {
//	      20220916 history
//	      1. 단항연산자(피 연산자(변수)가 하나인 것) 
//	      / 삼항 연산자(?true:false)
//	      2. 전위연산자, 후위연산자
//	      3. 오버플로우
	      
	      int x = 10;
	      int y = 10;
	      //z변수는 선언만 함
	      int z;
	      
	      System.out.println("-----------------");
	      x++;
	      ++x;
	      System.out.println(x); //x = 12
	      
	      System.out.println("-----------------");
	      y--;
	      --y;
	      System.out.println(y); //y = 8
	      
	      System.out.println("-----------------");
	      
	      //후위연산자 : x의 기존값을 그대로 할당(대입)한 뒤에 연산
	      //1. z = x;
	      //2. x++; (x=x+1)
	      z = x++;
	      System.out.println("z = "+z); //z = 12
	      System.out.println("x = "+x); //x = 13
	      
	      System.out.println("-----------------");
	      
	      //전위연산자 : x값을 연산 후 z에 할당(대입)한다
	      //1. ++x; (x=x+1)
	      //2. z = x;
	      //대입연산자(=) 기준으로 우측 항이 실행되고, 
	      //우측 항의 좌측 부터 연산이 시작
	      z = ++x;
	      System.out.println("z = "+z); //z = 14
	      System.out.println("x = "+x); //x = 14
	      
//	      int i = 0;
//	      //후위연산자 (연산자(+)가 뒤에 있는 것을 말함)
//	      //전위연산자 (연산자(+)가 앞에 있는 것을 말함)
//	      i++;
//	      i = i+1;
//	      System.out.println(i);
	      
//	      int i = -100;
////	      int result = -1*(-100);
//	      //부호연산자는 변수 앞에 부호를 붙히는 것
//	      //부호를 붙힌다는 것은 부호1 곱셈과 같다 (ex) -1*변수명)
//	      int result = -1*i;
//	      System.out.println(result);
	      
	      System.out.println("-----------");
	      //z = 14
	      //x = 14
	      //y = 8
	      //++x = 14의 값을 1 증가 한 후 z에 값에 할당
	      //y++ = 8의 값을 z에 연산 후 y의 값 1증가
	      //y는 9가 되어서 출력
	      z = ++x + y++;
	      System.out.println("z = "+z); //z = 23
	      System.out.println("x = "+x); //x = 15
	      System.out.println("y = "+y); //y = 9
	   }
	   

	   public static void for2Break() {
	      // 2중for문과 break;
	      for (int i = 0; i < 10; i++) {
	         for (int j = 0; j < 10; j++) {
	            System.out.println("현재 i는 " + i + " , j는 " + j);
	            if (j >= 2) {
	               // 가장 가까운 반복문을 강제 종료
	               break;
	            }
	         }
	      }
	   }

	}