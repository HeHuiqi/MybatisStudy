package mybatis.study.HqMapper;

import mybatis.study.Model.StudentHealthFemale;

import java.util.List;

public interface StudentHealthFemaleMapper {

    public List<StudentHealthFemale> getFemaleStudentHealth(int studentId);

}
