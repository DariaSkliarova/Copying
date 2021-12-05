import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            new Main().exe();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void exe() throws IOException {

        try (DataInputStream stream = new DataInputStream(new FileInputStream("D:\\516 Felina.mkv"))){
            try (DataOutputStream stream1 = new DataOutputStream(new FileOutputStream("D:\\Ready\\Felina1.mkv"))){
                byte[] nums = stream.readAllBytes();
                 stream1.write(nums);
            }
        }

        DataInputStream input = new DataInputStream(new FileInputStream("D:\\516 Felina.mkv"));
        DataOutputStream output = new DataOutputStream(new FileOutputStream("D:\\Ready\\Felina2.mkv"));
        try {
            byte[] buf = new byte[4096];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }

        try (BufferedInputStream stream2 = new BufferedInputStream(new FileInputStream("D:\\516 Felina.mkv"))){
            try (BufferedOutputStream stream3 = new BufferedOutputStream(new FileOutputStream("D:\\Ready\\Felina3.mkv"))){
                byte[] buf = stream2.readAllBytes();
                stream3.write(buf);
            }
        }

        BufferedInputStream stream4 = new BufferedInputStream(new FileInputStream("D:\\516 Felina.mkv"));
        BufferedOutputStream stream5 = new BufferedOutputStream(new FileOutputStream("D:\\Ready\\Felina4.mkv"));
        try {
            byte[] buf = new byte[4096];
            int bytesRead;
            while ((bytesRead = stream4.read(buf)) > 0) {
                stream5.write(buf, 0, bytesRead);
            }
        } finally {
            stream4.close();
            stream5.close();
        }
    }
}
