package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee (int id,String fullname,String email,String password , String[] healthplans){
        this.id=id;
        this.fullname=fullname;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFullname(){
        return  fullname;
    }

    public void setFullname(){
        this.fullname=fullname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(){
        this.password=password;
    }

    public String[] getHealthplans(){
        return healthplans;
    }

    public void setHealthplans(String[] healthplans){
        this.healthplans=healthplans;
    }


    public void addHealthplan (int index, String name) {
       if (index < 0 || index > healthplans.length){
           System.out.println(" Invalid index for adding a health plan.");
       }
       if(healthplans[index]==null){
           healthplans[index]=name;
       }
       else {System.out.println("Index is already occupied. Cannot add health plan.");}

    }
    public String toString() {
        return "Employee [id: " + id + ", fullname: " + fullname + ", email: " + email + ", healthplans: " + Arrays.toString(healthplans) + "]";
    }


}
