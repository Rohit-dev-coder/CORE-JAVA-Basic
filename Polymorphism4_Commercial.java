
package basicjavaprogrames;

class Commercial
{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void calculateBill(int unites)
    {
        System.out.println("Customer : "+ getName());
        System.out.println("Bill amount = "+unites*5.00);
    }
}

class Domestic extends Commercial
{
    void calculateBill(int unites)
    {
        System.out.println("Customer : "+ getName());
        System.out.println("Bill amount = "+unites*2.50);
    }
}
public class Polymorphism4_Commercial {
    public static void main(String[] args) {
        Commercial c = new Commercial();
        c.setName("Rajat");
        c.calculateBill(1000);
        Domestic d = new Domestic();
        d.setName("Viyaj");
        d.calculateBill(1000);
    }
}
