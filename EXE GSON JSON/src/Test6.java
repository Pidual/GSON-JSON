package src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test6 {
    
    public static void main(String[] args) throws FileNotFoundException {
        JsonReader reader = new Gson().newJsonReader(new FileReader("src/nuevoArchivo.json"));
        Employee[] emp = new Gson().fromJson(reader, Employee[].class);

        System.out.println("Con arreglo");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }

    }
}
