package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.DataBean;

public interface daoInterface {
	public void insert(DataBean bean);
	public List<DataBean> select();
	// public void delete(String value);
}
