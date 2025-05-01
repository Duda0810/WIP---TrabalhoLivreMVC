/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoMVC.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import trabalhoMVC.database.Conect;

/**
 *
 * @author MARIAEDUARDACOSTABAT
 */import java.sql.*;
import java.util.ArrayList;
import trabalhoMVC.model.EntryDaily;

public class DailyDAO {

  /*  public List<entrydiary> listentry(String usuario) {
        List<entrydiary> list = new ArrayList<>();
        String sql = "SELECT id, texto, data FROM entradas_diario WHERE usuario = ? ORDER BY data DESC";

        try (Connection conn = Conect.getConect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                entrydiary entry = new entrydiary();
                entry.setId(rs.getInt("id"));
                entry.setText(rs.getString("text"));
                entry.setDate(rs.getTimestamp("date"));
                list.add(entry);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }*/

    public void deletarEntrada(int id) {
        String sql = "DELETE FROM entradas_diario WHERE id = ?";

        try (Connection conn = Conect.getConect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarEntrada(int id, String novoTexto) {
        String sql = "UPDATE entradas_diario SET texto = ? WHERE id = ?";

        try (Connection conn = Conect.getConect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoTexto);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String carregarDiario(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
