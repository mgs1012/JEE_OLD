package es.miw.upm.persistence.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.miw.upm.persistence.jpa.JpaFactory;
import es.miw.upm.persistence.jpa.Voto;
import es.miw.upm.persistence.models.utils.NivelEstudios;

public class Tema {
	
	@Id
    private Integer id;
	
    private String titulo;

    private String descripcion;
    
    private String pregunta;

    /*   @OneToMany(cascade = CascadeType.ALL, mappedBy = "tema")
    private List<Voto> votos;

    public Tema() {
        super();
    }

    public Tema(Integer id,String titulo, String descripcion, String pregunta) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.pregunta = pregunta;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
    
	 @Override
	    public String toString() {
	        return "Tema [Identificador :" + id + "\n" + "Título: "+ titulo + "\n" + "Descripcion :" + descripcion  + "\n"+ " Pregunta : " +  pregunta  + "\n"+ "Votos :" + votos + "]";
	    }

	 	public static void main(String[] args) {
	        JpaFactory.dropAndCreateTables();
	        EntityManager em = JpaFactory.getEntityManagerFactory().createEntityManager();
	        
	        //Definir los temas a crear.
	        Tema tema1 = new Tema(1, "Deporte", "Tema dedicado a toda actividad deportiva.", "¿?");
	        List<Voto> votos = new ArrayList<Voto>();
	        votos.add(new Voto(001, "138.100.152.01", NivelEstudios.MEDIOS, tema1));
	        votos.add(new Voto(002, "138.100.152.02", NivelEstudios.SUPERIORES, tema1));
	        tema1.setVotos(votos);
	        Tema tema2 = new Tema(2, "Danza", "Tema dedicado las artes de la danza, desde la técnica clásica y contemporánea, pasando por los bailes de salón, hasta los estilos más urbanos.");
	        Tema tema3 = new Tema(3, "Música", "Tema dedicado a la música.");
	        votos.add(new Voto(003, "138.100.152.03", NivelEstudios.BASICOS, tema3));
	        votos.add(new Voto(004, "138.100.152.04", NivelEstudios.DOCTORADO, tema3));
	        tema3.setVotos(votos);
	        
	        
	        // Crearlos utilizando los métodos del entity manager + commit!
	        em.getTransaction().begin();
	        em.persist(tema1);
	        em.persist(tema2);
	        em.persist(tema3);
	        
	        em.getTransaction().commit();
	        // find
	        System.out.println(em.find(Tema.class, 1));
	        System.out.println(em.find(Tema.class, 2));
	        System.out.println(em.find(Tema.class, 3));
	    }
*/
}
