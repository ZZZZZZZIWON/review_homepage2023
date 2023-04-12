package egovframework.let.temp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface TempService {
	
	// 임시 데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	// 임시 데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception;
	
	// 임시 데이터 등록하기
	public String insertTemp(TempVO vo) throws Exception;
<<<<<<< HEAD

	// 임시 데이터 수정하기
	public void updateTemp(TempVO tempVO) throws Exception;

	// 임시 데이터 삭제하기
	public void deleteTemp(TempVO tempVO) throws Exception;
=======
>>>>>>> branch 'master' of https://github.com/ZZZZZZZIWON/review_homepage2023.git
}
