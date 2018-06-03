import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import princetonPlainsboro.Specialite;
import princetonPlainsboro.Code;
import princetonPlainsboro.FicheDeSoins;
import princetonPlainsboro.Acte;
import princetonPlainsboro.DossierMedical;


public class IU2 extends javax.swing.JFrame {

    public IU2() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        FPrincipale = new javax.swing.JFrame();
        FPFichedeSoins = new javax.swing.JPanel();
        FPFichesBare = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        ListeFiches = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>(getFiches().toArray())
        ;
        OptTri = new javax.swing.JPanel();
        TriLabel = new javax.swing.JLabel();
        PatientButton = new javax.swing.JButton();
        MedecinButton = new javax.swing.JButton();
        NbActesButton = new javax.swing.JButton();
        DateButton = new javax.swing.JButton();
        CoutPannel = new javax.swing.JPanel();
        Cout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Id = new javax.swing.JPanel();
        Identifiant = new javax.swing.JLabel();
        DeconnexionButton = new javax.swing.JButton();
        Recherche = new javax.swing.JTextField();
        Logo = new javax.swing.JPanel()
        ;
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NewFicheSoins = new javax.swing.JDialog();
        DateLabel = new javax.swing.JLabel();
        DateField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PatientLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        MedecinLabel = new javax.swing.JLabel();
        SpecialiteM = new javax.swing.JLabel();
        ChoixSpe = new javax.swing.JComboBox<>();
        int i=0;
        Specialite[] spe= Specialite.values();
        while(i<spe.length){
            ChoixSpe.addItem(spe[i].toString());
            i++;
        }
        ;
        jSeparator5 = new javax.swing.JSeparator();
        AddActeButton = new javax.swing.JButton();
        ActeLabel = new javax.swing.JLabel();
        ListeActesFiche = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        FSValiderButton = new javax.swing.JButton();
        AddActeButton1 = new javax.swing.JButton();
        RechM = new javax.swing.JTextField();
        RechP = new javax.swing.JTextField();
        TriPatient = new javax.swing.JDialog();
        SelectP = new javax.swing.JLabel();
        ListeP = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        RechercheP = new javax.swing.JTextField();
        AfficherListeP = new javax.swing.JButton();
        TriMédecin = new javax.swing.JDialog();
        SelectM = new javax.swing.JLabel();
        ListeM = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        RechercheM = new javax.swing.JTextField();
        AfficherListeM = new javax.swing.JButton();
        TriDate = new javax.swing.JDialog();
        AfficherListeDate = new javax.swing.JButton();
        DateDu = new javax.swing.JLabel();
        DateDuField = new javax.swing.JTextField();
        DateAu = new javax.swing.JLabel();
        DateAuField = new javax.swing.JTextField();
        jCal1 = new com.toedter.calendar.JCalendar();
        CalButton1 = new javax.swing.JButton();
        TriNbActes = new javax.swing.JDialog();
        AfficherListeNbActes = new javax.swing.JButton();
        NbActesFiche = new javax.swing.JLabel();
        NbActesFicheField = new javax.swing.JTextField();
        NewActe = new javax.swing.JDialog();
        TypeActe = new javax.swing.JLabel();
        ChoixCodeActe = new javax.swing.JComboBox<>();

        int j=0;
        Code[] code= Code.values();
        while(j<code.length){
            ChoixCodeActe.addItem(code[j].toString());
            j++;
        }
        ;
        CodeActe = new javax.swing.JLabel();
        CoefActe = new javax.swing.JLabel();
        CoefActeField = new javax.swing.JTextField();
        ValiderActeButton = new javax.swing.JButton();
        ObservationsField = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        Observation = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Deconnect = new javax.swing.JDialog();
        MsgDec = new javax.swing.JLabel();
        OuiButtonD = new javax.swing.JButton();
        NonButtonD = new javax.swing.JButton();
        FichedeSoins = new javax.swing.JFrame();
        FSDate = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        PatientLabel1 = new javax.swing.JLabel();
        FSSexe = new javax.swing.JLabel();
        FSNomP = new javax.swing.JLabel();
        FSPrenomP = new javax.swing.JLabel();
        FSNSS = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        MedecinLabel1 = new javax.swing.JLabel();
        FSNomM = new javax.swing.JLabel();
        FSPrenomM = new javax.swing.JLabel();
        FSSpeM = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        ActeLabel1 = new javax.swing.JLabel();
        ListeActes = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        ModifFSButton = new javax.swing.JButton();
        NewPatient = new javax.swing.JDialog();
        PrenomP = new javax.swing.JLabel();
        PrenomPField = new javax.swing.JTextField();
        DateNais = new javax.swing.JLabel();
        DateNaisField = new javax.swing.JTextField();
        NSecuSoc = new javax.swing.JLabel();
        NSecuSocField = new javax.swing.JTextField();
        NomP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomPField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        NSecuSocField1 = new javax.swing.JTextField();
        NSecuSocField2 = new javax.swing.JTextField();
        NSecuSocField3 = new javax.swing.JTextField();
        DateNais1 = new javax.swing.JLabel();
        DateNaisField1 = new javax.swing.JTextField();
        PrenomP1 = new javax.swing.JLabel();
        PrenomPField1 = new javax.swing.JTextField();
        AfficherListeM1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        FPrincipale.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        FPrincipale.setTitle("NomDuLogiciel");
        FPrincipale.setMinimumSize(new java.awt.Dimension(900, 670));

        FPFichedeSoins.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setText("Fiches de Soin");

        jButton14.setText("+");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Croissant", "Décroissant" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FPFichesBareLayout = new javax.swing.GroupLayout(FPFichesBare);
        FPFichesBare.setLayout(FPFichesBareLayout);
        FPFichesBareLayout.setHorizontalGroup(
            FPFichesBareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FPFichesBareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap())
        );
        FPFichesBareLayout.setVerticalGroup(
            FPFichesBareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FPFichesBareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FPFichesBareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jButton14)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        ListeFiches.setViewportView(jList3);

        javax.swing.GroupLayout FPFichedeSoinsLayout = new javax.swing.GroupLayout(FPFichedeSoins);
        FPFichedeSoins.setLayout(FPFichedeSoinsLayout);
        FPFichedeSoinsLayout.setHorizontalGroup(
            FPFichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FPFichesBare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FPFichedeSoinsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListeFiches)
                .addContainerGap())
        );
        FPFichedeSoinsLayout.setVerticalGroup(
            FPFichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FPFichedeSoinsLayout.createSequentialGroup()
                .addComponent(FPFichesBare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListeFiches, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OptTri.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TriLabel.setText("Afficher les fiches par :");

        PatientButton.setText("Patient");
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        MedecinButton.setText("Médecin");
        MedecinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedecinButtonActionPerformed(evt);
            }
        });

        NbActesButton.setText("Nombre d'actes");
        NbActesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NbActesButtonActionPerformed(evt);
            }
        });

        DateButton.setText("Date");
        DateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptTriLayout = new javax.swing.GroupLayout(OptTri);
        OptTri.setLayout(OptTriLayout);
        OptTriLayout.setHorizontalGroup(
            OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptTriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TriLabel)
                    .addComponent(PatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MedecinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NbActesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OptTriLayout.setVerticalGroup(
            OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptTriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TriLabel)
                .addGap(18, 18, 18)
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientButton)
                    .addComponent(DateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedecinButton)
                    .addComponent(NbActesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CoutPannel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cout.setText("Coût");

        jLabel3.setText("Coût de la FS sélectionnée : " + jList3.getSelectedValue().coutTotal());

        javax.swing.GroupLayout CoutPannelLayout = new javax.swing.GroupLayout(CoutPannel);
        CoutPannel.setLayout(CoutPannelLayout);
        CoutPannelLayout.setHorizontalGroup(
            CoutPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoutPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CoutPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cout)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CoutPannelLayout.setVerticalGroup(
            CoutPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoutPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cout)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        Identifiant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Identifiant.setText("Identifiant");

        DeconnexionButton.setText("Déconexion");
        DeconnexionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IdLayout = new javax.swing.GroupLayout(Id);
        Id.setLayout(IdLayout);
        IdLayout.setHorizontalGroup(
            IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeconnexionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Identifiant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        IdLayout.setVerticalGroup(
            IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Identifiant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeconnexionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Recherche.setForeground(new java.awt.Color(204, 204, 204));
        Recherche.setText("Recherche...");
        Recherche.setToolTipText("");
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostologo.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jMenuBar.setToolTipText("");

        File.setText("File");

        jMenuItem1.setText("Imprimer");
        File.add(jMenuItem1);

        jMenuBar.add(File);

        Edit.setText("Edit");

        jMenu1.setText("Ajouter...");

        jMenuItem2.setText("Spécialité");
        jMenu1.add(jMenuItem2);

        Edit.add(jMenu1);

        jMenuBar.add(Edit);

        jMenu2.setText("Paramètres");
        jMenuBar.add(jMenu2);

        FPrincipale.setJMenuBar(jMenuBar);

        javax.swing.GroupLayout FPrincipaleLayout = new javax.swing.GroupLayout(FPrincipale.getContentPane());
        FPrincipale.getContentPane().setLayout(FPrincipaleLayout);
        FPrincipaleLayout.setHorizontalGroup(
            FPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FPrincipaleLayout.createSequentialGroup()
                .addComponent(FPFichedeSoins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Recherche, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CoutPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OptTri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        FPrincipaleLayout.setVerticalGroup(
            FPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FPrincipaleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FPFichedeSoins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FPrincipaleLayout.createSequentialGroup()
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(OptTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CoutPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        NewFicheSoins.setTitle("Nouvelle Fiche de Soin");
        NewFicheSoins.setFocusableWindowState(false);
        NewFicheSoins.setMinimumSize(new java.awt.Dimension(650, 550));
        NewFicheSoins.setPreferredSize(new java.awt.Dimension(650, 550));

        DateLabel.setText("Date :");

        DateField.setForeground(new java.awt.Color(204, 204, 204));
        DateField.setText("jj-mm-aa");
        DateField.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        DateField.setDoubleBuffered(true);
        DateField.setDragEnabled(true);
        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });

        PatientLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PatientLabel.setText("Patient");

        MedecinLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedecinLabel.setText("Médecin");

        SpecialiteM.setText("Spécialité :");

        ChoixSpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixSpeActionPerformed(evt);
            }
        });

        AddActeButton.setText("+");
        AddActeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActeButtonActionPerformed(evt);
            }
        });

        ActeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActeLabel.setText("Actes");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeActesFiche.setViewportView(jList1);

        FSValiderButton.setText("Valider");
        FSValiderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSValiderButtonActionPerformed(evt);
            }
        });

        AddActeButton1.setText("+");
        AddActeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActeButton1ActionPerformed(evt);
            }
        });

        RechM.setForeground(new java.awt.Color(204, 204, 204));
        RechM.setText("Recherche...");
        RechM.setToolTipText("");
        RechM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechMActionPerformed(evt);
            }
        });

        RechP.setForeground(new java.awt.Color(204, 204, 204));
        RechP.setText("Recherche... ");
        RechP.setToolTipText("");
        RechP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewFicheSoinsLayout = new javax.swing.GroupLayout(NewFicheSoins.getContentPane());
        NewFicheSoins.getContentPane().setLayout(NewFicheSoinsLayout);
        NewFicheSoinsLayout.setHorizontalGroup(
            NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewFicheSoinsLayout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(DateLabel)
                .addGap(18, 18, 18)
                .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jSeparator4)
                .addGap(77, 77, 77))
            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedecinLabel)
                            .addComponent(PatientLabel))
                        .addGap(18, 18, 18)
                        .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RechP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RechM, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(SpecialiteM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChoixSpe, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddActeButton1))
                    .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FSValiderButton)
                            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                                .addComponent(ActeLabel)
                                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AddActeButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewFicheSoinsLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(ListeActesFiche, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewFicheSoinsLayout.setVerticalGroup(
            NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PatientLabel)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddActeButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RechP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MedecinLabel)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialiteM)
                    .addComponent(ChoixSpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RechM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddActeButton)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ActeLabel))
                .addGap(18, 18, 18)
                .addComponent(ListeActesFiche, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(FSValiderButton)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        TriPatient.setTitle("Patient");
        TriPatient.setMinimumSize(new java.awt.Dimension(450, 340));

        SelectP.setText("Sélectionner un patient :");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeP.setViewportView(jList2);

        RechercheP.setForeground(new java.awt.Color(204, 204, 204));
        RechercheP.setText("Recherche...");
        RechercheP.setToolTipText("");
        RechercheP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchePActionPerformed(evt);
            }
        });

        AfficherListeP.setText("Afficher");
        AfficherListeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListePActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TriPatientLayout = new javax.swing.GroupLayout(TriPatient.getContentPane());
        TriPatient.getContentPane().setLayout(TriPatientLayout);
        TriPatientLayout.setHorizontalGroup(
            TriPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriPatientLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(TriPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectP)
                    .addGroup(TriPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AfficherListeP)
                        .addGroup(TriPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RechercheP, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(ListeP))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        TriPatientLayout.setVerticalGroup(
            TriPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriPatientLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(SelectP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RechercheP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListeP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AfficherListeP)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        TriMédecin.setTitle("Médecin");
        TriMédecin.setMaximumSize(new java.awt.Dimension(450, 340));
        TriMédecin.setMinimumSize(new java.awt.Dimension(450, 340));
        TriMédecin.setName("dialog3"); // NOI18N
        TriMédecin.setPreferredSize(new java.awt.Dimension(450, 340));

        SelectM.setText("Sélectionner un médecin :");

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeM.setViewportView(jList4);

        RechercheM.setForeground(new java.awt.Color(204, 204, 204));
        RechercheM.setText("Recherche...");
        RechercheM.setToolTipText("");
        RechercheM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheMActionPerformed(evt);
            }
        });

        AfficherListeM.setText("Afficher");
        AfficherListeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TriMédecinLayout = new javax.swing.GroupLayout(TriMédecin.getContentPane());
        TriMédecin.getContentPane().setLayout(TriMédecinLayout);
        TriMédecinLayout.setHorizontalGroup(
            TriMédecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriMédecinLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(TriMédecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectM)
                    .addGroup(TriMédecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AfficherListeM)
                        .addGroup(TriMédecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RechercheM, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(ListeM))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        TriMédecinLayout.setVerticalGroup(
            TriMédecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriMédecinLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(SelectM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RechercheM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListeM, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AfficherListeM)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        TriMédecin.getAccessibleContext().setAccessibleDescription("");

        TriDate.setTitle("Date");
        TriDate.setMinimumSize(new java.awt.Dimension(350, 300));

        AfficherListeDate.setText("Afficher");
        AfficherListeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeDateActionPerformed(evt);
            }
        });

        DateDu.setText("Du : ");

        DateDuField.setForeground(new java.awt.Color(204, 204, 204));
        DateDuField.setText("jj-mm-aa");
        DateDuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateDuFieldActionPerformed(evt);
            }
        });

        DateAu.setText("Au : ");

        DateAuField.setForeground(new java.awt.Color(204, 204, 204));
        DateAuField.setText("jj-mm-aa");

        jCal1.setMinimumSize(new java.awt.Dimension(350, 200));
        jCal1.setPreferredSize(new java.awt.Dimension(350, 200));

        CalButton1.setMinimumSize(new java.awt.Dimension(25, 25));
        CalButton1.setPreferredSize(new java.awt.Dimension(25, 25));
        CalButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TriDateLayout = new javax.swing.GroupLayout(TriDate.getContentPane());
        TriDate.getContentPane().setLayout(TriDateLayout);
        TriDateLayout.setHorizontalGroup(
            TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriDateLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AfficherListeDate)
                    .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(TriDateLayout.createSequentialGroup()
                            .addComponent(DateAu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DateAuField))
                        .addGroup(TriDateLayout.createSequentialGroup()
                            .addComponent(DateDu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DateDuField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(CalButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        TriDateLayout.setVerticalGroup(
            TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriDateLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TriDateLayout.createSequentialGroup()
                        .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DateDuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateDu))
                            .addComponent(CalButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateAuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateAu))
                        .addGap(45, 45, 45)
                        .addComponent(AfficherListeDate))
                    .addComponent(jCal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        CalButton1.getAccessibleContext().setAccessibleName("Calend1");

        TriNbActes.setTitle("Date");
        TriNbActes.setMinimumSize(new java.awt.Dimension(400, 250));

        AfficherListeNbActes.setText("Afficher");
        AfficherListeNbActes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeNbActesActionPerformed(evt);
            }
        });

        NbActesFiche.setText("Nombre d'actes par fiche de soins :");

        NbActesFicheField.setText("jTextField14");

        javax.swing.GroupLayout TriNbActesLayout = new javax.swing.GroupLayout(TriNbActes.getContentPane());
        TriNbActes.getContentPane().setLayout(TriNbActesLayout);
        TriNbActesLayout.setHorizontalGroup(
            TriNbActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriNbActesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(TriNbActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NbActesFicheField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NbActesFiche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriNbActesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AfficherListeNbActes)
                .addGap(125, 125, 125))
        );
        TriNbActesLayout.setVerticalGroup(
            TriNbActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriNbActesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(NbActesFiche)
                .addGap(18, 18, 18)
                .addComponent(NbActesFicheField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(AfficherListeNbActes)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        NewActe.setTitle("Acte de soin");
        NewActe.setMinimumSize(new java.awt.Dimension(600, 450));
        NewActe.setPreferredSize(new java.awt.Dimension(600, 450));

        TypeActe.setText("Type :");

        ChoixCodeActe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixCodeActeActionPerformed(evt);
            }
        });

        CodeActe.setText("Code :");

        CoefActe.setText("Coef :");

        ValiderActeButton.setText("Valider");
        ValiderActeButton.setToolTipText("");
        ValiderActeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActeButtonActionPerformed(evt);
            }
        });

        ObservationsField.setViewportView(jTextPane1);

        Observation.setText("Observations : ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Diagnostique", "Thérapeutique", "" }));

        javax.swing.GroupLayout NewActeLayout = new javax.swing.GroupLayout(NewActe.getContentPane());
        NewActe.getContentPane().setLayout(NewActeLayout);
        NewActeLayout.setHorizontalGroup(
            NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewActeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CoefActe)
                    .addComponent(TypeActe)
                    .addComponent(CodeActe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChoixCodeActe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObservationsField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewActeLayout.createSequentialGroup()
                .addContainerGap(505, Short.MAX_VALUE)
                .addComponent(ValiderActeButton)
                .addGap(30, 30, 30))
            .addGroup(NewActeLayout.createSequentialGroup()
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewActeLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CoefActeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 255, Short.MAX_VALUE)))
                    .addGroup(NewActeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Observation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewActeLayout.setVerticalGroup(
            NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewActeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChoixCodeActe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeActe))
                .addGap(23, 23, 23)
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoefActeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CoefActe))
                .addGap(24, 24, 24)
                .addGroup(NewActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeActe)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Observation)
                .addGap(18, 18, 18)
                .addComponent(ObservationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(ValiderActeButton)
                .addGap(25, 25, 25))
        );

        Deconnect.setTitle("Déconnexion");
        Deconnect.setMinimumSize(new java.awt.Dimension(400, 200));

        MsgDec.setText("Etes vous sûrs de vouloir vous déconnecter ?");

        OuiButtonD.setText("Oui");
        OuiButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OuiButtonDActionPerformed(evt);
            }
        });

        NonButtonD.setText("Non");
        NonButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NonButtonDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeconnectLayout = new javax.swing.GroupLayout(Deconnect.getContentPane());
        Deconnect.getContentPane().setLayout(DeconnectLayout);
        DeconnectLayout.setHorizontalGroup(
            DeconnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeconnectLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(DeconnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MsgDec)
                    .addGroup(DeconnectLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(OuiButtonD)
                        .addGap(48, 48, 48)
                        .addComponent(NonButtonD)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        DeconnectLayout.setVerticalGroup(
            DeconnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeconnectLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(MsgDec)
                .addGap(18, 18, 18)
                .addGroup(DeconnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OuiButtonD)
                    .addComponent(NonButtonD))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        FichedeSoins.setTitle("Fiche de soins");
        FichedeSoins.setMinimumSize(new java.awt.Dimension(520, 550));
        FichedeSoins.setPreferredSize(new java.awt.Dimension(520, 550));

        FSDate.setText("Date :");

        PatientLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PatientLabel1.setText("Patient");

        FSSexe.setText("Sexe :");

        FSNomP.setText("Nom :");

        FSPrenomP.setText("Prénom :");

        FSNSS.setText("N° de Sécurité Sociale :");

        MedecinLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedecinLabel1.setText("Médecin");

        FSNomM.setText("Nom :");

        FSPrenomM.setText("Prénom :");

        FSSpeM.setText("Spécialité :");

        ActeLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActeLabel1.setText("Actes");

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListeActes.setViewportView(jList5);

        ModifFSButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1rsz_1rsz_edit.png"))); // NOI18N

        javax.swing.GroupLayout FichedeSoinsLayout = new javax.swing.GroupLayout(FichedeSoins.getContentPane());
        FichedeSoins.getContentPane().setLayout(FichedeSoinsLayout);
        FichedeSoinsLayout.setHorizontalGroup(
            FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichedeSoinsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(MedecinLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FichedeSoinsLayout.createSequentialGroup()
                                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FSNomP, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(FSSexe, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FSPrenomM, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FSNomM, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(154, 154, 154)
                                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FSNSS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FSPrenomP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FSSpeM, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jSeparator7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FichedeSoinsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FSDate)
                        .addGap(45, 45, 45)
                        .addComponent(ModifFSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(PatientLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6)))
                .addGap(10, 10, 10))
            .addGroup(FichedeSoinsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ListeActes, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(ActeLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator8)
                        .addContainerGap())))
        );
        FichedeSoinsLayout.setVerticalGroup(
            FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichedeSoinsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FSDate)
                    .addComponent(ModifFSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PatientLabel1)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(FSNSS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FSPrenomP))
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(FSSexe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FSNomP)))
                .addGap(32, 32, 32)
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MedecinLabel1)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FSSpeM)
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addComponent(FSNomM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FSPrenomM)))
                .addGap(27, 27, 27)
                .addGroup(FichedeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActeLabel1)
                    .addGroup(FichedeSoinsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListeActes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        NewPatient.setTitle("Nouveau Patient");
        NewPatient.setMinimumSize(new java.awt.Dimension(700, 330));
        NewPatient.setPreferredSize(new java.awt.Dimension(700, 330));

        PrenomP.setText("Prénom : ");

        DateNais.setText("Date de Naissance :");

        NSecuSoc.setText("N° de Sécurité Sociale :");

        NomP.setText("Nom :");

        jLabel5.setText("Sexe :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F", "Autre" }));

        DateNais1.setText("Adresse : ");

        PrenomP1.setText("N° de tel  : ");

        AfficherListeM1.setText("Valider");
        AfficherListeM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeM1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewPatientLayout = new javax.swing.GroupLayout(NewPatient.getContentPane());
        NewPatient.getContentPane().setLayout(NewPatientLayout);
        NewPatientLayout.setHorizontalGroup(
            NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewPatientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AfficherListeM1))
                    .addGroup(NewPatientLayout.createSequentialGroup()
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrenomP)
                            .addComponent(NomP)
                            .addComponent(jLabel5)
                            .addComponent(PrenomP1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomPField)
                            .addComponent(PrenomPField)
                            .addComponent(PrenomPField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NSecuSoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateNais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateNais1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateNaisField1)
                            .addGroup(NewPatientLayout.createSequentialGroup()
                                .addComponent(NSecuSocField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DateNaisField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
        );
        NewPatientLayout.setVerticalGroup(
            NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NewPatientLayout.createSequentialGroup()
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomP)
                            .addComponent(NomPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrenomP)
                            .addComponent(PrenomPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NewPatientLayout.createSequentialGroup()
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateNais)
                            .addComponent(DateNaisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateNais1)
                            .addComponent(DateNaisField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NSecuSoc)
                        .addComponent(NSecuSocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrenomP1)
                        .addComponent(PrenomPField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(AfficherListeM1)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setMinimumSize(new java.awt.Dimension(480, 260));

        jLabel29.setText("Identifiant :");

        jLabel30.setText("Mot de passe : ");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton20.setText("Connexion");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostologo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField17)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    private void FSValiderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        NewFicheSoins.dispose();
    }                                               

    private void AddActeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        NewActe.setVisible(true);
    }                                             

    private void RecherchePActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void AfficherListePActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        TriPatient.dispose();
    }                                              

    private void RechercheMActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void AfficherListeMActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        TriMédecin.dispose();
    }                                              

    private void AfficherListeDateActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        TriDate.dispose();
    }                                                 

    private void AfficherListeNbActesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        TriNbActes.dispose();
    }                                                    

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        NewFicheSoins.setVisible(true);
    }                                         

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        TriPatient.setVisible(true);
    }                                             

    private void MedecinButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        TriMédecin.setVisible(true);
    }                                             

    private void NbActesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        TriNbActes.setVisible(true);
    }                                             

    private void DateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        TriDate.setVisible(true);
        TriDate.setSize(350,300);
        jCal1.setVisible(false);
    }                                          

    private void DeconnexionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        Deconnect.setVisible(true);
    }                                                 

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.setVisible(false);
        FPrincipale.setVisible(true);
    }                                         

    private void ChoixCodeActeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void ValiderActeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        NewActe.dispose();
        NewFicheSoins.setVisible(true);
    }                                                 

    private void OuiButtonDActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Deconnect.dispose();
        FPrincipale.dispose();
        this.setVisible(true);
    }                                          

    private void NonButtonDActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Deconnect.dispose();
    }                                          

    
    private void ChoixSpeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void CalButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        TriDate.setSize(700,340);
        jCal1.setVisible(true);
    }                                          

    private void DateDuFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:        
//        Récupérer la date
        String s = "" + evt;
        SimpleDateFormat d = new SimpleDateFormat(s);

    }                                           

    private void AddActeButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        NewPatient.setVisible(true);
    }                                              

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void AfficherListeM1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        NewPatient.dispose();
        NewFicheSoins.setVisible(true);
    }                                               

    private void RechMActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void RechPActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //            adapter la fiche à la ligne demandee
            //            String selectedItem = (String) jList3.getSelectedValue();
            FichedeSoins.setVisible(true);
        }
    }                                   



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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ActeLabel;
    private javax.swing.JLabel ActeLabel1;
    private javax.swing.JButton AddActeButton;
    private javax.swing.JButton AddActeButton1;
    private javax.swing.JButton AfficherListeDate;
    private javax.swing.JButton AfficherListeM;
    private javax.swing.JButton AfficherListeM1;
    private javax.swing.JButton AfficherListeNbActes;
    private javax.swing.JButton AfficherListeP;
    private javax.swing.JButton CalButton1;
    private javax.swing.JComboBox<String> ChoixCodeActe;
    private javax.swing.JComboBox<String> ChoixSpe;
    private javax.swing.JLabel CodeActe;
    private javax.swing.JLabel CoefActe;
    private javax.swing.JTextField CoefActeField;
    private javax.swing.JLabel Cout;
    private javax.swing.JPanel CoutPannel;
    private javax.swing.JLabel DateAu;
    private javax.swing.JTextField DateAuField;
    private javax.swing.JButton DateButton;
    private javax.swing.JLabel DateDu;
    private javax.swing.JTextField DateDuField;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DateNais;
    private javax.swing.JLabel DateNais1;
    private javax.swing.JTextField DateNaisField;
    private javax.swing.JTextField DateNaisField1;
    private javax.swing.JDialog Deconnect;
    private javax.swing.JButton DeconnexionButton;
    private javax.swing.JMenu Edit;
    private javax.swing.JPanel FPFichedeSoins;
    private javax.swing.JPanel FPFichesBare;
    private javax.swing.JFrame FPrincipale;
    private javax.swing.JLabel FSDate;
    private javax.swing.JLabel FSNSS;
    private javax.swing.JLabel FSNomM;
    private javax.swing.JLabel FSNomP;
    private javax.swing.JLabel FSPrenomM;
    private javax.swing.JLabel FSPrenomP;
    private javax.swing.JLabel FSSexe;
    private javax.swing.JLabel FSSpeM;
    private javax.swing.JButton FSValiderButton;
    private javax.swing.JFrame FichedeSoins;
    private javax.swing.JMenu File;
    private javax.swing.JPanel Id;
    private javax.swing.JLabel Identifiant;
    private javax.swing.JScrollPane ListeActes;
    private javax.swing.JScrollPane ListeActesFiche;
    private javax.swing.JScrollPane ListeFiches;
    private javax.swing.JScrollPane ListeM;
    private javax.swing.JScrollPane ListeP;
    private javax.swing.JPanel Logo;
    private javax.swing.JButton MedecinButton;
    private javax.swing.JLabel MedecinLabel;
    private javax.swing.JLabel MedecinLabel1;
    private javax.swing.JButton ModifFSButton;
    private javax.swing.JLabel MsgDec;
    private javax.swing.JLabel NSecuSoc;
    private javax.swing.JTextField NSecuSocField;
    private javax.swing.JTextField NSecuSocField1;
    private javax.swing.JTextField NSecuSocField2;
    private javax.swing.JTextField NSecuSocField3;
    private javax.swing.JButton NbActesButton;
    private javax.swing.JLabel NbActesFiche;
    private javax.swing.JTextField NbActesFicheField;
    private javax.swing.JDialog NewActe;
    private javax.swing.JDialog NewFicheSoins;
    private javax.swing.JDialog NewPatient;
    private javax.swing.JLabel NomP;
    private javax.swing.JTextField NomPField;
    private javax.swing.JButton NonButtonD;
    private javax.swing.JLabel Observation;
    private javax.swing.JScrollPane ObservationsField;
    private javax.swing.JPanel OptTri;
    private javax.swing.JButton OuiButtonD;
    private javax.swing.JButton PatientButton;
    private javax.swing.JLabel PatientLabel;
    private javax.swing.JLabel PatientLabel1;
    private javax.swing.JLabel PrenomP;
    private javax.swing.JLabel PrenomP1;
    private javax.swing.JTextField PrenomPField;
    private javax.swing.JTextField PrenomPField1;
    private javax.swing.JTextField RechM;
    private javax.swing.JTextField RechP;
    private javax.swing.JTextField Recherche;
    private javax.swing.JTextField RechercheM;
    private javax.swing.JTextField RechercheP;
    private javax.swing.JLabel SelectM;
    private javax.swing.JLabel SelectP;
    private javax.swing.JLabel SpecialiteM;
    private javax.swing.JDialog TriDate;
    private javax.swing.JLabel TriLabel;
    private javax.swing.JDialog TriMédecin;
    private javax.swing.JDialog TriNbActes;
    private javax.swing.JDialog TriPatient;
    private javax.swing.JLabel TypeActe;
    private javax.swing.JButton ValiderActeButton;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton20;
    private com.toedter.calendar.JCalendar jCal1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   


}
