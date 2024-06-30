package com.sm.controladores;

import com.sm.frm.Anuncio;
import com.sm.frm.mdlInicio;
import com.sm.utils.UIController;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.Icon;

public class CInicio {

    mdlInicio i;

    public CInicio(mdlInicio i) {
        this.i = i;
    }

    public void init() {
        i.table.fixTable(i.jScrollPane1);
        i.table.addRow(new Object[]{"1", "Mike Bhand", "mikebhand@gmail.com", "Beltraman", "12376*#", "25 Apr,2018"});
        cargarAnuncios();
//        Action.cargar(() -> {
//            GlassPanePopup.closePopupAll();
//        }, () -> {
//            Action.cargando150();
//        });
    }

    private void cargarAnuncios(){
        ArrayList<com.sm.modelo.Anuncio> listaAnuncios = com.sm.modelo.SystemConfig.DATA_ONLINE.getListaAnuncios();
        ArrayList<Component> panelAnuncios = new ArrayList<>();
        for (com.sm.modelo.Anuncio an : listaAnuncios) {
            Icon img = UIController.getIconURL(an.getUrlImagen());
            panelAnuncios.add(new Anuncio(img, an.getUrlPagina()));
        }
        i.slideCarrusel.initSlideshow(panelAnuncios);
    }

}
