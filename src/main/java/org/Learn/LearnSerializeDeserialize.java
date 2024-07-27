package org.Learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.gson.Gson;

public class LearnSerializeDeserialize {
    public static void main(String[] args) {

        // Serialize==================================================
        Employee emp1 = new Employee();
        emp1.Name = "Aditya";
        emp1.Address = "Home";
        try {
            FileOutputStream fos = new FileOutputStream(
                    "D:\\Study\\Bhasha\\src\\main\\resources\\fileOutputStream.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(emp1);
            out.close();
            fos.close();
            Gson gson = new Gson();
            System.out.println("Serialized");
            System.out.println(gson.toJson(emp1));
            // =========================================================

            // Deserialize==============================================
            FileInputStream fis = new FileInputStream(
                    "D:\\Study\\Bhasha\\src\\main\\resources\\fileOutputStream.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp2 = (Employee) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Deserialized");
            System.err.println(gson.toJson(emp2));
            // ========================================================

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Employee implements Serializable {
    public String Name;
    public String Address;
}
