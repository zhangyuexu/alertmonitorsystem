package alertmonitorsystem.service.impl;

import java.util.List;
import java.util.Map;

import alertmonitorsystem.dao.IBaseDao;
import alertmonitorsystem.service.IBaseService;
import alertmonitorsystem.utils.CastUtil;

public class BaseService implements IBaseService {

	public IBaseDao dao;

	public BaseService(IBaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(Map<String, Object> map) {
		dao.add(map);
	}
	
	@Override
	public void delete(Map<String, Object> map) {
		dao.delete(map);
	}
	
	@Override
	public void update(Map<String, Object> map) {
		dao.update(map);
	}
	
	@Override
	public List<Map<String,Object>> select(Map<String, Object> map) {
		return dao.select(map);
	}
	
	@Override
	public Map<String, Object> likeSelect(Map<String, Object> map) {
	
		List<String> orderData = CastUtil.cast(map.get("orderData"));
		
		String orderStr = "";
		for (int i = 0; i < orderData.size(); i++) {
			if (i == orderData.size() - 1) {
				orderStr += orderData.get(i);
				break;
			}
			orderStr += orderData.get(i) + ",";
		}
	
		Integer currentPage = (Integer) map.get("currentPage");

		Integer start = (currentPage - 1) * 10;


		Integer totalPage = 1;
		
		// sql中的start
		map.put("start", start);
		// 每页显示10条
		map.put("pageSize", 10);
		
		
		//排序条件
		map.put("orderStr", orderStr);


		// 获取总个数
		Integer totalCount = dao.likeSelectCount(map).intValue();

		List<Map<String, Object>> resultList = dao.likeSelect(map);
		
		if (totalCount != 0) {

			if (totalCount % 10 == 0) {
				totalPage = totalCount / 10;
			} else {
				totalPage = totalCount / 10 + 1;
			}

		}
		
		map.clear();
		// 当前页
		map.put("currentPage", currentPage);

		map.put("count", totalCount);

		map.put("totalPage", totalPage);

		map.put("result", resultList);

		return map;
	}
	
	@Override
	public void batchAdd(List<Map<String, Object>> list) {
		dao.batchAdd(list);
	}
	
	@Override
	public void batchDelete(List<Map<String, Object>> list) {
		dao.batchDelete(list);
	}
	
	@Override
	public void batchUpdate(List<Map<String, Object>> list) {
		dao.batchUpdate(list);
	}
	
}
