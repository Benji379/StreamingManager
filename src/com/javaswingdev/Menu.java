package com.javaswingdev;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Menu extends JPanel {

    private int index = -1;
    private final List<EventMenuSelected> events = new ArrayList<>();

    public Menu() {
        init();
    }

    private void init() {
//        setBackground(Color.WHITE);
        setBackground(com.sm.modelo.SystemConfig.BACKGROUND1);
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);

        addTitle("PRINCIPAL");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Dashboard"));

        addTitle("WEB");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.MAIL_OUTLINE, "Correo"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.MESSAGE, "Chat"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERM_CONTACT_CALENDAR, "Calendario"));
        
        addTitle("HERRAMIENTAS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.WHATSHOT, "OpenBullet2", "Hits (VTR)", "ComboList", "Config"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DVR, "Vista", "Hits", "Cuentas"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.CARD_GIFTCARD, "BINs"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SHOP, "Venta"));

        addTitle("USUARIOS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PEOPLE, "Usuarios"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SEND, "Repartir", "Hits", "Cuentas"));

        addTitle("CONFIGURACION");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SETTINGS, "Configuracion"));
//        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.LOCK_OUTLINE, "Autenticacion"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.CONTACTS, "Contact"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.EXIT_TO_APP, "Salir"));
    }

    private JScrollPane createScroll() {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBar());
        return scroll;
    }

    private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }

    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++index, menuLayout);
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (EventMenuSelected event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem(ModelMenuItem menu) {
        panelMenu.add(createMenuItem(menu), "h 35!");
    }

    public void addTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(label.getFont().deriveFont(Font.BOLD));
//        label.setForeground(new Color(170, 170, 170));
        label.setForeground(new Color(255, 255, 255));
        panelMenu.add(label);
    }

    public void addSpace(int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    item.getItem().getMenuName();
                    break;
                }
            }
        }
    }

    public void clearSelected() {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public int cantMenus() {
        int canti = 0;
        for (Component com : panelMenu.getComponents()) {
            canti++;
        }
        return canti;
    }

    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
}
