package es.miw.upm.persistence.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = VotoE.TABLE)
public class VotoE {

	    public static final String TABLE = "Voto";

	    public static final String ID = "ID";

	    @Id
	    @GeneratedValue
	    @Column(name = ID)
	    private Integer id;

	    public static final String IDENTIFICATION = "IDENTIFICATION";

	    @Column(name = IDENTIFICATION)
	    private String identification;

	    public static final String DESCRIPTION = "DESCRIPTION";

	    @Column(name = DESCRIPTION)
	    private String description;

	    public static final String USER_ID = "USER_ID";

	    @ManyToOne
	    @JoinColumn(name = USER_ID)
	    private User user;

	    public VotoE(String identification, String description) {
	        this.identification = identification;
	        this.description = description;
	    }

	    public Vehicle() {
	    }


}
