import java.util.Scanner;
class Whrerlive{
    public static void main (String[]args) {
        System.out.println ( "어디에 사세요?");
        String Where = "";
        Scanner scanner = new Scanner(System.in);
        Where = scanner.next();
        System.out.println(String.format("저는 %s 에 살고 있습니다",Where));

    }
}