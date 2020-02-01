package mpai20dec;

import java.util.List;

public interface IRepository<T> {
	public void add(T t);
	public void update(T t);
	public void remove(T t); //sau id
	public Angajat getById(int id);
	public List<T> get(String spec);
	public List<T> getAll();
}
