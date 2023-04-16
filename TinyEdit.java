import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Введите строки текста (не более 100 строк)");
        System.out.println("Для завершения программы, введите stop");
        for (int i=0; i<100; i++){
            str[i] = bufferedReader.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("\nВведенные строки: ");
        for (String s:str) {
            if (s==null) break;
            System.out.println(s);
        }
    }
}
/*
Введите строки текста (не более 100 строк)
Для завершения программы, введите stop
Это 1 строка
Это 2 строка
Это 3 строка
Это 4 строка
stop

Введенные строки:
Это 1 строка
Это 2 строка
Это 3 строка
Это 4 строка
stop
 */