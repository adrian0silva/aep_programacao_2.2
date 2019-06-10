package aep2bimestre2.repository;

import java.util.Date;

public class BilheteAereo {
	private Integer voo;
	private String origem;
	private String destino;
	private Date data;
	
	public BilheteAereo(Integer voo, String origem, String destino, Date data) {
		this.voo = voo;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
	}

	public Date getData() {
		return new Date();
	}
	public String getDestino() {
		return destino;
	}
	public String getOrigem() {
		return origem;
	}
	public Integer getVoo() {
		return voo;
	}


}
