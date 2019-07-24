package alertmonitorsystem.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alertmonitorsystem.dao.IError_typeDao;
import alertmonitorsystem.service.IError_typeService;
import alertmonitorsystem.utils.ExcelUtil;

@Service
public class Error_typeService extends BaseService implements IError_typeService{

	
	private IError_typeDao dao;

	@Autowired
	public Error_typeService(IError_typeDao dao) {
		super(dao);
		this.dao = dao;
	}
	
	@Override
	public void exportExcel(HttpServletResponse response) {

		// 获取头部信息
		String[] headList = new String[] { "id", "error_type"};

		String[] describeList = new String[] { "", ""};

		ExcelUtil.exportExcel(response, dao, headList, describeList);
	}
}
