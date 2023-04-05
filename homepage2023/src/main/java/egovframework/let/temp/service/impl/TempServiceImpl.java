package egovframework.let.temp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService{

//		@Resource(name = "tempDAO")
//		private TempDAO tempDAO;
	
		@Resource(name = "tempMapper")
		private TempMapper tempMapper;
	
//		public TempVO selectTemp(TempVO vo) throws Exception {
//			return tempDAO.selectTemp(vo);		
//			}
		
		// 임시 데이터 가져오기
		public TempVO selectTemp(TempVO vo) throws Exception {
			return tempMapper.selectTemp(vo);
		}
}
