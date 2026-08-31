package Exception_handling;
//throws key word specifically

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) throws IOException {
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i= Integer.parseInt(br.readLine());
    }
}
