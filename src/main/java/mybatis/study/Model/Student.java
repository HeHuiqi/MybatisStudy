package mybatis.study.Model;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private int sex;
    private StudentSelfCard studentSelfCard;//学生证
    private List<StudentLecture> studentLectureList;//学生学习的课程

    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentSelfCard getStudentSelfCard() {
        return studentSelfCard;
    }

    public void setStudentSelfCard(StudentSelfCard studentSelfCard) {
        this.studentSelfCard = studentSelfCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<StudentLecture> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLecture> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {

        System.out.println();
        System.out.println();

        return  "{id="+id+
                ",name="+name+
                ",sex="+sex+
                ",note="+note+
                ",studentSelfCard="+studentSelfCard+
                ",studentLectures="+studentLectureList+"}";
    }
}
