package com.bancnet.exam.dao;

import java.util.List;

public interface BaseDao<T> {

	void add(T t);

	void edit(T t);

	void delete(T t);

	List<T> retrieve();
}
