package monitor;

public abstract class CabinaDeProba {
	public int contor = 0;
	
	public abstract boolean intra(int client);	
	public abstract void iese();
	
	public boolean esteOcupata() throws RuntimeException {
		if(contor == 1)
			return true;
		if(contor == 0)
			return false;
		if(contor < 0 || contor > 1)
			throw new RuntimeException();
		return false;
	}
}
