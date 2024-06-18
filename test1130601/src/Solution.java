import java.util.HashMap;

public class Solution {
    static HashMap<String,Integer> hm= new HashMap<String, Integer>();
    public static void main(String[] args) throws Exception {
 
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        String q = "MCMXCIV";
        int ans = romanToInt(q);
        System.out.println(ans);
    }
    //羅馬數字轉阿拉伯數字
    public static int romanToInt(String s) {
        int ans = 0;
        int last=0;
        //遍歷s
        for (char c : s.toCharArray()){
            //計算
            // String cc=String.valueOf(c);
            // System.out.println(cc);
            
            String cc= String.valueOf(c);
            ans = ans+ hm.get(cc);
            if(hm.get(cc)>last){
                ans = ans - 2*last;
            }
            last = hm.get(cc);
            //紀錄上一筆


            
        }
        //資料型態 char int float boolean String
        //容器:Array 排隊  {1,3,4,5}  {"SBAM","123","1bac"}
        //int[] iar = {1,2} ; String[] sar = {} ; char[] car ; float[] far ; 
        return ans;
    }
}
            // switch (c) {
            //     case 'I':
            //         ans=ans+1;
            //         break;
            //     case 'V':
            //         ans=ans+5;
            //         break;
            //     case 'X':
            //         ans=ans+10;
            //         break;
            //     case 'L':
            //         ans=ans+50;
            //         break;
            //     case 'C':
            //         ans=ans+100;
            //         break;
            //     case 'D':
            //         ans=ans+500;
            //         break;
            //     case 'M':
            //         ans=ans+1000;
            //         break;    
            // }