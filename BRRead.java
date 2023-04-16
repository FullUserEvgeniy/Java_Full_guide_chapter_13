import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Использование объекта BufferedReader для чтения символов с консоли
public class BRRead {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вводите символы; для выхода нажмите 'q' ");
        do {
            ch = (char) bufferedReader.read();
        }while (ch != 'q');
    }
}
/*
r
f
g
q

 */