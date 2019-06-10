package aep2bimestre2.repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class BilheteAereoMemoria implements BilheteAereoRepository {
	List<BilheteAereo> bilhetes = new ArrayList<BilheteAereo>();

	public List<BilheteAereo> obterTodos() {
		return bilhetes;
	}

	public void alterar(BilheteAereo bilhete) {
		for (int contador = 0; contador <= bilhetes.size(); contador++) {
			if (bilhetes.get(contador).getVoo() == bilhete.getVoo()) {
				bilhetes.remove(contador);
				bilhetes.add(bilhete);
			}
		}
	}

	public void excluir(Integer voo) {
		for (int contador = 0; contador <= bilhetes.size(); contador++) {
			if (bilhetes.get(contador).getVoo() == voo) {
				bilhetes.remove(contador);
			}
		}
	}

	public void inserir(Connection conn, BilheteAereo bilhete) throws Exception {
		bilhetes.add(bilhete);
	}

}