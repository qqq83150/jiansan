package com.youzhong.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(Date.class)
@MappedJdbcTypes(JdbcType.DATE)
public class DateTypeHandler extends BaseTypeHandler<Date>{

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i,sdf.format(parameter));
	}

	@Override
	public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("----------------");
		return rs.getDate(columnName);
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("----------------");
		return rs.getDate(columnIndex);
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("----------------");
		return cs.getDate(columnIndex);
	}

}
