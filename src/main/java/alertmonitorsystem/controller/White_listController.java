package alertmonitorsystem.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alertmonitorsystem.service.IWhite_listService;

@RestController
@RequestMapping("/white_list")
public class White_listController extends BaseController {

	
	private IWhite_listService service;

	@Autowired
	public White_listController(IWhite_listService service) {
		super(service);
		this.service = service;
	}
		
	/**
	 * 导出excel
	 * 
	 * @return
	 */
	@RequestMapping("/exportExcel")
	public void exportExcel(HttpServletResponse response) {
		service.exportExcel(response);
	}
					
}
