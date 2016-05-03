package com.tomtop.msite.controllers.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tomtop.msite.entitys.pgsql.member.AccountBase;
import com.tomtop.msite.services.member.IAccountBaseService;

@RestController
@RequestMapping("/accounts")
//@MapperScan("com.tomtop.msite.pgsql.mapper")
public class AccountController {

	@Autowired
	private IAccountBaseService iAccountBaseService;
	
	@RequestMapping("/{id}")
    public @ResponseBody AccountBase get(@PathVariable(value="id") Integer id){
        return iAccountBaseService.get(id);
    }
	
}
