package com.iot.test.dao;

import java.util.List;

import com.iot.test.vo.ClassInfo;

public interface ClassDAO {
	public List<ClassInfo> selectClassList(ClassInfo ci);
	public ClassInfo selectClass(ClassInfo ci);
	public int insertClass(ClassInfo ci);
	public int updateClass(ClassInfo ci);
	public int deleteClass(ClassInfo ci);
}
