package mybatis.study;

import mybatis.study.HqMapper.*;
import mybatis.study.Model.Goods;
import mybatis.study.Model.Lecture;
import mybatis.study.Model.Student;
import mybatis.study.Model.StudentHealthMale;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class App {

    public static void main(String[] args){

        SqlSession session = null;

        try {
            session = MybaitsSqlSessionFactory.openSqlSession();
            //如果Mapper接口使用了注解的方式进行crud操作，则不需要对应的MapperXML配置文件
            //例如HqUserMapper
//        HqUserMapper hqUserMapper = session.getMapper(HqUserMapper.class);
//        user = hqUserMapper.getUser(1);
//        System.out.println("hqUserMapper=="+user);



            //使用mybatis要编写xml配置文件和映射接口-如:UserMapper(interface)--UserMapper.xml
            //xml中的id属性及参数要和接口中的方法名参数一致,否则会出现BindingException
            //然后通过getMapper的方式获取映射接口实例，进而获取结果对象

            //查询
//            User selectUser = new User();
//            selectUser.setUserId(1);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            selectUser = userMapper.getUser(selectUser);
//            System.out.println("selectUser=="+selectUser);

            //使用namespace+sqlID直接可以获取结结果，也不需要编写对应的接口（ibatis的特性）
            //这种方式还是不要用了
//            String sqlId = "mybatis.study.HqMapper.UserMapper.getUser";
//            selectUser =  session.selectOne(sqlId,selectUser);
//            System.out.println("sqlId=="+selectUser);

            //查询所有
//            List<User> users = userMapper.getAllUser();
//            System.out.println("users=="+users);

            //插入
//        User insetUser = new User();
//        insetUser.setUserId(100);
//        insetUser.setUsername("yiyiyi");
//        insetUser.setPassword("88888");
//        userMapper.insertUser(insetUser);

            //更新
//        User updateUser = new User();
//        updateUser.setUserId(2);
//        updateUser.setUsername("处分记大过");
//        userMapper.updateUser(updateUser);

            //删除
//        User deleteUser = new User();
//        deleteUser.setUserId(100);
//        userMapper.deleteUser(insetUser);


//            Goods goods = new Goods();
//            goods.setGoodsId(3);
//            goods.setGoodsName("辣条");
//            goods.setGoodsPrice((float) 1.5);
//            GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
//           List<Goods> goodsList =  goodsMapper.findAllGoods();
//           System.out.println("goodsList=="+goodsList);

//            int result = goodsMapper.insertGoods(goods);
//            System.out.println("insertGoods=="+result);
//            goodsMapper.updateGoods(2,"苹果",10);

//            goodsMapper.deleteGoods(3);

//            goods = goodsMapper.findGoods(1);
//            System.out.println("=="+goods);
//
//            goods = goodsMapper.findOneGoods(1);
//            System.out.println("findOneGoods=="+goods);


//            LectureMapper lectureMapper = session.getMapper(LectureMapper.class);
//            Lecture lecture = lectureMapper.getLecture(1);
//            System.out.println("lecture=="+lecture);

            StudentMapper studentMapper = session.getMapper(StudentMapper.class);
            Student student = studentMapper.getStudent(2);
            System.out.println("student=="+student);

//            System.out.println("getStudentSelfCard=="+student.getStudentSelfCard());
//            System.out.println("getStudentLectureList=="+student.getStudentLectureList());

//            StudentHealthFemaleMapper femaleMapper = session.getMapper(StudentHealthFemaleMapper.class);
//            System.out.println("female==="+femaleMapper.getFemaleStudentHealth(2));
//
//            StudentHealthMaleMapper maleMapper = session.getMapper(StudentHealthMaleMapper.class);
//            System.out.println("male==="+maleMapper.getMaleStudentHealth(1));

            //插入、更新、删除之后必须做commit操作，不然数据不会入库
            session.commit();



        }catch (Exception e){

            System.out.println(e.getLocalizedMessage());
            session.rollback();
        }finally {
            //关闭session
            session.close();
        }


    }

}
