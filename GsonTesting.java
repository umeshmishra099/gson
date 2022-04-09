package gson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GsonTesting {
    public static void main(String[] args) throws IOException {
        // the stream holding the file content
        InputStream inputStream = GsonTesting.class.getClassLoader().getResourceAsStream("data.json");

        String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        System.out.println(text);
        ObjectMapper mapper = new ObjectMapper();
        Data data = mapper.readValue(text, Data.class);
        System.out.println(data.getCurrency());
    }
}
