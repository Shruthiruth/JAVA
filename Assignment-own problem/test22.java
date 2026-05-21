// expand encoded text
import java.util.*;


class test23{
    public static void main(String[] args)
    {
        String[] arr={"C2","D4"};
        char ch;
        int num;
        ArrayList<String> result=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            ch=arr[i].charAt(0);
            num =Character.getNumericValue(arr[i].charAt(1));
            String repeat="";
            
            for(int j=0;j<num;j++)
            {
                repeat+=ch;
            }
            
            result.add(repeat);
            
        }
        
        System.out.println(result);
        
    }
}