/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mamun.latihanmvcjdbc.event;

import edu.mamun.latihanmvcjdbc.entity.Pelanggan;
import edu.mamun.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author MSW98
 */
/**
 Nama : Ma'mun Basyari
 Kelas : IF-11
 NIM : 10116488
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();

}
