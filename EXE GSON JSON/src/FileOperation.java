package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;

public class FileOperation {
    

    public static void main(String[] args) throws FileNotFoundException { //Para escribir
        Employee emp = new Employee(1,"Jorge", new Adress("Calle 10", "Yopal", 1111), new long[] {1,2,3,4} );
        Employee emp1 = new Employee(2,"Pepe", new Adress("Calle 11", "Tauramena", 2222), new long[] {1,2,3,4} );
        Employee emp2 = new Employee(3,"Hernando", new Adress("Calle 12", "Bogota", 3333), new long[] {1,2,3,4} );
        Employee emp3 = new Employee(4,"Carlos", new Adress("Calle 14", "Cali", 4444), new long[] {1,2,3,4} );

        String json = new Gson().toJson(emp);
        System.out.println(json);

        PrintWriter print = new PrintWriter("src/nuevoArchivo.json");

        print.write(json);
        print.close();
    }
    
    

}
