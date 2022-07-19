package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.DataBean;

public interface daoInterface {
	public List<DataBean> select();
	public void insert(DataBean bean);
	public void delete(String value);
}
