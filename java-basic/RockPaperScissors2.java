/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Scanner;
import java.util.Random;
class RockPaperScissors2{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    int a = 0;
    int b = 0;
    a = ran.nextInt(3)+1;
    System.out.println("가위바위보 게임입니다");
    System.out.println("3가지 중에 하나를 선택하세요. 1. 가위 , 2.바위 , 3.보");
    b = sc.nextInt();
    if(b==1){
        if(a==1){
        System.out.println("비겼습니다");
        }else if(a==2){
        System.out.println("졌습니다");
        }else{
        System.out.println("이겼습니다");
        }
      }else if(b==2){
        if(a==1){
            System.out.println("이겼습니다");
        }else if(a==2){
            System.out.println("비겼습니다");
        }else{
            System.out.println("졌습니다");
        }
     }else if(b==3){
        System.out.println("비겼습니다");
        if(a==1){
            System.out.println("졌습니다");
        }else if(a==2){
        System.out.println("이겼습니다");
        }else if(a==3){
            System.out.println("비겼습니다");
        }
        }
    }
    }


