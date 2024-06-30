
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader {

    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Usage: java FileDownloader <file URL> <download location>");
//            return;
//        }

        String fileUrl = "https://supabase.com/favicon/favicon-196x196.png";
        String downloadLocation = "C:\\Users\\benja\\OneDrive\\Escritorio\\PRUEBA_COPIAR_ARCHIVO\\logoBD.jpg";
//        String fileUrl = args[0];
//        String downloadLocation = args[1];

        try {
            downloadFile(fileUrl, downloadLocation);
            System.out.println("File downloaded successfully to " + downloadLocation);
        } catch (IOException e) {
            System.err.println("Failed to download file: " + e.getMessage());
        }
    }

    public static void downloadFile(String fileUrl, String downloadLocation) throws IOException {
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (InputStream in = new BufferedInputStream(connection.getInputStream()); FileOutputStream out = new FileOutputStream(downloadLocation)) {

            byte[] buffer = new byte[1024];
            int count;
            while ((count = in.read(buffer)) != -1) {
                out.write(buffer, 0, count);
            }
        } finally {
            connection.disconnect();
        }
    }
}
