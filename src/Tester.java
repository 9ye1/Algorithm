public class Tester {
    public static void main(String args[]) {

        long beforeTime = System.currentTimeMillis();
        long bTnano = System.nanoTime();
        //


        int[] arr = new int[5];
        System.out.println(arr.length);
        String st = "fsdgfdg";
        System.out.println(st.length());



        //
        long afterTime = System.currentTimeMillis();
        long secDiffTime = afterTime - beforeTime;

        long fTnano = System.nanoTime();
        long eTnano = fTnano - bTnano;

        System.out.println("시간차이(s) : "+secDiffTime/1000+"."+secDiffTime%1000+"초");
        //System.out.println("시간차이(ms)"+secDiffTime+"ms");
        //System.out.println("시간차이(micros)"+eTnano/1000+"microsec");
        System.out.println("시간차이(nanos)"+eTnano+"nanosec");

    }
}
