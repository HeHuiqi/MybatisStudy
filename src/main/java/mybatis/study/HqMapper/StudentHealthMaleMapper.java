package mybatis.study.HqMapper;

import mybatis.study.Model.StudentHealthMale;

import java.util.List;

public interface StudentHealthMaleMapper {

    public List<StudentHealthMale> getMaleStudentHealth(int studentId);
}
