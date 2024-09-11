package com.ashutosh;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    static OkHttpClient client = new OkHttpClient();
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p1 = Person.builder().name("Ram Kumar").age(19).build();
        Person p2 = Person.builder().name("Ram Kumar").age(19).build();
        //Due to @EqualsAndHashCode ,p1 and p2 will have the same hash if both have same age and name
        System.out.println(p1.toString()); //@Data doesn't produce the @EqualsAndHashCode effect
        System.out.println(p2.toString());

        System.out.println(p1.equals(p2)); //true because matches hash code
        System.out.println(p1==p2); //false because it compares memory locations

        try{
            System.out.println(getUrl("https://example.com/"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    static String getUrl(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}