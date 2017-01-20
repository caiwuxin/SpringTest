package com.paditang.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.paditang.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String userName,String password){
		String sql ="SELECT count(*) From t_user" +
				" Where usr_name=? and password = ?";
		return jdbcTemplate.queryForInt(sql,new Object[]{userName,password});
	}
	
	public User findUserByUserName(final String userName){
		String sql = "select usr_id,usr_name,credits" +
				" from t_user where usr_name=?";
		final User usr = new User();
		jdbcTemplate.query(sql, new Object[]{userName},
				new RowCallbackHandler(){
					public void processRow(ResultSet rs)throws SQLException{
						usr.setUserId(rs.getInt("usr_id"));
						usr.setUserName(userName);
						usr.setCredits(rs.getInt("credits"));
					}
		});
		return usr;
	}
	
	public void UpdateUser(User usr){
		String sql = "update t_user set last_visit = ?,last_ip=?,credits=?" +
				" where usr_id = ?";
		jdbcTemplate.update(sql,new Object[]{usr.getLastVisit(),usr.getLastIp(),usr.getCredits()
				,usr.getUserId()});
	}
	
}
