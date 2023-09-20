public class maasHesap {
    public static void main(String[] args) throws Exception {
        
        Employee e1 = new Employee("Amele", 2000, 45, 1985);
        Employee e2 = new Employee("Uğur", 18250, 45, 1997);
        Employee e3 = new Employee("Şükriye", 25000, 45, 2005);
        Employee e4 = new Employee("Hakan", 500, 30, 2017);
        e1.toString();
        System.out.println("-------------------------------------------------------");
        e2.toString();
        System.out.println("-------------------------------------------------------");
        e3.toString();
        System.out.println("-------------------------------------------------------");
        e4.toString();
    }
}