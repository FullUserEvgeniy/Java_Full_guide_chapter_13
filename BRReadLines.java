import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Введите строки текста и нажмите INTER");
        System.out.println("Для завершения программы, введите stop ");

        do {
            str = bufferedReader.readLine();
            System.out.println("Вы ввели: " + str);
        }while (!str.equals("stop"));
    }
}
/*
Введите строки текста и нажмите INTER
Для завершения программы, введите stop
это первая строка
Вы ввели: это первая строка
это вторая строка
Вы ввели: это вторая строка
это третья строка
Вы ввели: это третья строка
stop
Вы ввели: stop

 */