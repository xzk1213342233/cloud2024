package com.atguigu.cloud.controller;


import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayGateWayController {

    @Autowired
    PayFeignApi payFeignApi;



    /**
     * GateWay进行网关测试案例01
     * @param id
     * @return
     */
    @GetMapping(value = "/pay/gateway/get/{id}")
    public ResultData getById(@PathVariable("id") Integer id){
        return payFeignApi.getById(id);
    }

    /**
     * GateWay进行网关测试案例02
     * @return
     */
    @GetMapping(value = "/pay/gateway/info")
    public ResultData<String> getGatewayInfo(){
        payFeignApi.getGatewayInfo();
        return ResultData.success("GateWay进行网关测试案例02成功！");
    }

}
