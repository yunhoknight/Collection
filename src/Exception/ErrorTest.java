package Exception;

import java.io.BufferedReader;

public class ErrorTest {
    public static void main(String[] args) {
//        BufferedReader notExist = new BufferedReader(new FileReader("없는 파일"));
//        notExist.readLine();
//        notExist.close();
//        int[] array = {2, 4, 6};
//        System.out.println(array[3]);
        int i;

        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
