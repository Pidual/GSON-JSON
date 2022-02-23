
package src;

import java.util.Arrays;

public class Employee{

    private int id;
    private String name;
    private Adress adress;
    private long[] phoneNumbers;

    public Employee(){

    }

    public Employee(int id, String name, Adress adress, long[] phoneNumbers) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public long[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(long[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "\nEmployee: [adress=" + adress + ", id=" + id + ", name=" + name + ", phoneNumbers="
                + Arrays.toString(phoneNumbers) + "]";
    }
    


}