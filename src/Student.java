public class Student {

    String name;
    String studentNo;
    int clases;
    Course matematik;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


      Student(String name,String studentNo,int clases,Course matematik,Course fizik,Course kimya ){
          this.name=name;
          this.studentNo=studentNo;
          this.clases=clases;
          this.matematik=matematik;
          this.fizik=fizik;
          this.kimya=kimya;
          this.avarage=0.0;
          this.isPass=false;
          isCheckPass();
      }
      void addBulkExamNote(int matematik,int fizik,int kimya){
          if (matematik>=0&&matematik<=100){
              this.matematik.note=matematik;
          }
          if (fizik>=0&&fizik<=100){
              this.fizik.note=fizik;
          }
          if (kimya>=0&&kimya<=100){
              this.kimya.note=kimya;
          }

      }
      void isPass(){
          if (this.matematik.note==0||this.fizik.note==0||this.kimya.note==0){
              System.out.println("Hatali not girdiniz ");
          }else{
              this.isPass=this.isCheckPass();
              printNote();
              System.out.println("Ortalama: "+this.avarage);
          if (this.isPass){
              System.out.println("Sinifi gecti.");
          }else{
              System.out.println("Sinifta Kaldi");
          }
          }

      }

      void calcAvarage(){
          this.avarage=(this.matematik.note+this.fizik.note+this.kimya.note)/3.0;
      }

      boolean isCheckPass(){
          calcAvarage();
          return this.avarage>55;

      }
      void printNote(){
          System.out.println("-------------------------");
          System.out.println("Ogrenci: "+this.name);
          System.out.println("Matematik: "+this.matematik.note);
          System.out.println("Fizik: "+this.fizik.note);
          System.out.println("Kimya: "+this.kimya.note);
      }


}
