package com.jshop.service;

import java.util.List;

import com.jshop.entity.GoodsCommentT;

public interface GoodsCommentTService extends BaseTService<GoodsCommentT>{

	/**
	 * 删除评论和用户回复的评论
	 * 
	 * @param list
	 * @return
	 */
	public int delGoodsComment(String[] list);

	/**
	 * 更新用户评论和回复的评论状态
	 * 
	 * @param list
	 * @param state
	 * @return
	 */
	public int updateGoodsCommentorReplyByState(String state, String[] list);

	/**
	 * 获取对应商品的评论
	 * 
	 * @param goodsid
	 * @return
	 */
	public List<GoodsCommentT> findGoodsCommentByGoodsid(final String goodsid,
			final int currentPage, final int lineSize);

	/**
	 * 统计获取对应商品的评论
	 * 
	 * @param goodsid
	 * @return
	 */
	public int countfindGoodsCommentByGoodsid(String goodsid);

	/**
	 * 获取商品评论
	 * 
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public List<GoodsCommentT> findAllGoodsComment(final int currentPage,
			final int lineSize);

	/**
	 * 统计获取商品评论
	 * 
	 * @return
	 */
	public int countfindAllGoodsComment();

	/**
	 * 根据排序方式进行排序
	 * 
	 * @param currentPage
	 * @param lineSize
	 * @param queryString
	 * @return
	 */
	public List<GoodsCommentT> sortAllGoodsComment(final int currentPage,
			final int lineSize, String queryString);


	/**
	 * 根据评论id获取商品评论
	 * @param id
	 * @return
	 */
	public GoodsCommentT findGoodsCommentById(String id);
	/**
	 * 更新商品评论
	 * @param gct
	 */
	public void updateGoodsComment(GoodsCommentT gct);

	
	
}
