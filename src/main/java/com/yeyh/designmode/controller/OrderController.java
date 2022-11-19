package com.yeyh.designmode.controller;

import com.yeyh.designmode.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeyinghao
 * @version 1.0.0
 * @description:
 * @date: 2022/11/19 22:05
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/getPrice")
	public Object getPrice(){
		return "{\"a\":\"b\"}";
	}

}
