public class Main {

    public static void main(String[] args) {
        Course matematik=new Course("Matematik","101","MAT");
        Course fizik=new Course("Fizik","102","FZK");
        Course kimya=new Course("Kimya","103","KMY");

        Teacher t1=new Teacher("Mahmut","648756256","MAT");
        Teacher t2=new Teacher("Adnan","568945624","FZK");
        Teacher t3=new Teacher("Emre","846524895","KMY");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("Hamza","546",4,matematik,fizik,kimya);
        s1.addBulkExamNote(50,80,70);
        s1.isPass();

        Student s2=new Student("Davut","387",4,matematik,fizik,kimya);
        s2.addBulkExamNote(20,60,70);
        s2.isPass();


        Student s3=new Student("Suleyman","785",4,matematik,fizik,kimya);
        s2.addBulkExamNote(90,80,100);
        s2.isPass();




    }
}
