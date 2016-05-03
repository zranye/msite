package com.tomtop.msite.mapper.pgsql.member;

import org.apache.ibatis.annotations.Param;

import com.tomtop.msite.entitys.pgsql.member.AccountBase;

/**
 * 账户基本信息表
 * <p>对应t_account_base
 * 
 * @author ye_ziran
 * @since 2016年4月11日 上午11:53:30
 */
public interface AccountBaseMapper {
	
	/**
	 * 插入数据
	 * 
	 * @param accountBase
	 * @return
	 * @author ye_ziran
	 * @since 2016年4月11日 下午2:48:19
	 */
	int insert(@Param("item")AccountBase accountBase);
	/**
	 * 更新数据
	 * 
	 * @param accountBase
	 * @return
	 * @author ye_ziran
	 * @since 2016年4月11日 下午2:48:29
	 */
	int update(AccountBase accountBase);
	/**
	 * 删除数据
	 * 
	 * @param accountBase
	 * @return
	 * @author ye_ziran
	 * @since 2016年4月11日 下午2:48:36
	 */
	int delete(AccountBase accountBase);
	
	/**
	 * 通过id拿到账户实体
	 * 
	 * @param id
	 * @return 
	 * @author ye_ziran
	 * @since 2016年4月11日 下午2:48:36
	 */
	AccountBase get(int id);
	
}
