import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BasicAuthenticationExample {
    public static void main(String[] args) {
        try {
            // URL to make the HTTP request
            URL url = new URL("http://example.com/api/resource");

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Set up Basic Authentication
            String username = "jommy";
            String password = "luck";
            String authString = username + ":" + password;
            String encodedAuthString = Base64.getEncoder().encodeToString(authString.getBytes());
            // Set the Authorization header
            connection.setRequestProperty("Authorization", "Basic " + encodedAuthString);

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

