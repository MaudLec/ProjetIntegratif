/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.*;
import java.awt.print.*;
import javax.swing.RepaintManager;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;

/**
 *
 * @author GSuz- Impression des JTextField
 */
public class Imprimer implements Printable {

    /**
     * Contenu du JTextField à imprimer
     */
    private Component print_component;

    /**
     * Appelle le constructeur de la classe et lance l'impression
     *
     * @param c prend en compte un component
     */
    public static void printComponent(Component c) {
        new Imprimer(c).doPrint();
    }

    /**
     * Initialise l'objet à imprimer
     *
     * @param comp prend en compte un component
     */
    public Imprimer(Component comp) {
        this.print_component = comp;
    }

    /**
     * Affiche la fenêtre pour le choix de l'imprimante
     */
    public void doPrint() {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        printJob.setPrintable(this);
        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException pe) {
                System.out.println("Error printing: " + pe);
            }
        }
    }

    /**
     *
     * @param g prend en compte un graphics
     * @param pageFormat prend en compte un PageFormat
     * @param pageIndex prend en compte un int
     * @return une page
     */
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        } else {
            Graphics2D g2d = (Graphics2D) g;

            /**
             * Coordonnées des bords de page
             */
            int x = (int) pageFormat.getImageableX();
            int y = (int) pageFormat.getImageableY();

            g2d.translate(x, y);
            disableDoubleBuffering(print_component);
            print_component.paint(g2d);
            enableDoubleBuffering(print_component);
            return PAGE_EXISTS;

        }
    }

    /**
     *
     * @param c prend en compte un component
     */
    public static void disableDoubleBuffering(Component c) {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(false);
    }

    /**
     *
     * @param c prend en compte un component
     */
    public static void enableDoubleBuffering(Component c) {
        RepaintManager currentManager = RepaintManager.currentManager(c);
        currentManager.setDoubleBufferingEnabled(true);

    }
}
