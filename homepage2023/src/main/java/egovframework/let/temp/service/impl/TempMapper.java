package egovframework.let.temp.service.impl;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("tempMapper")
public interface TempMapper {
	
	// 임시데이터 가져오기
	TempVO selectTemp(TempVO vo) throws Exception;

}
