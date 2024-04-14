package CP_Practice.March_19;
import java.util.*;

public class TornLuckyTicket {
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        Collections.sort(arr, Comparator.comparingInt(String::length));


    }
}
