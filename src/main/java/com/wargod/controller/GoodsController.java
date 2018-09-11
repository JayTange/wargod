package com.wargod.controller;

import com.wargod.constant.WebConstant;
import com.wargod.domain.vo.GoodVo;
import com.wargod.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("")
    public String index(HttpServletRequest request){
        List<GoodVo> goodVoList = goodsService.getGoodsList();
        request.setAttribute(WebConstant.GOODS_LIST,goodVoList);
        return "goodslist";
    }
}