
package StudentGradeCalculator;
import java.util.Scanner;

/**
 * @author antrollingsid
 */
public class StudentGradeCalculator {

    public static student readStudent(){
        student st;
        
        try (Scanner scr = new Scanner(System.in)) {
            int std_no;
            String std_name, std_surname, lgrade;
            float mt_exam,hw,final_exam;
            
            System.out.println("input studen number");
            std_no = scr.nextInt();
            
            System.out.println("enter student name");
            std_name = scr.next();
            
            System.out.println("enter student surname");
            std_surname = scr.next();
            
            System.out.println("enter midterm result");
            mt_exam = scr.nextFloat();
            
            System.out.println("enter hw result");
            hw = scr.nextFloat();
            
            System.out.println("enter final exam result");
            final_exam = scr.nextFloat();
            
            lgrade = "NG";
            
            st = new student(std_no, std_name, std_surname, mt_exam, hw, final_exam,lgrade);
        }
        return st;
    }
    
    public void updateStudent(int sno,String sname,String ssname,float mt_e,float hw_e,float final_e,student st) {
        st.setFinal_exam(final_e);
        st.setHw(hw_e);
        st.setMt_exam(mt_e);
        st.setStd_name(ssname);
        st.setStd_no(sno);
        st.setStd_surname(ssname);
    }
    
    public static void calculateLetterGrade(student st){
        
        float finalGrade = st.getFinal_exam();
        float hw = st.getHw();
        
        float totalScore = (finalGrade * 0.3f) + (hw * 0.3f) + (finalGrade * 0.4f);
        
         if (totalScore >= 90){
             st.setLgrade("A");
         }
         else if (totalScore<90 && totalScore>=85){
             st.setLgrade("B");
         }
         else if (totalScore<85 && totalScore>=80){
             st.setLgrade("B-");
         }
         else if (totalScore<80 && totalScore>=75){
             st.setLgrade("C");
         }
         else if (totalScore<75 && totalScore>=70){
             st.setLgrade("C-");
         }
         else if (totalScore<70 && totalScore>=65){
             st.setLgrade("D");
         }
         else if (totalScore<65 && totalScore>=60){
             st.setLgrade("D-");
         }
         else if (totalScore<55){
             st.setLgrade("F");
         }
         
    }
    
    public static void displayStudent(student st) {
        System.out.println("Studen No");
        System.out.println(st.getStd_no());
        
        System.out.println("Studen name");
        System.out.println(st.getStd_name());
        
        System.out.println("Studen surname");
        System.out.println(st.getStd_surname());
        
        System.out.println("mid");
        System.out.println(st.getMt_exam());
        
        System.out.println("hw");
        System.out.println(st.getHw());
        
        System.out.println("final");
        System.out.println(st.getFinal_exam());
        
        System.out.println("letter grade");
        System.out.println(st.getLgrade());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student st = readStudent();
        calculateLetterGrade(st);
        displayStudent(st);
        
    }
    
}
