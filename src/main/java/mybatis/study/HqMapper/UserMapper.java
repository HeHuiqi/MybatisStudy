package mybatis.study.HqMapper;

import mybatis.study.Model.User;

import java.util.List;

public interface UserMapper {

    //插入、更新、删除之后必须做commit操作，不然数据不会入库
    public User getUser(User user);

    public List<User> getAllUser();

    public void  insertUser(User user);

    public void  updateUser(User user);

    public void  deleteUser(User user);
}
