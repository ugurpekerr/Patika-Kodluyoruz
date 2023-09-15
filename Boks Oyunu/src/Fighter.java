public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    public boolean dodge() {
        double randomValue = Math.random()*100;
        return randomValue <= this.dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + "'a " + this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage <= 0) {
            System.out.println("Veeee... " + foe.name + " yerden kalkamadı. Hakem üçe kadar saydı ve karşılama bitti.");
            System.out.println("Karşılaşmanın galibi " + this.name + " galibiyetin sevincini yaşıyor.");
            return 0;
        }
        return foe.health - this.damage;
    }
}