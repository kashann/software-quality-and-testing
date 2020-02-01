package monitor;

public class CabinaProbaSimpla extends CabinaDeProba {

	@Override
	public boolean intra(int client) {
		if(!esteOcupata()) {
			contor++;
			return true;
		}
		return false;
	}

	@Override
	public void iese() {
		contor--;
	}
}
