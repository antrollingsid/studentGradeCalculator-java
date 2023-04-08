
package StudentGradeCalculator;

/**
 * @author antrollingshon
 */
public class student {
 int std_no;
    String std_name;
    String std_surname;
    float mt_exam;
    float hw;
    float final_exam;
    String lgrade;
    
    
    public student(int std_no, String std_name, String std_surname, float mt_exam, float hw, float final_exam, String lgrade) {
        this.std_no = std_no;
        this.std_name = std_name;
        this.std_surname = std_surname;
        this.mt_exam = mt_exam;
        this.hw = hw;
        this.final_exam = final_exam;
        this.lgrade = lgrade;
    }
    
   
    public int getStd_no() {
        return std_no;
    }

    public void setStd_no(int std_no) {
        this.std_no = std_no;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_surname() {
        return std_surname;
    }

    public void setStd_surname(String std_surname) {
        this.std_surname = std_surname;
    }

    public float getMt_exam() {
        return mt_exam;
    }

    public void setMt_exam(float mt_exam) {
        this.mt_exam = mt_exam;
    }

    public float getHw() {
        return hw;
    }

    public void setHw(float hw) {
        this.hw = hw;
    }

    public float getFinal_exam() {
        return final_exam;
    }

    public void setFinal_exam(float final_exam) {
        this.final_exam = final_exam;
    }

    public String getLgrade() {
        return lgrade;
    }

    public void setLgrade(String lgrade) {
        this.lgrade = lgrade;
    }
}

