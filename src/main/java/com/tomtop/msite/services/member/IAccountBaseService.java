package com.tomtop.msite.services.member;

import com.tomtop.msite.entitys.pgsql.member.AccountBase;

/**
 * 
 * 
 * 
 * 
 * @author ye_ziran
 * @since 2016年4月29日 上午9:36:34
 */
public interface IAccountBaseService {
	
	/**
	 * 
	 * 通过id拿到实体
	 *
	 * @param id
	 * @return
	 *
	 * @author ye_ziran
	 * @since 2016年4月29日 上午9:36:46
	 */
	AccountBase get(Integer id);
}
