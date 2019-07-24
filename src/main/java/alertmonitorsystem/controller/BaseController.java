package alertmonitorsystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import alertmonitorsystem.service.IBaseService;

public class BaseController {
	
	public IBaseService service;
	
	public BaseController(IBaseService service) {
		this.service = service;
	}
	
	/**
	 * 查询
	 * 
	 * @return
	 */
	@RequestMapping("/select")
	public List<Map<String, Object>> select(@RequestBody Map<String, Object> map) {
		return service.select(map);
	}

	/**
	 * 模糊查询
	 * 
	 * @return
	 */
	@RequestMapping("/likeSelect")
	public Map<String, Object> likeSelect(@RequestBody Map<String, Object> map) {
		return service.likeSelect(map);
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	@RequestMapping("/update")
	public void update(@RequestBody Map<String, Object> map) {
		service.update(map);
	}

	/**
	 * 添加
	 * 
	 * @return
	 */
	@RequestMapping("/add")
	public void add(@RequestBody Map<String, Object> map) {
		service.add(map);
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	@RequestMapping("/delete")
	public void delete(@RequestBody Map<String, Object> map) {
		service.delete(map);
	}

	/**
	 * 批量增加
	 * 
	 * @return
	 */
	@RequestMapping("/batchAdd")
	public void batchAdd(@RequestBody Map<String, List<Map<String, Object>>> map) {
		service.batchAdd(map.get("list"));
	}

	/**
	 * 批量删除
	 * 
	 * @return
	 */
	@RequestMapping("/batchDelete")
	public void batchDelete(@RequestBody Map<String, List<Map<String, Object>>> map) {
		service.batchDelete(map.get("list"));
	}

	/**
	 * 批量更新
	 * 
	 * @return
	 */
	@RequestMapping("/batchUpdate")
	public void batchUpdate(@RequestBody Map<String, List<Map<String, Object>>> map) {
		service.batchUpdate(map.get("list"));
	}

}
