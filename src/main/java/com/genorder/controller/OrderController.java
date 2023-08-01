package com.genorder.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.genorder.config.BaseResponse;
import com.genorder.dto.DeliverDTO;
import com.genorder.dto.MachineShelfDTO;
import com.genorder.dto.MemberDTO;
import com.genorder.dto.OrderAddDTO;
import com.genorder.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/add")
    public BaseResponse addOrder(@RequestBody OrderAddDTO dto){
        if (dto.getTotalNum() == null || dto.getTotalNum() <= 0 || dto.getPayType() == null || dto.getOrderState() == null
                || StringUtils.isBlank(dto.getAccountId()) || StringUtils.isBlank(dto.getDeliveryMode()) ||
                StringUtils.isBlank(dto.getMsId())) {
            return BaseResponse.error("请正确传递参数");
        }
        orderService.addOrder(dto);
        return BaseResponse.success();
    }

    @RequestMapping("/listDeliver")
    public BaseResponse listDeliver() {
        List<DeliverDTO> list = orderService.listDeliver();
        return BaseResponse.success(list);
    }

    @RequestMapping("/listGoods")
    public BaseResponse listGoods(Long deliverId) {
        if (deliverId == null) {
            return BaseResponse.error();
        }
        List<MachineShelfDTO> list = orderService.listGoods(deliverId);
        return BaseResponse.success(list);
    }

    @RequestMapping("/listMember")
    public BaseResponse listMember() {
        List<MemberDTO> list = orderService.listMember();
        return BaseResponse.success(list);
    }

}
