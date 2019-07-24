package alertmonitorsystem.dao;

import java.util.List;
import java.util.Map;

public interface IBaseDao {

	void add(Map<String, Object> map);
	
	void delete(Map<String, Object> map);
	
	void update(Map<String, Object> map);
	
	List<Map<String,Object>> select(Map<String, Object> map);
	
	List<Map<String,Object>> likeSelect(Map<String, Object> map);
	
	Long likeSelectCount(Map<String, Object> map);
	
	void batchAdd(List<Map<String, Object>> list);
	
	void batchDelete(List<Map<String, Object>> list);
	
	void batchUpdate(List<Map<String, Object>> list);
}
