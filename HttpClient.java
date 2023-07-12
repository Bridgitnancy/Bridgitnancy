import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiInterface {
    private static final String BASE_URL = "https://reqres.in/";

    private static final HttpClient httpClient = HttpClient.newBuilder().build();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static User getUserById(int id) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "api/users/" + id))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String responseBody = response.body();
            User user = objectMapper.readValue(responseBody, User.class);
            return user;
        } else {
            throw new Exception("Failed to get user by id: " + id);
        }
    }
}