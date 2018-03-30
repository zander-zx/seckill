package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * 秒杀成功明细Dao层接口
 */
public interface SuccessKilledDao {

    /**
     * 插入购买秒杀商品明细， 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId , long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀商品实体对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);

}
