package com.genorder.mapper;

import com.genorder.dto.DeliverDTO;
import com.genorder.dto.MachineShelfDTO;
import com.genorder.entity.MachineShelf;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 机器貨道表 Mapper 接口
 * </p>
 *
 * @author ChenJ
 * @since 2023-07-31
 */
public interface MachineShelfMapper extends BaseMapper<MachineShelf> {

    List<DeliverDTO> listDeliver();

    List<MachineShelfDTO> listGoods(@Param("deliverId") Long deliverId);
}
