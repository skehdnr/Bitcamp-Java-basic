import java.util.Scanner;
class RockPaperScissors{
    public static void main(String[]args) {
        Scanner scanner = new Scanner ( System.in);
        int op = 0;
        System.out.println("가위바위보 게임");
        System.out.println("1.가위 2.바위 3.보");
        op = scanner.nextInt();
        if(op==1){
            System.out.println("당신이 이겼습니다");
        }else if(op==2){
            System.out.println("당신이 졌습니다");
        } else if (op==3){
            System.out.println("당신이 비겼습니다");
        } else{
            System.out.println("잘못 입력 했습니다");
        }
    }
}