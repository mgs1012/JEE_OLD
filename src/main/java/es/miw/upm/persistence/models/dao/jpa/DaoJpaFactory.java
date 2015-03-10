package es.miw.upm.persistence.models.dao.jpa;

import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;

import es.art83.persistence.models.daos.jdbc.CategoryDaoJdbc;
import es.art83.persistence.models.daos.jdbc.DaoJdbcFactory;
import es.art83.persistence.models.daos.jdbc.UserDaoJdbc;
import es.art83.persistence.models.entities.Category;
import es.art83.persistence.models.entities.User;
import es.miw.upm.persistence.models.daos.DaoFactory;
import es.miw.upm.persistence.models.daos.TemaDao;
import es.miw.upm.persistence.models.daos.VotoDao;

public class DaoJpaFactory extends DaoFactory {
    private static final String PERSISTENCE_UNIT = "Votaciones";

    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory(PERSISTENCE_UNIT);

    public DaoJpaFactory() {
        LogManager.getLogger(DaoJpaFactory.class).debug("create Entity Manager Factory");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

	@Override
	public TemaDao getTemaDao() {
		return new TemaDaoJpa();
	}

	@Override
	public VotoDao getVotoDao() {
		return new VotoDaoJpa();
	}

}
