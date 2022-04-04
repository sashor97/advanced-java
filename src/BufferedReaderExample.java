import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        File myFile=new File("./example.text");


        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(myFile))) {
            String line;
            bufferedReader.lines().forEach(System.out::println);
        }
        catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }

    }
    }






