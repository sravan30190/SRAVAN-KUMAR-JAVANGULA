import java.io.*;
import java.util.*;
class P217
 {
    public static void main(String[] args) {
        int num = 1234, reversed = 0;
        while(num != 0)
 {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}