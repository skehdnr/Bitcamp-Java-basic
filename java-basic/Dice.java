import java.util.Scanner;
import java.util.Random;
class Dice{
    /**주사위를 던져 홀수인지 짝수인지 맞추는 게임입니다
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수 일거 같으면 '홀'을 선택, 나머지는 '짝' 선택 한다고 할때
     *결과를 출력 하세요
     */
    public static void main(String[] args) {
        System.out.println("홀짝 게임 입니다! ");
        Scanner scanner = new Scanner (System.in);
        Random ran= new Random();
        int Dice = 0;
        Dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", Dice));
        String a="";
        System.out.println("주사위 값을 예측한 홀,짝 입력[ ]");
        a = scanner.next();
        if (Dice == 1 || Dice == 3 || Dice == 5){
            System.out.println("홀수 입니다");
        }else if(Dice == 2 || Dice == 4 || Dice == 6){
            System.out.println("짝수 입니다");
        }else {
            System.out.println("잘못 입력 했습니다");
        }
    }     
}