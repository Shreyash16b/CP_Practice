package CP_Practice.Day_08;
import java.util.*;

public class LongestKSequence {
    public int longestkSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int i =0, j = 0;
        int max = Integer.MIN_VALUE;
        
        while(j < s.length())
        {
            if(map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j), map.get(s.charAt(j))+1);
            }
            else{
                map.put(s.charAt(j), 1);
            }
            
            if(map.size() < k)
            {
                j++;
            }
            else if(map.size() == k)
            {
                max = Math.max(max, j-i+1);
                j++;
            }
            else if(map.size() > k)
            {
                while(map.size() > k)
                {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0)
                    {
                        map.remove(s.charAt(i));
                       
                    }
                     i++;
                }
                j++;
            }
        }
        return max < 0? -1:max;
    }
}

