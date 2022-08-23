public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;

    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println("Islem Basarili");

        }else{
            System.out.println(teacher.name+" Akademisyen bu dersi veremez");
        }
    }

    void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name+" dersinin akademisyeni "+courseTeacher.name);
        }else{
            System.out.println(this.name+" dersinin akademisyeni atanmamistir");
        }
    }
}
