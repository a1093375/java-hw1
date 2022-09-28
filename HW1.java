import java.util.TreeSet;
import java.text.ParseException;
import java.util.Arrays;
import java.util.*;

public class HW1 {

    public static void main(String[] args) throws Exception {
        int[] num = new int[100];
        
        for(int i = 0; i<num.length;i++){
            num[i]=i+1;
        }
        Arrays.sort(num);
        String[] a=Arrays.toString(num).split("[\\[\\]]")[1].split(", "); 
        System.out.println(Arrays.toString(a));  

        System.out.print("不重複10個亂數\n");

        String[] Array;
    
        Array = getRandom(a);
    
        for(int i = 0; i < 10; i++){            
            System.out.printf("第" );
            System.out.print(i+1);
            System.out.printf("個號碼:" );
            System.out.println(Array[i]);
        }

        TreeSet<String> r1 = new TreeSet<>();
        for(String t:Array){
            r1.add(t);
        }
        System.out.printf("物件元素的內容：");
        System.out.println(r1);

        int[] w1 = new int[29];
        
        for(int i = 0; i<w1.length;i++){
            w1[i]=i+1;
        }
        Arrays.sort(w1);
        String[] b=Arrays.toString(w1).split("[\\[\\]]")[1].split(", "); 
        

        TreeSet<String> r2 = new TreeSet<>();
        
        for(int i=0;i<29;i++){
                
            r2.add(b[i]);
        }
        

        TreeSet<String> intersection1 = new TreeSet<>();

        intersection1.addAll(r1);

        intersection1.retainAll(r2);

        // Print the intersection

        System.out.println("Intersection1: " + intersection1);


    

        int[] w2 = new int[100];
        int j=0;
        for(int i = 101; i>71;i--){
            w2[j]=i-1;
            j++;
        }
        Arrays.sort(w2);
        String[] c=Arrays.toString(w2).split("[\\[\\]]")[1].split(", "); 
        

        TreeSet<String> q2 = new TreeSet<>();
        
        for(int i=0;i<100;i++){
                
            q2.add(c[i]);
        }
        

        TreeSet<String> intersection2 = new TreeSet<>();

        intersection2.addAll(r1);

        intersection2.retainAll(q2);

        // Print the intersection

        System.out.println("Intersection2: " + intersection2);
        
        

        

    }
    public static String[] getRandom(String[] num)
    {
        String[] arr = new String[10];
        int n;
        for(int i = 0; i< arr.length; i++)
        {
            n = (int)(Math.random()*(100-i));
            arr[i] = num[n];
            for(int j = n; j<num.length - 1; j++)
            {
                num[j] = num[j+1];
            }
        }
        return arr;
    }
    
    

}

 

