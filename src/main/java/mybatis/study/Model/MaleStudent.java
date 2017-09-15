package mybatis.study.Model;

import java.util.List;

public class MaleStudent extends Student{

    private List<StudentHealthMale> maleList;

    public List<StudentHealthMale> getMaleList() {
        return maleList;
    }

    public void setMaleList(List<StudentHealthMale> maleList) {
        this.maleList = maleList;
    }

}
