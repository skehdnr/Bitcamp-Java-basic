import java.util.Scanner;
class Sum{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        String op ="";
        System.out.println("첫번째 숫자를 입력해 주세요");
        a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요");
        b = scanner.nextInt();
       System.out.println("연산종류를 선택하세요 + ,- ,* ,/ ");
        op = scanner.next();
        if(op.equals("+")){
            c = a+b;
            System.out.println(String.format("두수의 합은 %d + %d = %d ", a,b,c));
        } else if(op.equals("-")){
            c = a-b;
            System.out.println(String.format("두수의 뺄셈은 %d - %d = %d", a,b,c));
        } else if(op.equals("*")){
            c = a*b;
            System.out.println(String.format("두수의 곱은 %d * %d = %d", a,b,c));
        } else if(op.equals("/")){
            c = a/b;
            System.out.println(String.format("두수의 나눗셈은 %d / %d = %d", a,b,c));
        } else {
            System.out.println("잘못 입력 했습니다");
        }
    }
}