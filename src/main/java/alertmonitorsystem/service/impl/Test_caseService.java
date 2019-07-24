package alertmonitorsystem.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alertmonitorsystem.dao.ITest_caseDao;
import alertmonitorsystem.service.ITest_caseService;
import alertmonitorsystem.utils.ExcelUtil;

@Service
public class Test_caseService extends BaseService implements ITest_caseService{

	
	private ITest_caseDao dao;

	@Autowired
	public Test_caseService(ITest_caseDao dao) {
		super(dao);
		this.dao = dao;
	}
	
	@Override
	public void exportExcel(HttpServletResponse response) {

		// 获取头部信息
		String[] headList = new String[] { "id", "department_name", "test_case_name", "test_result", "last_test_result", "last_result_time", "assert_info", "white_list_flag"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", ""};

		ExcelUtil.exportExcel(response, dao, headList, describeList);
	}
}
