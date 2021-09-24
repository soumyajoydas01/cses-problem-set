import java.util.*;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(repetitions(str));
    }

    static long repetitions(String str)
    {
        int n = str.length();
        long count = 0;
        long cur_count = 1;
 
        for (int i = 0; i < n; i++)
        {
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;
 
            else
            {
                if (cur_count > count)
                {
                    count = cur_count;
                    
                }
                cur_count = 1;
            }
        }
        return count;
    }
}