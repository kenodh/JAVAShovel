package tk;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import tk.Js;

public class viruslib {
    Js my = new Js();
    public void copyfile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public void writetofile(String filename, String content) throws IOException
    {
        Path fileName = Path.of(filename);
        //String content  = "hello world !!";
        Files.writeString(fileName, content);

        String actual = Files.readString(fileName);
        System.out.println(actual);
    }

    public String readfromfile(String fileName) throws IOException
    {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
            sb.append(new String(buffer));
            buffer = new byte[10];
        }
        fis.close();

        String content = sb.toString();
        return content;
    }
}