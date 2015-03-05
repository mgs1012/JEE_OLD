package es.miw.upm.persistance.models.dao.jpa;

import java.util.logging.LogManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.miw.upm.persistence.models.daos.CategoryDao;
import es.miw.upm.persistence.models.daos.DaoFactory;
import es.miw.upm.persistence.models.daos.TemaDao;
import es.miw.upm.persistence.models.daos.VotoDao;

public class DaoJpaFactory extends DaoFactory {
    private static final String PERSISTENCE_UNIT = "tictactoe";

    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory(PERSISTENCE_UNIT);

    public DaoJpaFactory() {
        LogManager.getLogger(DaoJpaFactory.class).debug("create Entity Manager Factory");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
/*
    @Override
    public UserDao getUserDao() {
        return new UserDaoJpa();
    }

    @Override
    public CategoryDao getCategoryDao() {
        return new CategoryDaoJpa();
    }

    @Override
    public BoatDao getBoatDao() {
        return new BoatDaoJpa();
    }

    @Override
    public VehicleDao getVehicleDao() {
        return new VehicleDaoJpa();
    }

    @Override
    public PhoneDao getPhoneDao() {
        return new PhoneDaoJpa();
    }
*/
}
