package com.vee.dao;

import java.util.List;

//unused
public interface BatchInsertProcessor<T> {
	public void batchInsert(List<T> entities);
}
