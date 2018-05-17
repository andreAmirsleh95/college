/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016 *
 * Name: Andre Amirsaleh and Nazmul Hossain
 * Date: Apr 1, 2016
 * Time: 4:22:51 PM *
 * Project: csci205_hw03
 * Package: hw3.view
 * File: MainView
 * Description: Primary GUI class (following MVC design pattern)
 * ****************************************
 */
package hw3.view;

import hw3.model.SampleSizeType;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

/**
 * Primary GUI class (following MVC design pattern)
 *
 * @author Andre Amirsaleh
 */
public class MainView extends javax.swing.JFrame {

    /* *************************************************************************
     * MANUALLY CREATED ATTRIBUTES (i.e. not created by GUI Builder):
     **************************************************************************/
    /**
     * The mage of the current <codeWaveForm</code>. Requires access to the
     * model, so it is not instantiated in the constructor but through a setter
     * method called by the Controller
     *
     * @author Andre Amirsaleh
     */
    private WaveFormComponent waveImage;

    // TODO: Consider getting rid of the following (manually added) attributes
    // Especially if the GUI is not going to display this info
    /**
     * Signal frequency
     *
     * @author Andre Amirsaleh
     */
    private float freq;

    /**
     * Sample rate
     *
     * @author Andre Amirsaleh
     */
    private float sampleRate;

    /**
     * Sample size type (8-bit or 16-bit)
     *
     * @author Andre Amirsaleh
     */
    private SampleSizeType sampleSizeType;

    /**
     * Length of the sound in seconds
     *
     * @author Andre Amirsaleh
     */
    private double lengthInSec;

    /**
     * Creates new form MainView
     *
     * @author Andre Amirsaleh
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public MainView() {
        this.freq = 440;
        this.sampleRate = 16000;
        this.lengthInSec = 1;
        this.sampleSizeType = SampleSizeType.EIGHT_BIT;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @author GENERATED CODE
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupFileMenu = new javax.swing.ButtonGroup();
        dialogBoxNew = new DialogBoxNew();
        fileChooser = new javax.swing.JFileChooser();
        btnGroupPlay = new javax.swing.ButtonGroup();
        playPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        zoomInButton = new javax.swing.JButton();
        zoomOutButton = new javax.swing.JButton();
        wavePanel = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fileMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemNew = new javax.swing.JMenuItem();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();

        dialogBoxNew.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogBoxNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout dialogBoxNewLayout = new javax.swing.GroupLayout(dialogBoxNew.getContentPane());
        dialogBoxNew.getContentPane().setLayout(dialogBoxNewLayout);
        dialogBoxNewLayout.setHorizontalGroup(
            dialogBoxNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogBoxNewLayout.setVerticalGroup(
            dialogBoxNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(getPreferredSize());

        playButton.setText("Play");

        zoomInButton.setText("Zoom In x 2");

        zoomOutButton.setText("Zoom Out x 2");

        javax.swing.GroupLayout playPanelLayout = new javax.swing.GroupLayout(playPanel);
        playPanel.setLayout(playPanelLayout);
        playPanelLayout.setHorizontalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playButton)
                .addGap(18, 18, 18)
                .addComponent(zoomInButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playPanelLayout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playPanelLayout.setVerticalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(zoomInButton)
                    .addComponent(zoomOutButton))
                .addContainerGap())
        );

        jLabel1.setText("0.0");

        jLabel2.setText("200");

        jLabel3.setText("-200");

        jLabel4.setText("y = amplitude X 500");

        jLabel5.setText("x = time");

        jLabel6.setText("0.0");

        jLabel7.setText("10^6");

        fileMenu.setText("File");

        menuItemNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.META_MASK));
        menuItemNew.setText("New");
        menuItemNew.setToolTipText("Generate a pure tone");
        fileMenu.add(menuItemNew);

        menuItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_MASK));
        menuItemOpen.setText("Open");
        fileMenu.add(menuItemOpen);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_MASK));
        menuItemExit.setText("Exit");
        fileMenu.add(menuItemExit);

        fileMenuBar.add(fileMenu);

        setJMenuBar(fileMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addComponent(wavePanel))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(wavePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     *
     * @author GENERATED CODE
     */
    @SuppressWarnings({"Convert2Lambda", "CallToPrintStackTrace"})
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    /* *************************************************************************
     * METHODS TO ADD LISTENERS TO BUTTONS:
     **************************************************************************/
    /**
     * Adds an <code>ActionListener</code> to the <code>zoomInButton</code>
     * attribute so that the <code>waveImage</code> (attribute) zooms in when
     * <code>zoomInButton</code> is clicked
     *
     * @param zoomInListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>zoomInButton</code>
     * @author Andre Amirsaleh
     */
    public void addZoomInListener(ActionListener zoomInListener) {
        zoomInButton.addActionListener(zoomInListener);
    }

    /**
     * Adds an <code>ActionListener</code> to the <code>zoomOutButton</code>
     * attribute so that the <code>waveImage</code> (attribute) zooms out when
     * <code>zoomOutButton</code> is clicked
     *
     * @param zoomOutListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>zoomOutButton</code>
     * @author Andre Amirsaleh
     */
    public void addZoomOutListener(ActionListener zoomOutListener) {
        zoomOutButton.addActionListener(zoomOutListener);
    }

    /**
     * Adds an <code>ActionListener</code> to the <code>playButton</code>
     * attribute so that the sound file plays when <code>playButton</code> is
     * clicked
     *
     * @param playListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>playButton</code>
     * @author Andre Amirsaleh
     */
    public void addPlayListener(ActionListener playListener) {
        playButton.addActionListener(playListener);
    }

    /**
     * Adds an <code>ActionListener</code> to the <code>menuItemNew</code>
     * attribute so that a <code>JDialogBox</code> can open when
     * <code>menuItemNew</code> is clicked
     *
     * @param newListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>menuItemNew</code>
     * @author Andre Amirsaleh
     */
    public void addNewListener(ActionListener newListener) {
        menuItemNew.addActionListener(newListener);
    }

    /**
     * Adds an <code>ActionListener</code> to the <code>menuItemOpen</code>
     * attribute so that a <code>JFileChooser</code> can open when
     * <code>menuItemOpen</code> is clicked
     *
     * @param openListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>menuItemOpen</code>
     * @author Andre Amirsaleh
     */
    public void addOpenListener(ActionListener openListener) {
        menuItemOpen.addActionListener(openListener);
    }

    /**
     * Adds an <code>ActionListener</code> to the <code>menuItemExit</code>
     * attribute so that a <code>this</code> will close when
     * <code>menuItemExit</code> is clicked
     *
     * @param exitListener Handles the <code>ActionEvent</code> generated by
     * clicking <code>menuItemExit</code>
     * @author Andre Amirsaleh
     */
    public void addExitListener(ActionListener exitListener) {
        menuItemExit.addActionListener(exitListener);
    }

    /* *************************************************************************
     * GETTERS AND SETTERS:
     **************************************************************************/
    /**
     * Returns <code>freq</code> attribute
     *
     * @return Signal frequency
     * @author Andre Amirsaleh
     */
    public float getFreq() {
        return this.freq;
    }

    /**
     * Returns <code>sampleRate</code> attribute
     *
     * @return Sample rate
     * @author Andre Amirsaleh
     */
    public float getSampleRate() {
        return sampleRate;
    }

    /**
     * Returns <code>fileChooser</code> attribute
     *
     * @return File chooser for when the user clicks "Open" in the "File"
     * drop-down menu
     * @author Andre Amirsaleh
     */
    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    /**
     * Returns <code>sampleSizeType</code> attribute
     *
     * @return Sample size type (8-bit or 16-bit)
     * @author Andre Amirsaleh
     */
    public SampleSizeType getSampleSizeType() {
        return sampleSizeType;
    }

    /**
     * Returns <code>wavePanel</code> attribute
     *
     * @return panel that is designed to contain the image of the sound wave
     */
    public JScrollPane getWavePanel() {
        return wavePanel;
    }

    /**
     * Returns <code>lengthInSec</code> attribute
     *
     * @return Length of the sound in seconds
     * @author Andre Amirsaleh
     */
    public double getLengthInSec() {
        return lengthInSec;
    }

    /**
     * Returns <code>dialogBoxNew</code> attribute
     *
     * @return Dialog box (window) which pops up when user clicks "New" in the
     * "File" drop-down menu
     * @author Andre Amirsaleh
     */
    public JDialog getDialogBoxNew() {
        return dialogBoxNew;
    }

    /**
     * Sets the <code>freq</code> attribute
     *
     * @param freq Signal frequency of the sound
     * @author Andre Amirsaleh
     */
    public void setFreq(float freq) {
        this.freq = freq;
    }

    /**
     * Sets the <code>sampleRate</code> attribute
     *
     * @param sampleRate Sample rate of the sound
     * @author Andre Amirsaleh
     */
    public void setSampleRate(float sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sets the <code>sampleSizeType</code> attribute
     *
     * @param sampleSizeType Sample size (8-bit or 16-bit)
     * @author Andre Amirsaleh
     */
    public void setSampleSizeType(SampleSizeType sampleSizeType) {
        this.sampleSizeType = sampleSizeType;
    }

    /**
     * Sets the <code>lengthInSec</code> attribute
     *
     * @param lengthInSec Length of the sound in seconds
     * @author Andre Amirsaleh
     */
    public void setLengthInSec(double lengthInSec) {
        this.lengthInSec = lengthInSec;
    }

    /**
     * Returns the <code>fileMenu</code> attribute
     *
     * @return Drop-down menu under "File" button
     * @author Andre Amirsaleh
     */
    public JMenu getFileMenu() {
        return this.fileMenu;
    }

    /**
     * Returns the <code>menuItemExit</code> attribute
     *
     * @return "Exit" button in "File" drop-down menu
     * @author Andre Amirsaleh
     */
    public JMenuItem getMenuItemExit() {
        return this.menuItemExit;
    }

    /**
     * Returns <code>fileMenuBar</code> attribute
     *
     * @return Menu bar at the top of the main window (contains "File" button)
     * @author Andre Amirsaleh
     */
    public JMenuBar getFileMenuBar() {
        return this.fileMenuBar;
    }

    /**
     * Returns <code>menuItemNew</code> attribute
     *
     * @return "New" button in "File" drop-down menu
     * @author Andre Amirsaleh
     */
    public JMenuItem getMenuItemNew() {
        return this.menuItemNew;
    }

    /**
     * Returns <code>menuItemOpen</code> attribute
     *
     * @return "Open" button in "File" drop-down menu
     * @author Andre Amirsaleh
     */
    public JMenuItem getMenuItemOpen() {
        return this.menuItemOpen;
    }

    /**
     * Sets the <code>waveImage</code> attribute
     *
     * @param newWaveImage The new <code>waveImage</code> attribute
     * @author Andre Amirsaleh
     */
    public void setWaveImage(WaveFormComponent newWaveImage) {
        this.waveImage = newWaveImage;
        this.wavePanel.setViewportView(newWaveImage);
    }

    public WaveFormComponent getWaveImage() {
        return this.waveImage;
    }
    /* *************************************************************************
     * ATTRIBUTES GENERATED BY GUI BUILDER:
     **************************************************************************/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupFileMenu;
    private javax.swing.ButtonGroup btnGroupPlay;
    private javax.swing.JDialog dialogBoxNew;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar fileMenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemNew;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playPanel;
    private javax.swing.JScrollPane wavePanel;
    private javax.swing.JButton zoomInButton;
    private javax.swing.JButton zoomOutButton;
    // End of variables declaration//GEN-END:variables
}