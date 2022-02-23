package src;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        JsonReader reader = new Gson().newJsonReader(new FileReader("src/nuevoArchivo.json"));
        Employee emp = new Gson().fromJson(reader, Employee.class);
        System.out.println(emp);
    }
}
