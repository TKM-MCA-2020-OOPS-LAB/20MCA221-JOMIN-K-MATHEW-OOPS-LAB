import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class evenodd {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("D:\\MCA\\Sem 2\\oops lab\\Course Outcomes\\CO6\\prgrm4\\Numbers.txt");
        FileOutputStream fw1 = new FileOutputStream("D:\\MCA\\Sem 2\\oops lab\\Course Outcomes\\CO6\\prgrm4\\Even Numbers.txt");
        FileOutputStream fw2 = new FileOutputStream("D:\\MCA\\Sem 2\\oops lab\\Course Outcomes\\CO6\\prgrm4\\Odd Numbers.txt");
        System.out.println("Even & Odd numbers copied to seperate files");
        int i;
        while((i=fr.read()) != -1)
        {
            if(i%2==00)
                fw1.write(i);
            else
                fw2.write(i);
        }
        fr.close();
        fw1.close();
        fw2.close();

    }
}