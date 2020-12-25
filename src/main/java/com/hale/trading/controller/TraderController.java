package com.hale.trading.controller;

import com.hale.trading.domain.Coin;
import com.hale.trading.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TraderController {

    @GetMapping("/")
    public String home(){
        return "index/index";
    }
}
