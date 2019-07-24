package alertmonitorsystem.service;

import javax.servlet.http.HttpServletResponse;

public interface IWhite_listService extends IBaseService {

	public void exportExcel(HttpServletResponse response);

}
