package mybatis.study.Model;

import java.math.BigDecimal;

public class StudentLecture {


    private int id;
    private int studentId;
    private Lecture lecture;//学习的课程
    private BigDecimal grade;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "{id="+id+",lecture="+lecture+",studentId="+studentId+",grade="+grade+",note="+note+"}";
    }
}
