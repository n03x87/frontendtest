import java.time.LocalTime;

public class TimeChecker {
    public static void main(String[] args) {
        // 取得當前時間
        LocalTime now = LocalTime.now();
        
        // 取得小時和分鐘
        // int hour = now.getHour();
        int minute = now.getMinute();
        
        // 列印當前時間
        System.out.println("Current time: " + now);
        
        // 檢查是否為整點或半小時
        if (minute == 0 || minute == 30) {
            System.out.println("*");
        }
    }
}