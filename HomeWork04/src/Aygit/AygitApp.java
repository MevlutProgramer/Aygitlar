package Aygit;

public class AygitApp {

	public static void main(String[] args) {

		AygitMenager aym = new AygitMenager();

		FotografMakinesi fm = new FotografMakinesi();
		Laptop l = new Laptop();
		Telefon t = new Telefon();

		Kamera[] aygit = { fm, l, t };
		for (int i = 0; i < aygit.length; i++) {
			aygit[i].fotografCek();
			if (aygit[i] instanceof Telefon) {
				Telefon tel = (Telefon) aygit[i];
				tel.konus();
			}else if(aygit[i]instanceof Laptop) {
				Laptop lap=(Laptop)aygit[i];
			}

		}
	}

}
