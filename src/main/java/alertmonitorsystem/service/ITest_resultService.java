package alertmonitorsystem.service;

import javax.servlet.http.HttpServletResponse;

public interface ITest_resultService extends IBaseService {

	public void exportExcel(HttpServletResponse response);

}
