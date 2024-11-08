import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class test {

    public static void main(String args[]) {

        int[] arr = {3,2,1,3};

        solution(arr);
    }


    public static int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer>[] arr = new ArrayList[2];

        for(int i= 0; i<nums.length; i++){
            if(arr[0]!=null){
                for(int j=0; j<arr[0].size(); j++){
                    if(nums[i]==arr[0].get(j)){
                        int temp = arr[0].get(j);
                        arr[1].set(j,temp++);
                        break;
                    }
                    arr[0].add(nums[i]);
                    arr[1].add(1);
                }
            }
            else{
                arr[0].add(nums[i]);
                arr[1].add(1);
            }

        }

        for(int i=0; i<arr[0].size(); i++ ){

            System.out.println(arr[0].get(i) + " " + arr[1].get(i));
        }




        return answer;
    }
}
