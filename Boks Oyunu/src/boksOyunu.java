public class boksOyunu {
    public static void main(String[] args) throws Exception {
        Fighter f1 = new Fighter("Cüneyt Arkın", 20, 100, 77, 75);
        Fighter f2 = new Fighter("Kemal Sunal", 15, 100, 70, 60);
        
        Match ring = new Match(f1, f2, 70, 90, 50);
        ring.run();
    }
}