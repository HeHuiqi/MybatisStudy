package mybatis.study;

import mybatis.study.Model.User;
import org.apache.ibatis.annotations.Select;

public interface HqUserMapper {

    @Select("select * from User where userId = #{userId}")
    public User getUser(int userId);
}
