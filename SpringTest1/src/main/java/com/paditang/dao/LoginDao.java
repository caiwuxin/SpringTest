package com.paditang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.paditang.entity.LoginLog;

@Repository
public class LoginDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertLoginLog(LoginLog loginLog){
		String sql = "insert into  t_login_log(user_id,ip,login_time)" +
				"values(?,?,?)";
		Object[]args={loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()};
		jdbcTemplate.update(sql,args);
	}
}
