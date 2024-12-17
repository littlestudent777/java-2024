import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class JavaExecutor {

    public static void main(String[] args) {
        String javaCode = "public class HelloWorld { " +
                "public static void main(String[] args) { " +
                "System.out.println(\"Hello, World!\"); " +
                "} " +
                "}";

        String fileName = "HelloWorld.java";

        //Запись кода в файл
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(javaCode);
            System.out.println("Java файл создан: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }

        //Компиляция Java-кода
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilationResult = compiler.run(null, null, null, fileName);
        if (compilationResult != 0) {
            System.err.println("Ошибка компиляции с кодом: " + compilationResult);
            return;
        }
        else{
            System.out.println("Компиляция успешна.");
        }
        //Запуск скомпилированного класса
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", "HelloWorld");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            printProcessOutput(process);
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.err.println("Ошибка выполнения с кодом: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Ошибка при выполнении: " + e.getMessage());
        }
    }

    private static void printProcessOutput(Process process) throws IOException {
        try (InputStream inputStream = process.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
//javac JavaExecutor.java
//java JavaExecutor