package baekjoon.level_01;

import java.util.Scanner;

public class Step02_1000 {  // 입력받기 https://st-lab.tistory.com/12
    public static void main(String[] args) throws Exception {
        /* Scanner
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        sc.close();

         */
        
        /* BufferedReadr / split
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        System.out.println(a+b);
        */
        
        /*  BufferedReader / StringTokenizer
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a+b);
        */
    }
}
