package org.example.DAOImpl;

import org.example.DatabaseConnection;
import org.example.interfaces.KuenstlerDAO;
import org.example.klassen.Kuenstler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class KuenstlerDAOImpl implements KuenstlerDAO {
    @Override
    public Kuenstler get(int kuenstlerID) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        Kuenstler kuenstler = null;
        String sql = "SELECT * FROM künstler";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, kuenstlerID);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int oid = rs.getInt("kuenstlerID");

        }
        return kuenstler;
    }

    @Override
    public List<Kuenstler> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Kuenstler kuenstler) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Kuenstler kuenstler) throws SQLException {
        return 0;
    }

    @Override
    public int update(Kuenstler kuenstler) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Kuenstler kuenstler) throws SQLException {
        return 0;
    }
}
