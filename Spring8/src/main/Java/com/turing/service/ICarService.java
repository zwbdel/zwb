package com.turing.service;

import java.util.List;

import com.turing.entity.Car;
/**
 * 业务层接口
 * @author fred
 *
 */
public interface ICarService {

	//查询单个
	Car findById(Integer id);
	
	//查询多个
	List<Car> findAll();
	
	//添加
	int insert(Car car);
	
	//修改
	int update(Car car);
	
	//删除
	int delete(Integer id);
}
