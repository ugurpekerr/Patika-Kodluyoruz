public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary*0.03;
        }
        return 0;
    }
    
    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40)*30;
        }
        return 0;
    }

    double raiseSalary() {
        if ((this.hireYear-this.currentYear)*(-1) < 10){
            return this.salary*1.05 - this.salary;
        } else if ((this.hireYear-this.currentYear)*(-1) > 9 && (this.hireYear-this.currentYear)*(-1) < 20) {
            return this.salary*1.1 - this.salary;
        } else {
            return this.salary*1.15 - this.salary;
        }
    }

    double toplam() {
        double toplam = this.salary - tax() + bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte bu ayın maaşı : " + toplam);
        double toplamSon = this.salary + raiseSalary() - tax();
        System.out.println("Aylık toplam net maaş : " + toplamSon);
        return 0;
    }
    public String toString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        toplam();
        return "toplam";
    }
}