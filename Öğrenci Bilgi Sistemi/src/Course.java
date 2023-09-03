public class Course {
    Teacher courseTeacher;
    String name, code, prefix;
    int note = 0;
    int sozNote = 0;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozNote = 0;
    }

    public Course(int sozNote) {
        this.sozNote = sozNote;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Akademisyen eşleşmesi başarılı.");
        } else {
            System.out.println(t.name + " akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }
}