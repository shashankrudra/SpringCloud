package com.walmart.ecommerce.service.impl;

import com.walmart.ecommerce.service.CouponService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.ecommerce.entity.Coupon;
import com.walmart.ecommerce.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	
	@Autowired
	private CouponRepository repo;

	@Override
	public Coupon registerCoupon(Coupon p) {
		repo.save(p);
		return null;
	}

	/*
	 * @Override public Coupon findCoupon(int id) { Coupon p =
	 * repo.findById(id).get(); return p; }
	 */

	@Override
	public Coupon findByCouponCode(String code) {
		// TODO Auto-generated method stub
		return repo.findByCouponCode(code);
	}

}
