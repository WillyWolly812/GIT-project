package org.example.DAOImpl;

import org.example.interfaces.PlzDAO;
import org.example.klassen.Plz;

import java.sql.SQLException;
import java.util.List;

public class PlzDAOImpl implements PlzDAO {
    @Override
    public Plz get(int kuenstlerID) throws SQLException {
        return null;
    }

    @Override
    public List<Plz> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Plz plz) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Plz plz) throws SQLException {
        return 0;
    }

    @Override
    public int update(Plz plz) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Plz plz) throws SQLException {
        return 0;
    }
}
