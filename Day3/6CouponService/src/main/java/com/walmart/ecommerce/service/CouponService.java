package com.walmart.ecommerce.service;

import com.walmart.ecommerce.entity.Coupon;

public interface CouponService {
	Coupon registerCoupon(Coupon p);
	//Coupon findCoupon(int id);
	Coupon findByCouponCode(String code);
}
