import java.util.Scanner;
 
public class C입력 {
    private int 년, 월, 일;
    private Scanner scan;
 
    public C입력(){
        scan = new Scanner(System.in);
    }
 
    public void 입력(){
        System.out.println("원하는 년을 입력 해 주세요.");
        년 = scan.nextInt();
 
        System.out.println("원하는 월을 입력 해 주세요.");
        월 = scan.nextInt();
 
        System.out.println("원하는 일을 입력 해 주세요.");
        일 = scan.nextInt();
    }
 
    public int get년() { return 년; }
    public int get월() { return 월; }
    public int get일() { return 일; }
}