package mybatis.study;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MybaitsSqlSessionFactory {

    static  SqlSessionFactory sqlSessionFactory = null;

    private  MybaitsSqlSessionFactory(){}
    static SqlSessionFactory getSqlSessionFactory(){

        //创建数据库连接池
        PooledDataSource  pooledDataSource = new PooledDataSource();
        pooledDataSource.setDriver("com.mysql.jdbc.Driver");
        pooledDataSource.setUrl("jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=UTF-8");
        pooledDataSource.setUsername("root");
        pooledDataSource.setPassword("h12345678");

        //事务管理
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        //创建运行环境
        Environment environment = new Environment("development",transactionFactory,pooledDataSource);
        //构建Configuration
        Configuration  configuration = new Configuration(environment);
        configuration.addMapper(HqUserMapper.class);
        //创建SqlSessionFactory


        //创建SqlSessionFactory
        if (sqlSessionFactory == null){
            synchronized (SqlSessionFactory.class){

                if (sqlSessionFactory == null){

                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
                }
            }
        }
        System.out.println("sqlSessionFactory=="+sqlSessionFactory);

        return sqlSessionFactory;
    }


    static SqlSessionFactory getXmlSqlSessionFactory(){


        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            //读取配置文件信息
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
            Logger.getLogger(MybaitsSqlSessionFactory.class.getName()).log(Level.DEBUG,null,e);

        }
        //创建SqlSessionFactory
        if (sqlSessionFactory == null){
            synchronized (SqlSessionFactory.class){

                if (sqlSessionFactory == null){

                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


                    //也可以通过读取properties文件来创建sqlSessionFactory
                    //这样就可以在properties文件配置加密后的数据库密码，然后读取在解密
//                    Properties properties = null;
//                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,properties);

                }
            }
        }
        System.out.println("xml_sqlSessionFactory=="+sqlSessionFactory);

        return sqlSessionFactory;

    }

    static SqlSession openSqlSession(){

        if (sqlSessionFactory == null){

            getXmlSqlSessionFactory();
//            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }

}
