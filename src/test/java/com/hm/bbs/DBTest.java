package com.hm.bbs;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hm.bbs.mapper.BoardMapper;
import com.hm.bbs.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DBTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Inject
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		List<BoardVO> list = mapper.getList();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testFactory() {
		System.out.println(">>>>>>>>>>> sqlFactory: "+sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		try (SqlSession session = sqlFactory.openSession()){
			System.out.println(">>>>>>>>>>> session : "+ session + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
