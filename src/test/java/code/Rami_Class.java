package code;

import okhttp3.*;

import java.io.IOException;

public class Rami_Class {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,
                "{\r\n   " +
                "\"name\":\"Rami the QA Engineer\",\r\n   " +
                "\"isbn\":\"bxd\",\r\n   " +
                "\"aisle\":\"400\",\r\n   " +
                "\"author\":\"Rami\"" +
                "\r\n}");
        Request request = new Request.Builder()
                .url("https://rahulshettyacademy.com/Library/Addbook.php")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
