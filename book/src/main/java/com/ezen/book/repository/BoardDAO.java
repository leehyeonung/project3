package com.ezen.book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ezen.book.domain.BoardVO;
import com.ezen.book.domain.PagingVO;

@Repository

public interface BoardDAO {

	List<BoardVO> selectBoardListPaging(PagingVO pvo);

	int searchTotalCount(PagingVO pvo);

	int selectTotalCount();
	
	List<BoardVO> selectBoardList();
}
