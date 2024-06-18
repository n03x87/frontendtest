import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int total = 0;
        for( int i=1   ;   i<101  ;  i++ )
        {
            total = total + i ;
        }
        System.out.println("Hi! "+total);

         int count=0;
        while (total<100) {
            count++;
            total =total+count;
            System.out.println("ok~~"+total);
        }

        
    //     System.out.println("Hello, World!");
    //     test();
    // }
    // public static void test(){
    //        System.out.println("Hello,Kitty!");
    // }

    // String pw= new String();
    // pw="abc123";
    // Scanner myObj = new Scanner(System.in);
    // String userPW;
    
    // System.out.println("請輸入密碼"); 
    // userPW=myObj.nexLine();
    // if (userpPW.equals(pw)){
		// System.out.println("正確");
    // }else{
		// System.out.println("錯誤");
    // }

}
}
