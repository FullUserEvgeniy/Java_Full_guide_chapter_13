import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Отображение содержимого текстового файла.
Для использования программы укажите имя файла, который хотите просмотреть.
Например, чтобы увидеть содержимое файла по имени TEST.TXT ,
введите следующую командную строку :
java ShowFile TEST.ТХТ
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;

        if (args.length!=0){
            System.out.println("Использование: ShowFile");
        }
        try {
            fileInputStream = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("Не удалось открыть файл");
        }
        try {
            do {
                i = fileInputStream.read();
                System.out.println((char) i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Ошибка при чтении файла");
        }
        try {
            fileInputStream.close();
        }catch (IOException e){
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
