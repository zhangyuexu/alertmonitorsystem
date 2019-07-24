package alertmonitorsystem.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alertmonitorsystem.dao.ITest_resultDao;
import alertmonitorsystem.service.ITest_resultService;
import alertmonitorsystem.utils.ExcelUtil;

@Service
public class Test_resultService extends BaseService implements ITest_resultService{

	
	private ITest_resultDao dao;

	@Autowired
	public Test_resultService(ITest_resultDao dao) {
		super(dao);
		this.dao = dao;
	}
	
	@Override
	public void exportExcel(HttpServletResponse response) {

		// 获取头部信息
		String[] headList = new String[] { "id", "department_name", "test_case_name", "test_result", "assert_info", "testplan_time", "error_type", "error_comments", "testresult_time"};

		String[] describeList = new String[] { "", "", "", "", "", "", "", "", ""};

		ExcelUtil.exportExcel(response, dao, headList, describeList);
	}
}
