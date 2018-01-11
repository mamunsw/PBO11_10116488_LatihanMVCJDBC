/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mamun.latihanmvcjdbc.main;

import edu.mamun.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.mamun.latihanmvcjdbc.entity.Pelanggan;
import edu.mamun.latihanmvcjdbc.error.PelangganException;
import edu.mamun.latihanmvcjdbc.service.PelangganDao;
import edu.mamun.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author MSW98
 */
/**
 Nama : Ma'mun Basyari
 Kelas : IF-11
 NIM : 10116488
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }
}
