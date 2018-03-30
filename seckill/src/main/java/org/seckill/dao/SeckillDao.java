package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * 秒杀商品对应数据Dao层接口
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckikkId
     * @param killTime
     * @return 插入的行数 <=0 代表插入失败
     */
    int reduceNumber(long seckikkId, Date killTime);

    /**
     *根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @return
     */
    List<Seckill> queryAll();

}
