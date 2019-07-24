package alertmonitorsystem.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alertmonitorsystem.service.IError_typeService;

@RestController
@RequestMapping("/error_type")
public class Error_typeController extends BaseController {

	
	private IError_typeService service;

	@Autowired
	public Error_typeController(IError_typeService service) {
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
