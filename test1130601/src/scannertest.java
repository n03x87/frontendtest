import java.util.Scanner;
public class scannertest {
    public static void main(String[] args) {
    Scanner ss = new Scanner(System.in);
    String pw ="abc123";
    for(int i=0;i<10;i++){
        String userpw=ss.nextLine();
        if (userpw.equals(pw)){
            System.out.println("正確");
            break;
        }
        else
        {
            System.out.println("錯誤,"+(i+1)+"次");
        }
    }


    }

}