/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mamun.latihanmvcjdbc.service;

import edu.mamun.latihanmvcjdbc.entity.Pelanggan;
import edu.mamun.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author MSW98
 */
/**
 Nama : Ma'mun Basyari
 Kelas : IF-11
 NIM : 10116488
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
