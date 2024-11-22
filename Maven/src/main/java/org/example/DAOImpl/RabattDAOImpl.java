package org.example.DAOImpl;

import org.example.interfaces.RabattDAO;
import org.example.klassen.Rabatt;

import java.sql.SQLException;
import java.util.List;

public class RabattDAOImpl implements RabattDAO {
    @Override
    public Rabatt get(int kuenstlerID) throws SQLException {
        return null;
    }

    @Override
    public List<Rabatt> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Rabatt rabatt) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Rabatt rabatt) throws SQLException {
        return 0;
    }

    @Override
    public int update(Rabatt rabatt) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Rabatt rabatt) throws SQLException {
        return 0;
    }
}
