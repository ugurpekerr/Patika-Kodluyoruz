public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double firstHit;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight, double firstHit){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstHit = firstHit;
    }
    
    public double firstHit() {
        double randomValue = Math.random()*100;
        System.out.println(randomValue);
        return this.firstHit = randomValue;  
    }

    void run() {
        if (isCheck()) {
            System.out.println(this.f1.name + " ve " + this.f2.name + " arasındaki mücadele başlıyor.\n");
            int say = 1;
            if (firstHit() > 50) {
                System.out.println("----Round 1-----");
                this.f2.health = this.f1.hit(f2);
                System.out.println("İlk deneme " + this.f1.name + "dan gelmiş oldu.");
                System.out.println(this.f2.name + "'ın kalan canı " + this.f2.health + ".");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + "'ın kalan canı " + this.f1.health + ".");
            } else {
                System.out.println("----Round 1-----");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println("İlk deneme " + this.f2.name + "dan gelmiş oldu.");
                System.out.println(this.f1.name + "'ın kalan canı " + this.f1.health + ".");
                this.f2.health = this.f1.hit(f2);
                System.out.println(this.f2.name + "'ın kalan canı " + this.f2.health + ".");
            } 
            
            while (this.f1.health > 0 && this.f2.health > 0) {
                say++;
                System.out.println("----Round " + say + "-----");
                this.f2.health = this.f1.hit(f2);
                if (this.f2.health <= 0) {
                    break;
                }
                System.out.println(this.f2.name + "'ın kalan canı " + this.f2.health + ".");
                this.f1.health = this.f2.hit(this.f1);
                if (this.f1.health <= 0) {
                    break;
                }
                System.out.println(this.f1.name + "'ın kalan canı " + this.f1.health + ".");
            }
        } else {
            System.out.println("Sporcular dövüşmeye uygun değil.");
        }
    }
    
    boolean isCheck (){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
}