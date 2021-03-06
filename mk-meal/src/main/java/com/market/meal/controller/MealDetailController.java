package com.market.meal.controller;


import com.market.meal.model.MealDetail;
import com.market.meal.service.IMealDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName MealDetailController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/9
 * @Version V1.0
 **/
@Api(tags ="套餐明细")
@RestController
@RequestMapping("mealdetail")
public class MealDetailController {
    @Autowired
    private IMealDetailService mealDetailService;

    @GetMapping("getbysetmealid")
    @ApiOperation(value="获取套餐明细")
    public ResponseEntity<List<MealDetail>> getBySetmealId(@RequestParam Integer setmealid){
        List<MealDetail> data= mealDetailService.selectBySetmealid(setmealid);
        return ResponseEntity.ok(data);
    }
}
