package hanbang.store.factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

public class SqlSessionFactoryProvider {

	private static final String resource = "hanbang/mybatis-config.xml";
	private static SqlSessionFactory factory;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (factory == null) {
			createSqlSessionFactory();
		}
		return factory;
	}

	private static void createSqlSessionFactory() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
