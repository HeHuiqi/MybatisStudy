package mybatis.study.HqMapper;

import mybatis.study.Model.StudentLecture;

public interface StudentLectureMapper {

    public StudentLecture findStudentLectureByStudentId(int studentId);
}
