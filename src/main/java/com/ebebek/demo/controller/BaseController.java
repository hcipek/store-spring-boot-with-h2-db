package com.ebebek.demo.controller;

import com.ebebek.demo.model.base.BaseRequest;
import com.ebebek.demo.model.base.BaseResponse;
import com.ebebek.demo.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
public abstract class BaseController<T extends BaseService, U extends BaseRequest, V extends BaseResponse> {
	
	@Autowired
	protected T service;

	public abstract V create(@RequestBody U request);

	public abstract V update(@RequestBody U request);

	public abstract V delete(@RequestBody U request);

	public abstract V get(@RequestBody U request);

	@GetMapping("/ping")
	public String ping() {
		return "Alive";
	}

}
