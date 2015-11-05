
public class C제어 {
    C입력 입력;
    C출력 출력;

    public C제어(){
    	입력 = new C입력();
    	출력 = new C출력();
    }
 
    public void 제어(){
    	int 년, 월, 일;
 
    	입력.입력();
    	년 = 입력.get년();
    	월 = 입력.get월();
    	일 = 입력.get일();
 
    	출력.setValue(년, 월, 일);
    	출력.출력();
    }
 
    public static void main(String[] args) {
    	C제어 날짜출력 = new C제어();
    	날짜출력.제어();
   } 
}
