package src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test3 {
    
    public static void main(String[] args) throws FileNotFoundException {
        JsonReader reader = new Gson().newJsonReader(new FileReader("src/nuevoArchivo.json"));

        EmployeeStack emp = new Gson().fromJson(reader, EmployeeStack.class);

        ArrayList<Employee> emps = emp.getEmployeeList();

        System.out.println("Con arraylist");
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }

    }
}
