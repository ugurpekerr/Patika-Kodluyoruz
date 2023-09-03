public class Student {
    String name, stuNo;
    Course tarih, spor, edebiyat;
    int whichClass;
    double avarage;
    boolean isPass;

    Student(String name, int whichClass, String stuNo, Course tarih, Course spor, Course edebiyat) {
        this.name = name;
        this.stuNo = stuNo;
        this.tarih = tarih;
        this.spor = spor;
        this.edebiyat = edebiyat;
        this.whichClass = whichClass;
        calcAvarage();
    }

    public void addBulkExamNote(int tarih, int spor, int edebiyat) {
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;
        }
        if (spor >= 0 && spor <= 100) {
            this.spor.note = spor;
        }
        if (edebiyat >= 0 && edebiyat <= 100) {
            this.edebiyat.note = edebiyat;
        }
    }

    public void addBulkSozluNote(int sozTarih, int sozSpor, int sozEdebiyat) {
        if (sozTarih >= 0 && sozTarih <= 100) {
            this.tarih.sozNote = sozTarih;
        }
        if (sozSpor >= 0 && sozSpor <= 100) {
            this.spor.sozNote = sozSpor;
        }
        if (sozEdebiyat >= 0 && sozEdebiyat <= 100) {
            this.edebiyat.sozNote = sozEdebiyat;
        }
    }

    public void calcAvarage() {
        this.avarage = (this.tarih.note*0.8 + this.tarih.sozNote*0.2 + this.spor.note*0.8 + this.spor.sozNote*0.2 + this.edebiyat.note*0.8 + this.edebiyat.sozNote*0.2)/3;
    }

    public void isPass() {
        if (this.tarih.note == 0 || this.spor.note == 0 || this.edebiyat.note == 0 || this.tarih.sozNote == 0 || this.spor.sozNote == 0 || this.edebiyat.sozNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş. ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama    \t\t: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti. ");
            } else {
                System.out.println("Sınıfta kaldı. ");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Sınav Notu \t: " + this.tarih.note);
        System.out.println("Tarih Sözlü Notu \t: " + this.tarih.sozNote);
        System.out.println("Spor Sınav Notu \t: " + this.spor.note);
        System.out.println("Spor Sözlü Notu \t: " + this.spor.sozNote);
        System.out.println("Edebiyat Sınav Notu \t: " + this.edebiyat.note);
        System.out.println("Edebiyat Sözlü Notu \t: " + this.edebiyat.sozNote);
    }
}