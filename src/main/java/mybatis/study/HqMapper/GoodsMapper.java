package mybatis.study.HqMapper;

import mybatis.study.Model.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    public Goods findOneGoods(@Param("goodsId") long goodsId);
    public Goods findGoods(@Param("goodsId") long goodsId);
    public List<Goods> findAllGoods();

    public  int updateGoods(long goodsId,String goodsName ,float goodPrice);

    public  int insertGoods(Goods goods);

    public  int deleteGoods(long goodsId);


}
