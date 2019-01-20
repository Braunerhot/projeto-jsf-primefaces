package br.com.framework.implementacao.crud;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class SimpleJdbcInsertImpl extends SimpleJdbcInsert implements Serializable {
 
	public SimpleJdbcInsertImpl(DataSource dataSource) {
		super(dataSource);
	}

	private static final long serialVersionUID = 1L;
	
}
