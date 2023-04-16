import java.io.PrintWriter;
// Демонстрация применения PrintWriter
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("Текстовая строка");
        printWriter.println(-7);
        printWriter.println(7.9d);
    }
}
