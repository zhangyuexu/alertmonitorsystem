package alertmonitorsystem.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alertmonitorsystem.dao.IWhite_listDao;
import alertmonitorsystem.service.IWhite_listService;
import alertmonitorsystem.utils.ExcelUtil;

@Service
public class White_listService extends BaseService implements IWhite_listService{

	
	private IWhite_listDao dao;

	@Autowired
	public White_listService(IWhite_listDao dao) {
		super(dao);
		this.dao = dao;
	}
	
	@Override
	public void exportExcel(HttpServletResponse response) {

		// 获取头部信息
		String[] headList = new String[] { "id", "test_case_name"};

		String[] describeList = new String[] { "", ""};

		ExcelUtil.exportExcel(response, dao, headList, describeList);
	}
}
