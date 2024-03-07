package DataStructure;

import java.util.Scanner;

public class SequenceSearch {

    public int[] arr = {19,3,-5,27,80,1,38,93,82,9,408};

    static public int find(int[] arr,int key) {
        for (int i =0; i < arr.length; i++){
            if(arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {19,3,-5,27,80,1,38,93,82,9,408};
        Scanner scan = new Scanner(System.in);

        int key =0;

        while(true){
            System.out.println("검색할 정수를 입력하세요 : ");
            key = scan.nextInt();
            if(find(arr,key)==-1){
                System.out.println(key + "는 배열에 존재하지 않습니다.");
            }else{
                System.out.println(key + "는 "+(find(arr,key)+1)+"째에 존재합니다.");
                break;
            }
        }

        scan.close();

    }

}
