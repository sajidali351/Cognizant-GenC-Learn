import java.io.*;

@SuppressWarnings("unchecked")
public class FileManager {
    public static File createFile() {
        File file = new File("visitors.txt");
        try {
            boolean isFileCreate = file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void writeFile(File file, String record) {
        try {

            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true));
            printWriter.write(record);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFile(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String records = bufferedReader.readLine();
            return records.split(";");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}