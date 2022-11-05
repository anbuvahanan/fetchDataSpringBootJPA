package com.mbfs.devops.springboot.fetchdataexample.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbfs.devops.springboot.fetchdataexample.model.Employee;

@Repository
public interface FetchDataService extends JpaRepository<Employee, Integer> {
	@Override
	List<Employee> findAll();
}
