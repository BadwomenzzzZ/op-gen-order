package com.genorder.controller;

import com.genorder.config.BaseResponse;
import com.genorder.dto.DeliverDTO;
import com.genorder.dto.MachineShelfDTO;
import com.genorder.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/add")
    public BaseResponse add(){
        //TODO add Order
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

}
