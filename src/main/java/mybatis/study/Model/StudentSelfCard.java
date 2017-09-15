package mybatis.study.Model;

public class StudentSelfCard {

    private  int id;
    private  int studentId;
    private  String stnative;
    private  String issueDate;
    private  String endDate;
    private  String note;

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

    public String getStnative() {
        return stnative;
    }

    public void setStnative(String stnative) {
        this.stnative = stnative;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "{id="+id+",native="+stnative+",issueDate="+issueDate+",endDate="+endDate+",note="+note+"}";
    }
}
