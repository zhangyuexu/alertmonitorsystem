package alertmonitorsystem.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alertmonitorsystem.service.ITest_caseService;

@RestController
@RequestMapping("/test_case")
public class Test_caseController extends BaseController {

	
	private ITest_caseService service;

	@Autowired
	public Test_caseController(ITest_caseService service) {
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
