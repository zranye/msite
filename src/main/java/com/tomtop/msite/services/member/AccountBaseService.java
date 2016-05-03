package com.tomtop.msite.services.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomtop.msite.TargetDataSource;
import com.tomtop.msite.entitys.pgsql.member.AccountBase;
import com.tomtop.msite.mapper.pgsql.member.AccountBaseMapper;

@Service
@MapperScan("com.tomtop.msite.mapper.pgsql.member")
public class AccountBaseService implements IAccountBaseService {

	@Autowired
	private AccountBaseMapper accountMapper;
	
	@TargetDataSource(name="member")
	@Override
	public AccountBase get(Integer id) {
		return accountMapper.get(id);
	}

}
