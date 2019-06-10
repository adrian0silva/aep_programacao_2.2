package aep2bimestre2.repository;

import java.sql.Connection;
import java.util.List;

public interface BilheteAereoRepository {

	void inserir(Connection conn,BilheteAereo bilhete) throws Exception;
	List<BilheteAereo> obterTodos();
	void alterar(BilheteAereo bilhete);
	void excluir(Integer voo);
}
