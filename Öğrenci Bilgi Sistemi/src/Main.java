public class Main {
    public static void main(String[] args) throws Exception {

        Teacher t1 = new Teacher("Polat Alemdar", "0 544 444 44 44", "TARIH");
        Teacher t2 = new Teacher("Kuzey Tekinoðlu", "0 533 333 33 33", "SPOR");
        Teacher t3 = new Teacher("Poyraz Karayel", "0 522 222 22 22", "EDEBIYAT");

        Course tarih = new Course("Tarih", "TRH101", "TARIH");
        Course spor = new Course("Spor", "SPR101", "SPOR");
        Course edebiyat = new Course("Edebiyat", "EDB101", "EDEBIYAT");

        tarih.addTeacher(t1);
        spor.addTeacher(t2);
        edebiyat.addTeacher(t3);

        Student s1 = new Student("Ali", 4, "140144015", tarih, spor, edebiyat);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNote(70, 60, 40);
        s1.isPass();

        Student s2 = new Student("Veli", 4, "2211133", tarih, spor, edebiyat);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozluNote(80, 60, 90);
        s2.isPass();

        Student s3 = new Student("Deli", 4, "221121312", tarih, spor, edebiyat);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkSozluNote(50, 60, 40);
        s3.isPass();
    }
}