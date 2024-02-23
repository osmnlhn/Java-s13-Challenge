package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan.Plan basicPlan = Healthplan.Plan.BASIC;
        Healthplan.Plan standartPlan = Healthplan.Plan.STANDART;
        Healthplan.Plan premiumPlan = Healthplan.Plan.PREMIUM;

        String[] healthplans = {basicPlan.getName()};
        String[] healthplans1 = {standartPlan.getName()};
        String[] healthplans2 = {premiumPlan.getName()};

        Employee emp = new Employee(1, "John Doe", "john@example.com", "12340", healthplans);
        Employee emp1 = new Employee(2,"Oguzhan", "ogzhancolak@gmail.com", "12314", healthplans1);
        Employee emp2 = new Employee(3,"Dogancan", "dogancan@gmail.com", "1234", healthplans2);




        System.out.println("Healthplan: " + basicPlan + " " + standartPlan + " " + premiumPlan);
        System.out.println("Employee: " + emp + "\n" + emp1 + "\n" + emp2);

    }

    /** ;
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
