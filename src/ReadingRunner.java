import java.io.*;
import java.util.Scanner;

public class ReadingRunner {
    public static void main(String[] args) throws IOException {
        Reading HadoopBook = new Reading();
        HadoopBook.setPage(12);
        HadoopBook.setPagesCount(24);
        System.out.println(HadoopBook);
        Reading AnotherBook = new Reading();
        AnotherBook.setPage(12);
        AnotherBook.setPagesCount(24);
//        if (HadoopBook.equals(AnotherBook)) System.out.println("You can compare objects by ==!");
//        else System.out.println("You compare the address not objects that way!");
//        Scanner scanner = new Scanner(System.in);
//        // int test = scanner.nextInt();
//        String test = scanner.next();
//        if ("cocoa".equals(test)) System.out.println("Everyone loves cocoa!");
//        else System.out.println("What are you saying?");
//        for(String s: args){
//            System.out.println(s);
//        }
        BufferedReader test = new BufferedReader(new FileReader("D:\\sms-call-internet-mi-2013-12-01.txt"));
        for(int i = 0;i<20; i++){
            System.out.println(test.readLine());
        }

    }
}
