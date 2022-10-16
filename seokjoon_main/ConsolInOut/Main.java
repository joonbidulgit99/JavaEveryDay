import java.io.IOException;
import java.io.InputStream;




public class Main {
    public static void  main(String[] args) throws IOException {

       // InputStream in = System.in;

        InputStream in = new InputStream();

        int a;

        a = in.read();

        System.out.println(a);


    }
}
