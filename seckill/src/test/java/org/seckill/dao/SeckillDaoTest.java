package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和junit整合，junit启动加载springIOC容器 1111
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class  SeckillDaoTest  {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;
    @Test
    public void queryById() {
        long id = 1006L;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getSpmc());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() {
    }

    @Test
    public void reduceNumber() {
    }


}