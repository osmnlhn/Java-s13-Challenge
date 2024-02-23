package employeeApp;

public class Healthplan {

    private int id;
    private String name;
    private Plan plan;

    public enum Plan {
        BASIC("Basic", 10),
        STANDART("Standart", 20),
        PREMIUM("Premium", 30);

        private final String name;
        private final  Double price;

        Plan(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }

        public Healthplan(int id,String name,Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;

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

    public Plan getPlan(){
        return plan;
    }

    public void setPlan(Plan plan){
        this.plan=plan;
    }


}


