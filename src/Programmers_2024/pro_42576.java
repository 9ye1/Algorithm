package Programmers_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class pro_42576 {

    public static void main(String args[]) throws IOException {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int count = 0;

        for(int i=0; i<participant.length; i++){
            if(map.containsKey(participant[i])){
                count = map.get(participant[i]);
                map.put(participant[i],++count);
            }else{
                map.put(participant[i],1);
            }


        }

        for(int i=0; i<completion.length; i++){

            if(map.containsKey(completion[i])){
                count = map.get(completion[i]);
                if(count==1) map.remove(completion[i]);
                else map.put(completion[i],--count);
            }
        }

        map.forEach((key, value) -> {
            System.out.println(key+","+value);
        });

    }


}
