/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcjdbc.event;

import mvcjdbc.entity.Pelanggan;
import mvcjdbc.model.PelangganModel;

/**
 *
 * NAMA : DIAN ARPIAN
 * NIM  : 10119916
 * KELAS: IF10K
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onUpdate(Pelanggan pelanggan);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
}
