package mpai20dec;

import java.util.List;

public class AngajatRepository implements IRepository<Angajat>{
	public DataMapper dm;
	
	public AngajatRepository(DataMapper dm) {
		this.dm = dm;
	}

	@Override
	public void add(Angajat t) {
		dm.insertAngajat(t);
	}

	@Override
	public void update(Angajat t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Angajat t) {
		dm.deleteAngajat(t.id);
	}

	@Override
	public Angajat getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Angajat> get(String spec) {
		return dm.selectAngajatiByCondition(spec);
	}

	@Override
	public List<Angajat> getAll() {
		return dm.selectAngajati();
	}

}
