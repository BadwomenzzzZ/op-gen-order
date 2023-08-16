package com.genorder.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.genorder.config.BaseResponse;
import com.genorder.dto.*;
import com.genorder.entity.Order;
import com.genorder.pojo.OrderSearchPOJO;
import com.genorder.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public BaseResponse listGoods(String deliverId) {
        if (deliverId == null) {
            return BaseResponse.error();
        }
        List<GoodsDTO> list = orderService.listGoods(deliverId);
        return BaseResponse.success(list);
    }

    @RequestMapping("/listMember")
    public BaseResponse listMember() {
        List<MemberDTO> list = orderService.listMember();
        return BaseResponse.success(list);
    }

    @RequestMapping("/list")
    public Object listOrder(@RequestHeader(value = "Authorization" ,required = false) String token , Integer pageNum , Integer pageSize
                             , OrderSearchPOJO pojo ,
                            @RequestParam(value = "params[beginTime]" , required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime ,
                            @RequestParam(value = "params[endTime]" , required = false)   @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime) {
        if (pageNum == null || pageSize == null) {
            return BaseResponse.error();
        }
        if (StringUtils.isBlank(token)) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", 401);
            map.put("msg", "令牌不能为空");
            return map;
        }
        Map map = orderService.listOrder(token , pageNum , pageSize , pojo , beginTime , endTime);
        return map;
    }


}
