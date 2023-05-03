package egovframework.let.crud.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.crud.service.CrudService;
import egovframework.let.crud.service.CrudVO;
import egovframework.let.temp3.service.Temp3VO;
import egovframework.rte.fdl.string.EgovStringUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class CrudController {
	
	@Resource(name="crudService")
	private CrudService crudService;

	// CRUD 가져오기
	@RequestMapping(value="/crud/select.do")
	public String select(CrudVO crudVO, HttpServletRequest request, ModelMap model) throws Exception {
		CrudVO result = crudService.selectCrud(crudVO);
		model.addAttribute("result",result);
		return "crud/CrudSelect";
	}
	
	// CRUD 가져오기
	@RequestMapping(value="/crud/selectList.do")
	public String selectList(CrudVO crudVO, HttpServletRequest request, ModelMap model) throws Exception {
		PaginationInfo paginationInfo = new PaginationInfo();
		
		paginationInfo.setCurrentPageNo(crudVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(crudVO.getPageUnit());
		paginationInfo.setPageSize(crudVO.getPageSize());
		
		crudVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		crudVO.setLastIndex(paginationInfo.getLastRecordIndex());
		crudVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		int totCnt = crudService.selectCrudListCnt(crudVO);
		
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		
		List<EgovMap> resultList = crudService.selectCrudList(crudVO);
		model.addAttribute("resultList", resultList);
		
		return "crud/CrudSelectList"; //jsp의 이름과 동일해야 함(반환값이기 때문에)
	}
	
	// CRUD 등록 / 수정
	@RequestMapping(value="/crud/crudRegist.do")
	public String crudRegist(CrudVO crudVO, HttpServletRequest request, ModelMap model) throws Exception {
		CrudVO result = new CrudVO();
		// egovframework.let.utl.fcc.service.EgovStringUti
		if(!EgovStringUtil.isEmpty(crudVO.getCrudId())) {
			result = crudService.selectCrud(crudVO);
		}
		model.addAttribute("result", result);
		
		return "crud/CrudRegist";
	}
	
	// CRUD 등록하기
	@RequestMapping(value="/crud/insert.do")
	public String insert(CrudVO crudVO, HttpServletRequest request) throws Exception {
		crudService.insertCrud(crudVO);
		
		return "forward:/crud/selectList.do";
	}
	
	// CRUD 수정하기
	@RequestMapping(value="/crud/update.do")
	public String update(CrudVO crudVO, HttpServletRequest request) throws Exception {
		crudService.updateCrud(crudVO);
		
		return "forward:/crud/selectList.do";
	}
	
	// CRUD 삭제하기
	@RequestMapping(value="/crud/delete.do")
	public String delete(CrudVO crudVO, HttpServletRequest request) throws Exception {
		crudService.deleteCrud(crudVO);
		
		return "forward:/crud/selectList.do";
	}

}
