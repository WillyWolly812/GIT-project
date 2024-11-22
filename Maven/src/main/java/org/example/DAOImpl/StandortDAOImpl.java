package org.example.DAOImpl;

import org.example.interfaces.StandortDAO;
import org.example.klassen.Standort;

import java.sql.SQLException;
import java.util.List;

public class StandortDAOImpl implements StandortDAO {
    @Override
    public Standort get(int kuenstlerID) throws SQLException {
        return null;
    }

    @Override
    public List<Standort> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Standort standort) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Standort standort) throws SQLException {
        return 0;
    }

    @Override
    public int update(Standort standort) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Standort standort) throws SQLException {
        return 0;
    }
}
