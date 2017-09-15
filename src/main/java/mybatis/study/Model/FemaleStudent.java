package mybatis.study.Model;

import java.util.List;

public class FemaleStudent extends  Student{

    private List<StudentHealthFemale> femaleList;

    public List<StudentHealthFemale> getFemaleList() {
        return femaleList;
    }

    public void setFemaleList(List<StudentHealthFemale> femaleList) {
        this.femaleList = femaleList;
    }
}
