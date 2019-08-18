package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Table;
@Repository
public interface TableDao {
	
	public List<Table> query();

}
