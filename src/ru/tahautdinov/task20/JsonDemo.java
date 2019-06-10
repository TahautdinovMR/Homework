package ru.tahautdinov.task20;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.tahautdinov.task9.Dog;

import java.io.*;

import java.net.URL;

public class JsonDemo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://dog.ceo/api/breeds/list/all");
        InputStream is = url.openStream();
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();
        //System.out.println(line);

        ObjectMapper objectMapper = new ObjectMapper();
        Dogs dogs = objectMapper.readValue(line, Dogs.class);
        System.out.println(dogs);






    }
}
