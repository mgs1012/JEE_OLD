package es.miw.upm.persistence.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.miw.upm.persistence.models.utils.NivelEstudios;

@Entity
@Table(name = VotoE.TABLE)
public class VotoE {

	    public static final String TABLE = "voto";

	    public static final String ID = "ID";

	    @Id
	    @GeneratedValue
	    @Column(name = ID)
	    private Integer id;

	    public static final String IP = "IP";

	    private String ip;
	    
	    public static final String NIVELESTUDIOS = "NIVELESTUDIOS";

	    @Enumerated(EnumType.STRING)
	    private NivelEstudios nivelEstudios;

	    public static final String TEMA = "TEMA";

	    // Relacion unidireccional: 1:0..n

	    @ManyToOne
	    @JoinColumn(name = TEMA)
	    private TemaE tema;

	    public VotoE(Integer id, String ip, NivelEstudios nivelEstudios, TemaE tema) {
	        this.id = id;
	        this.ip = ip;
	        this.nivelEstudios = nivelEstudios;
	        this.tema = tema; 
	    }

	    public VotoE() {
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

		public TemaE getTema() {
			return tema;
		}

		public void setTema(TemaE tema) {
			this.tema = tema;
		}


}
