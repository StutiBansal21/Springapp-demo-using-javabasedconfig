package repository;

import java.util.List;

public interface Repository <T>{
	void save(T t);
	void delete(T t);
	void update(T t);
	List<T> getAll();
	//these r the crud operations create read update delete
}
