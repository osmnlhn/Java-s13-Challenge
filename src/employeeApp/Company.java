package employeeApp;

public class Company {

    private int id;
    private String name;

    private int giro;
    private String[] developerNames;

    public Company(int id,String name,int giro,String[] developerNames){
        this.id=id;
        this.name=name;
        this.giro=Math.max(0,giro);
        this.developerNames=developerNames;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getGiro(){
        return giro;
    }

    public void setGiro(int giro){
        this.giro=giro;
    }

    public String[] getDeveloperNames(){
        return  developerNames;
    }

    public void setDeveloperNames(String[] developerNames){
        this.developerNames=developerNames;
    }

    public void addEmployee(int index,String name){
        if(index>=0 && index<=developerNames.length){
            if (developerNames[index] == null){
                developerNames[index]=name;
                System.out.println("Index is already occupied. Cannot add health plan.");
            }else {System.out.println("Not valid index");}
        }
    }

}
