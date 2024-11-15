package com.walmart.ecommerce.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.walmart.ecommerce.rest.response.CouponResponse;

// hard coding of the url and port is a bad choice
// as it doesn't allow you to do load balancing

//@FeignClient(url="http://localhost:8081", name="cs")
//@FeignClient(name="cs")
@FeignClient(name="gateway")
public interface CouponFeignClient {
	
	@GetMapping("/cs/coupon/{code}")
	public CouponResponse searchtCoupon(@PathVariable String code);

}
