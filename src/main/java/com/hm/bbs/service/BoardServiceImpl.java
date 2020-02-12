package com.hm.bbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hm.bbs.mapper.BoardMapper;
import com.hm.bbs.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardMapper mapper;

	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public void insert(BoardVO board) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardVO board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub

	}

}
