package es.miw.upm.persistence.models.dao.jdbc;

import es.miw.upm.persistence.models.daos.DaoFactory;

public abstract interface DaoJdbcFactory{
	
    public static DaoFactory factory = null;

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public abstract TemaDaoJdbc getTemaDaoJdbc();

    public abstract VotoDaoJdbc getVotoDaoJdbc();


}
