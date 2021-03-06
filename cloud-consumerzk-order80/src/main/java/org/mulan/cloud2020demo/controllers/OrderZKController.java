package org.mulan.cloud2020demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 韩志雄
 * @date 2021/4/16 17:29
 */
@RestController
@Slf4j
public class OrderZKController {

	public static final String PAYMENT_URL="http://cloud-payment-service";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/zk")
	public String info(){
		return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
	}
}
