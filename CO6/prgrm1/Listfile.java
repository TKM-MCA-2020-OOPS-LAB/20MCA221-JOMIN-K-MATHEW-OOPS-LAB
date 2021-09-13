package packoops;
import java.io.File;
class Listfile {
   public static void main(String[] args) {
File file = new File("C:\\Users\\jomin\\Desktop");
 String[] fileList = file.list();
  for(String str: fileList) {
  System.out.println(str);
}
}
}