package kr.hs.study.service;


import java.util.List;

import kr.hs.study.dto.DataBean;

public interface dataInterface {
	public void insert(DataBean bean);
	public List<DataBean> select();
	// public void delete(String value);
}
