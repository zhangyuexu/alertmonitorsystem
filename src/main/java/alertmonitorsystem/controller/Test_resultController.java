package alertmonitorsystem.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alertmonitorsystem.service.ITest_resultService;

@RestController
@RequestMapping("/test_result")
public class Test_resultController extends BaseController {

	
	private ITest_resultService service;

	@Autowired
	public Test_resultController(ITest_resultService service) {
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
