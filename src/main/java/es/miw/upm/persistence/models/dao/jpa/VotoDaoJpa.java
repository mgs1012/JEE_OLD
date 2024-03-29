package es.miw.upm.persistence.models.dao.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import es.miw.upm.persistence.jpa.Tema;
import es.miw.upm.persistence.models.daos.VotoDao;
import es.miw.upm.persistence.models.entities.VotoE;
import es.miw.upm.persistence.models.utils.NivelEstudios;

public class VotoDaoJpa extends GenericDaoJpa<VotoE, Integer> implements VotoDao{

	@Id
    @GeneratedValue
    private Integer id;

    private String ip;

    private NivelEstudios nivelEstudios;

    @ManyToOne
    @JoinColumn
    private Tema tema;

    public Voto(Integer id, String ip, NivelEstudios nivelEstudios, Tema tema) {
        this.id = id;
        this.ip = ip;
        this.nivelEstudios = nivelEstudios;
        this.tema = tema; 
        
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public NivelEstudios getNivelEstudios() {
		return nivelEstudios;
	}

	public void setNivelEstudios(NivelEstudios nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Voto() {
    	
    }


}
