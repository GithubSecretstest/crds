import java.net.HttpURLConnection;
import java.net.URL;

public class BearerAuthenticationExample {
    public static void main(String[] args) {
        try {
            // URL to make the HTTP request
            URL url = new URL("http://example.com/api/resource");

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Set up Bearer Authentication
            String token = "78675899";
            // Set the Authorization header
            connection.setRequestProperty("Authorization", "Bearer " + token);

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
