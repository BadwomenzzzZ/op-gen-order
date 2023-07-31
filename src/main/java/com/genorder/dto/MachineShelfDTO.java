package com.genorder.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class MachineShelfDTO {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机器id
     */
    private String machineId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 貨道号
     */
    private Integer shelfIndex;

    /**
     * 库存：个/克/
     */
    private Integer stock;

    /**
     * 是否损坏（0完好，1损坏）
     */
    private Byte isBroken;

    /**
     * 是否缺货（0有货，1缺货）
     */
    private Byte isStockout;

    /**
     * 上次补货时间
     */
    private LocalDateTime lastStockTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 新增时间
     */
    private LocalDateTime createTime;

    /**
     * 删除状态：0未删除,1已删除
     */
    private Byte deleted;

    /**
     * 貨道容量
     */
    private Integer maxStock;

    /**
     * 单杯容量
     */
    private Integer singleStock;

    private BigDecimal price;

    /**
     * 上次补货后库存
     */
    private Integer lastReplenishStock;

    private BigDecimal couponPrice;

    /**
     * 开启状态：0关闭，1开启
     */
    private Byte status;

}
