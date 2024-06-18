import java.io.IOException;
import java.net.InetAddress;
public class NetworkChecker {
    public static void main(String[] args) {
        String website = "www.google.com"; // 檢查連線的目標網站
        try {
            InetAddress address = InetAddress.getByName(website); // 建立InetAddress物件
            boolean reachable = address.isReachable(5000); // 檢查連線是否可達，5000毫秒超時
            if (reachable) {
                System.out.println("網路連線正常");
            } else {
                System.out.println("無法連線至 " + website);
            }
        } catch (IOException e) {
            System.out.println("檢查網路連線時發生錯誤: " + e.getMessage());
        }
    }
}
