import java.util.Scanner;
class Multi{
    public static void main ( String[]args){
        System.out.println("첫번쨰 숫자를 입력해 주세요");
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요");
        int b = 0;
        b = scanner.nextInt();
        System.out.println("두수의 곱은 "+ (a*b)+ "입니다");
    }
}