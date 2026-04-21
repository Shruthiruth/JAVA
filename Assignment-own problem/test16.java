// # nums = [1, 2, 2, 3, 3, 3, 4]
// # Question: Count Frequency of Elements
// # 👉 Output should be:
// #
// # {1:1, 2:2, 3:3, 4:1}



import java.util.HashMap;

class test16{

    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        System.out.println(map);

    }
}



// for (int i = 0; i < nums.length; i++) {
//     int count = 0;
//     for (int j = 0; j < nums.length; j++) {
//         if (nums[i] == nums[j]) {
//             count++;
//         }
//     }
//     System.out.println(nums[i] + " -> " + count);
// }