package org.generation.demeterAPI.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_postagem" )
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date data_postagem = new java.sql.Date(System.currentTimeMillis());
	
	@NotBlank
	@Size(min = 4, max = 70)
	private String titulo;
	
	@NotBlank
	@Size(min = 4, max = 255)
	private String corpo;
	
	@NotBlank
	private String img_endereco;
	
	@ManyToOne 
	@JsonIgnoreProperties ("postagem")
	private List<Usuario> usuario;

}
