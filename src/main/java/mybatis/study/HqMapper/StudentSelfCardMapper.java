package mybatis.study.HqMapper;

import mybatis.study.Model.StudentSelfCard;

public interface StudentSelfCardMapper {

    public StudentSelfCard findStudentSelfCardByStudentId(int studentId);

}
