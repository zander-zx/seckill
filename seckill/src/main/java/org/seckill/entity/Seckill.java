package org.seckill.entity;

import java.util.Date;

/**
 * 秒杀商品实体类
 */
public class Seckill {
    private long seckillId; //秒杀商品id

    private String spmc;//商品名称

    private int kcsl;//商品库存

    private Date startTime;//开始时间

    private Date endTime;//结束时间

    private Date createTime;//创建时间

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getSpmc() {
        return spmc;
    }

    public void setSpmc(String spmc) {
        this.spmc = spmc;
    }

    public int getKcsl() {
        return kcsl;
    }

    public void setKcsl(int kcsl) {
        this.kcsl = kcsl;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", spmc='" + spmc + '\'' +
                ", kcsl=" + kcsl +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
