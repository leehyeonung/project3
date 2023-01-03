package com.ezen.book.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ezen.book.domain.BoardVO;
import com.ezen.book.domain.PagingVO;
import com.ezen.book.repository.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardSerivceImpl implements BoardService {

	@Inject
	private BoardDAO bdao;
	
	@Override
	public List<BoardVO> getList(PagingVO pvo) {
		log.info(">>> board Paging List check2");
		return bdao.selectBoardListPaging(pvo);
	}

	@Override
	public int getTotalCount(PagingVO pvo) {
		// TODO Auto-generated method stub
		return bdao.searchTotalCount(pvo);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return bdao.selectTotalCount();
	}
	
	@Override
	public List<BoardVO> getList() {
		log.info(">>> board list check2");
		return bdao.selectBoardList();
	}
}