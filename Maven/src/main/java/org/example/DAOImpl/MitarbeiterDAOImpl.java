package org.example.DAOImpl;

import org.example.interfaces.MitarbeiterDAO;
import org.example.klassen.Mitarbeiter;

import java.sql.SQLException;
import java.util.List;

public class MitarbeiterDAOImpl implements MitarbeiterDAO {
    @Override
    public Mitarbeiter get(int kuenstlerID) throws SQLException {
        return null;
    }

    @Override
    public List<Mitarbeiter> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Mitarbeiter mitarbeiter) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Mitarbeiter mitarbeiter) throws SQLException {
        return 0;
    }

    @Override
    public int update(Mitarbeiter mitarbeiter) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Mitarbeiter mitarbeiter) throws SQLException {
        return 0;
    }
}
