package Ex003;

import java.sql.Date;

public abstract class Pessoa {
	
		String nome;
		Date dataNesc;
		Long cpf;
	
		public String nome() {
			return nome;
		}
		
		public void nome(String nome) {
			this.nome = nome;
		}
		
		public Date dataNesc() {
			return dataNesc;
		}
		
		public void nome(Date dataNesc) {
			this.dataNesc = dataNesc;
		}
		
		public Long cpf() {
			return cpf;
		}
		
		public void cpf(Long cpf) {
			this.cpf = cpf;
		}
		
}
