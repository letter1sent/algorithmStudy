package baekjoon.level_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step05_1008 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        /*
        int a = Integer.parseInt(st.nextToken());
        
        Float a = Float.parseFloat(st.nextToken());
        */
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        System.out.println(a/b);
    }

}
