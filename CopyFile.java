import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        if (args.length!=2){
            System.out.println("Использование: CopyFile");
        }
        try {
            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);
            do {
                i = fileInputStream.read();
                if (i != -1) fileOutputStream.write(i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        }finally {
            try {
                if (fileInputStream!=null) fileInputStream.close();
            }catch (IOException e2){
                System.out.println("Ошибка при закрытии исходного файла");
            }
            try {
                if (fileOutputStream!=null) fileOutputStream.close();
            }catch (IOException e2){
                System.out.println("Ошибка при закрытии целевого файла");
            }
        }
    }
}
// 388