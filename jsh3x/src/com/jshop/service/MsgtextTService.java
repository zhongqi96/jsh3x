package com.jshop.service;

import java.util.List;

import com.jshop.entity.MsgtextT;

public interface MsgtextTService extends BaseTService<MsgtextT>{


	/**
	 * 删除站内信消息
	 * 
	 * @param list
	 * @return
	 */
	public int delMsgtext(String[] list);

	/**
	 * 更新站内信消息
	 * 
	 * @param mt
	 * @return
	 */
	public int updateMsgtext(MsgtextT mt);

	/**
	 * 根据id获取站内信消息
	 * 
	 * @param id
	 * @return
	 */
	public MsgtextT findMsgtextById(String id);

	/**
	 * 获取所有站内信
	 * 
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public List<MsgtextT> findAllMsgtext(final int currentPage,
			final int lineSize);

	/**
	 * 统计获取所有站内信
	 * 
	 * @return
	 */
	public int countfindAllMsgtext();

}
