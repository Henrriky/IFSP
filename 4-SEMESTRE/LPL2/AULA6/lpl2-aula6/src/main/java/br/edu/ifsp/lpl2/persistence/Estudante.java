package br.edu.ifsp.lpl2.persistence;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudante {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 120, nullable = false)
	private String nome;
	
	@Column()
	private Character sexo;
	
	@Column()
	private Boolean pcd;
	
	@Column(precision = 2, scale = 1)
	private BigDecimal ira;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getPcd() {
		return pcd;
	}
	public void setPcd(Boolean pcd) {
		this.pcd = pcd;
	}
	public BigDecimal getIra() {
		return ira;
	}
	public void setIra(BigDecimal ira) {
		this.ira = ira;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
