package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
class Book{
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String bookJson = null;
        Book book = new Book(
                "978-123456789B",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );
        bookJson = gson.toJson(book);
        System.out.println(bookJson);

        Map<String, String> map2 = gson.fromJson(bookJson,Map.class);
        System.out.println(map2);
    }
}
