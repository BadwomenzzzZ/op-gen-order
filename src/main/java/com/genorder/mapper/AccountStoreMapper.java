package com.genorder.mapper;

import com.genorder.dto.MemberDTO;
import com.genorder.entity.AccountStore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ChenJ
 * @since 2023-08-01
 */
public interface AccountStoreMapper extends BaseMapper<AccountStore> {

    List<MemberDTO> listMember();

}
