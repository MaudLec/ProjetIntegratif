package IU;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import princetonPlainsboro.*;


public class IU extends javax.swing.JFrame {

    private LectureXML test = new LectureXML("dossiers.xml");
    DossierMedical dossier = test.getDossier();
    Date date = null;
     ListeIdentification listeidentifiants = test.getListeIdentification();
    
    //maud
    FicheDeSoins ficheCourante = null;

    //personnes
    Medecin medecin = null;
    Patient patient = null;
    SecretaireMed secretaireMed = null;
    SecretaireAdmin secretaireAdmin = null;

    //infos des personnes
    String nom = "";
    String prenom = "";
    String id = "";
    String mdp = "";

    ListeIdentification listeid = test.getListeIdentification();

    //infos medecin
    Specialite specialite = null;
    String numTel = "";

    //infos patient
    Sexe sexe = null;
    Date naissance = null;

    //infos de l'adresse patient
    Adresse adresse = null;
    String rue = "";
    String codePostal = "";
    String ville = "";

    //infos du Numero de Securite Sociale
    NumSecu numSecu = null;
    int sexeSecu = 0;
    int anneeSecu = 0;
    int moisSecu = 0;
    int dep = 0;
    int comm = 0;
    int reg = 0;
    int cle = 0;

    //infos acte
    ArrayList<Acte> actes = new ArrayList<Acte>();
    int coef = 0;
    TypeActe typeActe = null;
    Code code = null;
    String obs = "";

    public IU() {
        initComponents();
    }

    public IU(DossierMedical dm) {
//        this.dm ;
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FPrincipale = new javax.swing.JFrame();
        FPFichedeSoins = new javax.swing.JPanel();
        FPFichesBare = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        ListeFiches = new javax.swing.JScrollPane();
        
        //maud
        for (index = 0; index < dossier.getFiches().size(); index++) {
            dlm.addElement(dossier.getFiches().get(index).toString());
        }
        jList3.setModel(dlm);
        
        
        ;
        OptTri = new javax.swing.JPanel();
        TriLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton5 = new javax.swing.JRadioButton();
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
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        TriPatient = new javax.swing.JDialog();
        SelectP = new javax.swing.JLabel();
        ListeP = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        DefaultListModel dlpatients = new DefaultListModel();
        for (int index = 0; index < dossier.getPatients().size(); index++) {
            dlpatients.addElement(dossier.getPatients().get(index).toString());
        }
        jList2.setModel(dlpatients)
        ;
        RechercheP = new javax.swing.JTextField();
        AfficherListeP = new javax.swing.JButton();
        TriMedecin = new javax.swing.JDialog();
        SelectM = new javax.swing.JLabel();
        ListeM = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        DefaultListModel dlmedecins = new DefaultListModel();
        for (int index = 0; index < dossier.getMedecins().size(); index++) {
            dlmedecins.addElement(dossier.getMedecins().get(index).toString());
        }
        jList4.setModel(dlmedecins);
        ;
        RechercheM = new javax.swing.JTextField();
        AfficherListeM = new javax.swing.JButton();
        TriDate = new javax.swing.JDialog();
        AfficherListeDate = new javax.swing.JButton();
        DateDu = new javax.swing.JLabel();
        DateAu = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        TriActes = new javax.swing.JDialog();
        AfficherListeNbActes = new javax.swing.JButton();
        NbActesFiche = new javax.swing.JLabel();
        ChoixCodeActe2 = new javax.swing.JComboBox<>();

        int j2=0;
        Code[] code2= Code.values();
        while(j2<code2.length){
            ChoixCodeActe2.addItem(code2[j2].toString());
            j2++;
        }
        ;
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
        FicheDeSoins = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        FSDate = new javax.swing.JLabel();
        ModifFSButton = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        PatientLabel1 = new javax.swing.JLabel();
        ActeLabel1 = new javax.swing.JLabel();
        FSSexe = new javax.swing.JLabel();
        ListeActes = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        //DefaultListModel dlma = new DefaultListModel();
        //for(int ind=0;ind<dossier.getFiches().size();ind++){
            //    for(int index=0; index<dossier.getFiche(ind).getActes().size(); index++)
            //    {
                //        dlma.addElement(dossier.getFiche(ind).getActe(index).toString());
                //    }
            //}
        //jList5.setModel(dlma)
        ;
        FSNomP = new javax.swing.JLabel();
        FSPrenomP = new javax.swing.JLabel();
        FSNSS = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        MedecinLabel1 = new javax.swing.JLabel();
        FSNomM = new javax.swing.JLabel();
        FSPrenomM = new javax.swing.JLabel();
        FSSpeM = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        SpecialiteM1 = new javax.swing.JLabel();
        ChoixSpe1 = new javax.swing.JComboBox<>();
        int l=0;
        while(l<spe.length){
            ChoixSpe1.addItem(spe[l].toString());
            l++;
        }
        ;
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        AddActeButton2 = new javax.swing.JButton();
        DateLabel1 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        ActeLabel3 = new javax.swing.JLabel();
        ListeActesFiche1 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        //DefaultListModel dlma2 = new DefaultListModel();
        //for(int ii=0; ii<1+dossier.getFiche(index).getActes().size(); ii++)
        //{
            //    dlma2.addElement(1+dossier.getFiche(index).getActe(ii).toString());
            //}
        //jList7.setModel(dlma2)
        ;
        jSeparator14 = new javax.swing.JSeparator();
        MedecinLabel3 = new javax.swing.JLabel();
        PatientLabel3 = new javax.swing.JLabel();
        FSValiderButton1 = new javax.swing.JButton();
        FSPrenomM2 = new javax.swing.JLabel();
        FSNomM2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        PrenomP2 = new javax.swing.JLabel();
        PrenomPField2 = new javax.swing.JTextField();
        DateNais2 = new javax.swing.JLabel();
        DateNaisField2 = new javax.swing.JTextField();
        NSecuSoc1 = new javax.swing.JLabel();
        NSecuSocField4 = new javax.swing.JTextField();
        NSecuSocField5 = new javax.swing.JTextField();
        DateNais3 = new javax.swing.JLabel();
        DateNaisField3 = new javax.swing.JTextField();
        PrenomP3 = new javax.swing.JLabel();
        PrenomPField3 = new javax.swing.JTextField();
        NSecuSocField6 = new javax.swing.JTextField();
        NSecuSocField7 = new javax.swing.JTextField();
        NomP1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NomPField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        NewPatient = new javax.swing.JDialog();
        PrenomP = new javax.swing.JLabel();
        PrenomPField = new javax.swing.JTextField();
        DateNais = new javax.swing.JLabel();
        NSecuSoc = new javax.swing.JLabel();
        NomP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomPField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        DateNais1 = new javax.swing.JLabel();
        DateNaisField1 = new javax.swing.JTextField();
        PrenomP1 = new javax.swing.JLabel();
        PrenomPField1 = new javax.swing.JTextField();
        AfficherListeM1 = new javax.swing.JButton();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        DescrActe = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        CodeActe1 = new javax.swing.JLabel();
        CoefActe1 = new javax.swing.JLabel();
        TypeActe1 = new javax.swing.JLabel();
        Observation1 = new javax.swing.JLabel();
        ModifFSButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ValiderActeButton1 = new javax.swing.JButton();
        ObservationsField1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        Observation2 = new javax.swing.JLabel();
        TypeActe2 = new javax.swing.JLabel();
        ChoixCodeActe1 = new javax.swing.JComboBox<>();

        int m=0;
        while(m<code.length){
            ChoixCodeActe1.addItem(code[m].toString());
            m++;
        }
        ;
        CodeActe2 = new javax.swing.JLabel();
        CoefActe2 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        CoefActeField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        ;
        TriSpecialite = new javax.swing.JDialog();
        SpecialiteM2 = new javax.swing.JLabel();
        ChoixSpe2 = new javax.swing.JComboBox<>();
        int i2=0;
        Specialite[] spe2= Specialite.values();
        while(i2<spe2.length){
            ChoixSpe2.addItem(spe2[i2].toString());
            i2++;
        }
        ;
        AfficherListeNbActes1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        
        //Julie
        //testid = jTextField17.getText().charAt(0);
        //if (testid == "1".charAt(0)){
            //    bmed = true;
            //    bsmed = false;
            //    bsad = false;
            //}
        //if (testid == "2".charAt(0)){
            //    bsmed = true;
            //    bmed = false;
            //    bsad = false;
            //}
        //if (testid == "3".charAt(0)){
            //    bsad = true;
            //    bsmed = false;
            //    bmed = false;
            //}
        
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setVisible(false);
        ;

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

        //maud
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Trier par", "Date croissante", "Date décroissante", "Ordre alphabétique patient", "Ordre alphabétique médecin", "Coût croissant"}));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("Afficher toutes les fiches");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FPFichesBareLayout = new javax.swing.GroupLayout(FPFichesBare);
        FPFichesBare.setLayout(FPFichesBareLayout);
        FPFichesBareLayout.setHorizontalGroup(
            FPFichesBareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FPFichesBareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        TriLabel.setText("Afficher les fiches pour un(e) :");

        jRadioButton1.setText("Patient");

        jRadioButton2.setText("Médecin");

        jRadioButton3.setText("Date");

        jRadioButton4.setText("Acte");

        jButton1.setText("Sélectionner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Spécialité");

        javax.swing.GroupLayout OptTriLayout = new javax.swing.GroupLayout(OptTri);
        OptTri.setLayout(OptTriLayout);
        OptTriLayout.setHorizontalGroup(
            OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptTriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(TriLabel)
                    .addGroup(OptTriLayout.createSequentialGroup()
                        .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        OptTriLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5});

        OptTriLayout.setVerticalGroup(
            OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptTriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TriLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OptTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        CoutPannel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        //maud
        Cout.setText("Coût total du patient : ");
        jLabel3.setText("Coût de la FS sélectionnée : " );
        
        
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
                .addContainerGap(116, Short.MAX_VALUE))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("hostologo.png"))); // NOI18N

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
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OptTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        DateLabel.setText("Date :");

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

        jFormattedTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField2.setText("jj/mm/aa");

        javax.swing.GroupLayout NewFicheSoinsLayout = new javax.swing.GroupLayout(NewFicheSoins.getContentPane());
        NewFicheSoins.getContentPane().setLayout(NewFicheSoinsLayout);
        NewFicheSoinsLayout.setHorizontalGroup(
            NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jSeparator4)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewFicheSoinsLayout.createSequentialGroup()
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                                .addComponent(MedecinLabel)
                                .addGap(18, 18, 18)
                                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RechP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RechM, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(SpecialiteM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChoixSpe, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                                    .addComponent(DateLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewFicheSoinsLayout.createSequentialGroup()
                                    .addComponent(PatientLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AddActeButton1)))))
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
                .addContainerGap(72, Short.MAX_VALUE))
        );
        NewFicheSoinsLayout.setVerticalGroup(
            NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewFicheSoinsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewFicheSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddActeButton1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientLabel))
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
                .addContainerGap(101, Short.MAX_VALUE))
        );

        TriPatient.setTitle("Patient");
        TriPatient.setMinimumSize(new java.awt.Dimension(450, 340));

        SelectP.setText("Sélectionner un patient :");

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

        TriMedecin.setTitle("Médecin");
        TriMedecin.setMaximumSize(new java.awt.Dimension(450, 340));
        TriMedecin.setMinimumSize(new java.awt.Dimension(450, 340));
        TriMedecin.setName("dialog3"); // NOI18N
        TriMedecin.setPreferredSize(new java.awt.Dimension(450, 340));

        SelectM.setText("Sélectionner un médecin :");

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

        javax.swing.GroupLayout TriMedecinLayout = new javax.swing.GroupLayout(TriMedecin.getContentPane());
        TriMedecin.getContentPane().setLayout(TriMedecinLayout);
        TriMedecinLayout.setHorizontalGroup(
            TriMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriMedecinLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(TriMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectM)
                    .addGroup(TriMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AfficherListeM)
                        .addGroup(TriMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RechercheM, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(ListeM))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        TriMedecinLayout.setVerticalGroup(
            TriMedecinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriMedecinLayout.createSequentialGroup()
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

        TriMedecin.getAccessibleContext().setAccessibleDescription("");

        TriDate.setTitle("Date");
        TriDate.setMinimumSize(new java.awt.Dimension(350, 300));
        TriDate.setPreferredSize(new java.awt.Dimension(350, 300));

        AfficherListeDate.setText("Afficher");
        AfficherListeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeDateActionPerformed(evt);
            }
        });

        DateDu.setText("Du : ");

        DateAu.setText("Au : ");

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(330, 220));

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(330, 220));

        javax.swing.GroupLayout TriDateLayout = new javax.swing.GroupLayout(TriDate.getContentPane());
        TriDate.getContentPane().setLayout(TriDateLayout);
        TriDateLayout.setHorizontalGroup(
            TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriDateLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TriDateLayout.createSequentialGroup()
                            .addComponent(DateAu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriDateLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(AfficherListeDate)))
                    .addGroup(TriDateLayout.createSequentialGroup()
                        .addComponent(DateDu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        TriDateLayout.setVerticalGroup(
            TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriDateLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateDu)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(TriDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateAu))
                .addGap(52, 52, 52)
                .addComponent(AfficherListeDate)
                .addGap(20, 20, 20))
        );

        TriActes.setTitle("Date");
        TriActes.setMinimumSize(new java.awt.Dimension(400, 250));

        AfficherListeNbActes.setText("Afficher");
        AfficherListeNbActes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeNbActesActionPerformed(evt);
            }
        });

        NbActesFiche.setText("Acte effectué :");

        ChoixCodeActe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixCodeActe2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TriActesLayout = new javax.swing.GroupLayout(TriActes.getContentPane());
        TriActes.getContentPane().setLayout(TriActesLayout);
        TriActesLayout.setHorizontalGroup(
            TriActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriActesLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(TriActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NbActesFiche)
                    .addGroup(TriActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriActesLayout.createSequentialGroup()
                            .addComponent(AfficherListeNbActes)
                            .addGap(125, 125, 125))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TriActesLayout.createSequentialGroup()
                            .addComponent(ChoixCodeActe2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))))
        );
        TriActesLayout.setVerticalGroup(
            TriActesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriActesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(NbActesFiche)
                .addGap(18, 18, 18)
                .addComponent(ChoixCodeActe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(AfficherListeNbActes)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        NewActe.setTitle("Acte de soin");
        NewActe.setMinimumSize(new java.awt.Dimension(600, 450));

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

        FicheDeSoins.setTitle("Fiche de soins");
        FicheDeSoins.setMinimumSize(new java.awt.Dimension(530, 570));

        FSDate.setText("Date :");

        ModifFSButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("rsz_1rsz_1rsz_edit.png"))); // NOI18N
        ModifFSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifFSButtonActionPerformed(evt);
            }
        });

        PatientLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PatientLabel1.setText("Patient");

        ActeLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActeLabel1.setText("Actes");

        FSSexe.setText("Sexe :");

        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        ListeActes.setViewportView(jList5);

        FSNomP.setText("Nom :");

        FSPrenomP.setText("Prénom :");

        FSNSS.setText("N° de Sécurité Sociale :");

        MedecinLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedecinLabel1.setText("Médecin");

        FSNomM.setText("Nom :");

        FSPrenomM.setText("Prénom :");

        FSSpeM.setText("Spécialité :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FSDate)
                        .addGap(70, 70, 70)
                        .addComponent(ModifFSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MedecinLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FSNomP, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(FSSexe, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FSPrenomM, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(FSNomM, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(154, 154, 154)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FSNSS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FSPrenomP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(FSSpeM)
                                        .addGap(1, 1, 1))))
                            .addComponent(jSeparator7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PatientLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ListeActes, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ActeLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator8)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FSDate)
                    .addComponent(ModifFSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PatientLabel1)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FSNSS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FSPrenomP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FSSexe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FSNomP)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MedecinLabel1)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FSNomM)
                    .addComponent(FSSpeM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FSPrenomM)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActeLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListeActes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jPanel2.setMinimumSize(new java.awt.Dimension(585, 570));
        jPanel2.setPreferredSize(new java.awt.Dimension(585, 570));

        SpecialiteM1.setText("Spécialité :");

        ChoixSpe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixSpe1ActionPerformed(evt);
            }
        });

        AddActeButton2.setText("+");
        AddActeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActeButton2ActionPerformed(evt);
            }
        });

        DateLabel1.setText("Date :");

        jFormattedTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField4.setText("jj/mm/aa");

        ActeLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ActeLabel3.setText("Actes");

        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        ListeActesFiche1.setViewportView(jList7);

        MedecinLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MedecinLabel3.setText("Médecin");

        PatientLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PatientLabel3.setText("Patient");

        FSValiderButton1.setText("Valider");
        FSValiderButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSValiderButton1ActionPerformed(evt);
            }
        });

        FSPrenomM2.setText("Prénom :");

        FSNomM2.setText("Nom :");

        PrenomP2.setText("Prénom : ");

        DateNais2.setText("Date de Naissance :");

        NSecuSoc1.setText("N° de Sécurité Sociale :");

        DateNais3.setText("Adresse : ");

        PrenomP3.setText("N° de tel  : ");

        NomP1.setText("Nom :");

        jLabel6.setText("Sexe :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F", "Autre" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FSPrenomM2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FSNomM2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SpecialiteM1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChoixSpe1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrenomP2)
                            .addComponent(NomP1)
                            .addComponent(jLabel6)
                            .addComponent(PrenomP3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomPField1)
                            .addComponent(PrenomPField2)
                            .addComponent(PrenomPField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NSecuSoc1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateNais2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateNais3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateNaisField3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NSecuSocField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NSecuSocField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DateNaisField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DateLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PatientLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedecinLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FSValiderButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ActeLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListeActesFiche1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddActeButton2)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel1))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomP1)
                            .addComponent(NomPField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrenomP2)
                            .addComponent(PrenomPField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateNais2)
                            .addComponent(DateNaisField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateNais3)
                            .addComponent(DateNaisField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NSecuSoc1)
                        .addComponent(NSecuSocField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NSecuSocField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrenomP3)
                        .addComponent(PrenomPField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MedecinLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FSNomM2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpecialiteM1)
                    .addComponent(ChoixSpe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FSPrenomM2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddActeButton2)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ActeLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListeActesFiche1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(FSValiderButton1)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout FicheDeSoinsLayout = new javax.swing.GroupLayout(FicheDeSoins.getContentPane());
        FicheDeSoins.getContentPane().setLayout(FicheDeSoinsLayout);
        FicheDeSoinsLayout.setHorizontalGroup(
            FicheDeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(FicheDeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FicheDeSoinsLayout.setVerticalGroup(
            FicheDeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FicheDeSoinsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NewPatient.setTitle("Nouveau Patient");
        NewPatient.setMinimumSize(new java.awt.Dimension(700, 330));

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

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##-##-##-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jFormattedTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField6.setText("jj/mm/aa");

        javax.swing.GroupLayout NewPatientLayout = new javax.swing.GroupLayout(NewPatient.getContentPane());
        NewPatient.getContentPane().setLayout(NewPatientLayout);
        NewPatientLayout.setHorizontalGroup(
            NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientLayout.createSequentialGroup()
                .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewPatientLayout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(AfficherListeM1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewPatientLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateNaisField1)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField6))))
                .addGap(96, 96, 96))
        );
        NewPatientLayout.setVerticalGroup(
            NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientLayout.createSequentialGroup()
                .addGap(60, 60, 60)
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
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateNais1)
                            .addComponent(DateNaisField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NSecuSoc)
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrenomP1)
                        .addComponent(PrenomPField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(AfficherListeM1)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        DescrActe.setMinimumSize(new java.awt.Dimension(450, 350));

        CodeActe1.setText("Code :");

        CoefActe1.setText("Coef :");

        TypeActe1.setText("Type :");

        Observation1.setText("Observations : ");

        ModifFSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("rsz_1rsz_1rsz_edit.png"))); // NOI18N
        ModifFSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifFSButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModifFSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CoefActe1)
                        .addComponent(TypeActe1)
                        .addComponent(CodeActe1))
                    .addComponent(Observation1))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ModifFSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(CodeActe1)
                .addGap(23, 23, 23)
                .addComponent(CoefActe1)
                .addGap(24, 24, 24)
                .addComponent(TypeActe1)
                .addGap(25, 25, 25)
                .addComponent(Observation1)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        ValiderActeButton1.setText("Valider");
        ValiderActeButton1.setToolTipText("");
        ValiderActeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActeButton1ActionPerformed(evt);
            }
        });

        ObservationsField1.setViewportView(jTextPane2);

        Observation2.setText("Observations : ");

        TypeActe2.setText("Type :");

        ChoixCodeActe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixCodeActe1ActionPerformed(evt);
            }
        });

        CodeActe2.setText("Code :");

        CoefActe2.setText("Coef :");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Diagnostique", "Thérapeutique", "" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CoefActe2)
                            .addComponent(TypeActe2)
                            .addComponent(CodeActe2))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CoefActeField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChoixCodeActe1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ValiderActeButton1)
                                    .addComponent(ObservationsField1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Observation2)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChoixCodeActe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeActe2))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoefActeField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CoefActe2))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeActe2)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Observation2)
                .addGap(18, 18, 18)
                .addComponent(ObservationsField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ValiderActeButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DescrActeLayout = new javax.swing.GroupLayout(DescrActe.getContentPane());
        DescrActe.getContentPane().setLayout(DescrActeLayout);
        DescrActeLayout.setHorizontalGroup(
            DescrActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DescrActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DescrActeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DescrActeLayout.setVerticalGroup(
            DescrActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DescrActeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DescrActeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TriSpecialite.setMinimumSize(new java.awt.Dimension(350, 250));
        TriSpecialite.setPreferredSize(new java.awt.Dimension(350, 250));

        SpecialiteM2.setText("Spécialité :");

        ChoixSpe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixSpe2ActionPerformed(evt);
            }
        });

        AfficherListeNbActes1.setText("Afficher");
        AfficherListeNbActes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherListeNbActes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TriSpecialiteLayout = new javax.swing.GroupLayout(TriSpecialite.getContentPane());
        TriSpecialite.getContentPane().setLayout(TriSpecialiteLayout);
        TriSpecialiteLayout.setHorizontalGroup(
            TriSpecialiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriSpecialiteLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(TriSpecialiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AfficherListeNbActes1)
                    .addGroup(TriSpecialiteLayout.createSequentialGroup()
                        .addComponent(SpecialiteM2)
                        .addGap(18, 18, 18)
                        .addComponent(ChoixSpe2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        TriSpecialiteLayout.setVerticalGroup(
            TriSpecialiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TriSpecialiteLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(TriSpecialiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialiteM2)
                    .addComponent(ChoixSpe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(AfficherListeNbActes1)
                .addContainerGap(167, Short.MAX_VALUE))
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

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jButton20.setText("Connexion");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("hostologo.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Identifiant ou Mot de passe incorrect");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void FSValiderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSValiderButtonActionPerformed
        // TODO add your handling code here:
        NewFicheSoins.dispose();
    }//GEN-LAST:event_FSValiderButtonActionPerformed

    private void AddActeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActeButtonActionPerformed
        // TODO add your handling code here:
        NewActe.setVisible(true);
    }//GEN-LAST:event_AddActeButtonActionPerformed

    private void RecherchePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecherchePActionPerformed

    private void AfficherListePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListePActionPerformed
        // TODO add your handling code here:
        Patient patientselectionne = dossier.getPatients().get(jList2.getSelectedIndex());
        DefaultListModel dlpt = new DefaultListModel();
        for (int index = 0; index < dossier.listeDossierPatient(patientselectionne).size(); index++) {
            dlpt.addElement(dossier.listeDossierPatient(patientselectionne).get(index).toString());
        }
        jList3.setModel(dlpt);
        ListeFiches.repaint();
        TriPatient.dispose();
    }//GEN-LAST:event_AfficherListePActionPerformed

    private void RechercheMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercheMActionPerformed

    private void AfficherListeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListeMActionPerformed
        // TODO add your handling code here:
        Medecin medecinselectionne = dossier.getMedecins().get(jList4.getSelectedIndex());
        DefaultListModel dlpm = new DefaultListModel();
        for (int index = 0; index < dossier.recupererListePatients(medecinselectionne).size(); index++) {
            dlpm.addElement(dossier.recupererListePatients(medecinselectionne).get(index).toString());
        }
        jList3.setModel(dlpm);
        ListeFiches.repaint();
        TriMedecin.dispose();
    }//GEN-LAST:event_AfficherListeMActionPerformed

    private void AfficherListeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListeDateActionPerformed
        // TODO add your handling code here:
        TriDate.dispose();
    }//GEN-LAST:event_AfficherListeDateActionPerformed

    private void AfficherListeNbActesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListeNbActesActionPerformed
        DefaultListModel dlps = new DefaultListModel();
        Code code = Code.values()[(ChoixCodeActe2.getSelectedIndex())];
        Acte acte = new Acte(code, 0, typeActe, "");
        if(dossier.listeFichesActe(acte).size()==0){
            dlps.addElement("Pas de fiches pour cet acte");
        }
        for (int index = 0; index <dossier.listeFichesActe(acte).size(); index++) {
            dlps.addElement(dossier.listeFichesActe(acte).get(index));
        }
        jList3.setModel(dlps);

        ListeFiches.repaint();
        TriActes.dispose();
    }//GEN-LAST:event_AfficherListeNbActesActionPerformed
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        NewFicheSoins.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    //maud
  private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        if (jComboBox4.getSelectedItem() == "Date croissante") {
            dossier.trierDatesCroissantes();
            DefaultListModel dlft = new DefaultListModel();
            for (int index = 0; index < dossier.getFiches().size(); index++) {
                dlft.addElement(dossier.getFiches().get(index).toString());
            }
            jList3.setModel(dlft);
            ListeFiches.repaint();
        }
        if (jComboBox4.getSelectedItem() == "Date décroissante") {
            dossier.trierDatesDecroissantes();
            DefaultListModel dlft = new DefaultListModel();
            for (int index = 0; index < dossier.getFiches().size(); index++) {
                dlft.addElement(dossier.getFiches().get(index).toString());
            }
            jList3.setModel(dlft);
            ListeFiches.repaint();
        }
        if (jComboBox4.getSelectedItem() == "Ordre alphabétique patient") {
            dossier.triFichesAlphabetiquePatientCroissant();
            DefaultListModel dlft = new DefaultListModel();
            for (int index = 0; index < dossier.getFiches().size(); index++) {
                dlft.addElement(dossier.getFiches().get(index).toString());
            }
            jList3.setModel(dlft);
            ListeFiches.repaint();
        }
        if (jComboBox4.getSelectedItem() == "Ordre alphabétique médecin") {
            dossier.triFichesAlphabetiqueMedecinCroissant();
            DefaultListModel dlft = new DefaultListModel();
            for (int index = 0; index < dossier.getFiches().size(); index++) {
                dlft.addElement(dossier.getFiches().get(index).toString());
            }
            jList3.setModel(dlft);
            ListeFiches.repaint();
        }
        if (jComboBox4.getSelectedItem() == "Coût croissant") {
            dossier.triCoutsOrdreCroissant();
            DefaultListModel dlft = new DefaultListModel();
            for (int index = 0; index < dossier.getFiches().size(); index++) {
                dlft.addElement(dossier.getFiches().get(index).toString());
            }
            jList3.setModel(dlft);
            ListeFiches.repaint();
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed


    private void DeconnexionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionButtonActionPerformed
        // TODO add your handling code here:
        Deconnect.setVisible(true);
    }//GEN-LAST:event_DeconnexionButtonActionPerformed

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercheActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    
    //maud
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String idd = jTextField17.getText();
        char[] mdpp = jPasswordField2.getPassword();
        String mdppp = "";
        for (int i = 0; i < mdpp.length; i++) {
            mdppp += mdpp[i];
        }
        int v = 0;
        boolean b = false;
        while (v < listeidentifiants.getListeId().size() && !b) {

            if (idd.equals(listeidentifiants.getListeId().get(v)) && mdppp.equals(listeidentifiants.getListeMdp().get(v))) {
                System.out.println("ok");
                this.setVisible(false);
                FPrincipale.setVisible(true);
                b = true;
            } else {
                v++;
                jLabel4.setVisible(true);
            }

        }
        // Affichage du nom du Médecin / Secrétaire
        boolean bbb= false;
        for (int iii = 0; iii < dossier.getMedecins().size(); iii++) {
            if (dossier.getMedecins().get(iii).getId().toString().equals(idd) && !bbb) { // la récup de l'id se fait pas
                Identifiant.setText(dossier.getMedecins().get(iii).toString());
                System.out.println("Nom changé");
                bbb= true;
                iii = dossier.getMedecins().size();
            }
            if (iii == dossier.getMedecins().size()&&!bbb) {
                Identifiant.setText("session inconnue");
                System.out.println("Nom non changé");
            }
        }

        jLabel4.setVisible(true);

    }

    private void ChoixCodeActeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixCodeActeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixCodeActeActionPerformed

    private void ValiderActeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActeButtonActionPerformed
        // TODO add your handling code here:
        NewActe.dispose();
        NewFicheSoins.setVisible(true);
    }//GEN-LAST:event_ValiderActeButtonActionPerformed

    private void OuiButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OuiButtonDActionPerformed
        // TODO add your handling code here:
        Deconnect.dispose();
        FPrincipale.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_OuiButtonDActionPerformed

    private void NonButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NonButtonDActionPerformed
        // TODO add your handling code here:
        Deconnect.dispose();
    }//GEN-LAST:event_NonButtonDActionPerformed


    private void ChoixSpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixSpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixSpeActionPerformed

    private void AddActeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActeButton1ActionPerformed
        // TODO add your handling code here:
        NewPatient.setVisible(true);
    }//GEN-LAST:event_AddActeButton1ActionPerformed

    private void AfficherListeM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListeM1ActionPerformed
        // TODO add your handling code here:
        NewPatient.dispose();
        NewFicheSoins.setVisible(true);
    }//GEN-LAST:event_AfficherListeM1ActionPerformed

    private void RechMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechMActionPerformed

    private void RechPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechPActionPerformed

    //maud
    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        // TODO add your handling code here:
        
//        //Julie
//        if (bsad){
//            ModifFSButton.setVisible(false);
//            FSNomP.setVisible(false);
//            FSPrenomP.setVisible(false);
//            FSNSS.setVisible(false);
//        }
        
        
        //maud
        if (evt.getClickCount() == 1) {
            jLabel3.setText("Coût de la FS sélectionnée : " + dossier.getFiche(jList3.getSelectedIndex()).coutTotal());
            Cout.setText("Coût total du patient : " + dossier.coutPatient(dossier.getFiche(jList3.getSelectedIndex()).getPatient()));

        }
        if (evt.getClickCount() == 2) {
            //            adapter la fiche à la ligne demandee
//            String selectedItem = (String) jList3.getSelectedValue();
//ici mettre en mémoire toutes les variables
            //maud + Julie (j'ai juste changé les labels qui étaient tous en "Nom :" et le num du méd)
            ficheCourante = dossier.getFiche(jList3.getSelectedIndex());
            FSDate.setText("Date :" + ficheCourante.getDate());
            FSSexe.setText("Sexe :" + ficheCourante.getPatient().getSexe());
            FSNomP.setText("Nom :" +ficheCourante.getPatient().getNom());
            FSPrenomP.setText("Prénom :" +ficheCourante.getPatient().getPrenom());
            FSNSS.setText("N° de Sécurité Sociale :" +ficheCourante.getPatient().getNumSecu());
            FSNomM.setText("Nom :" +ficheCourante.getMedecin().getNom());
            FSPrenomM.setText("Prénom :" +ficheCourante.getMedecin().getPrenom());
            FSSpeM.setText("Spécialité :" +ficheCourante.getMedecin().getSpecialite());
            //dateChooserCombo4.setText(ficheCourante.getDate().toString());
            jComboBox3.setSelectedItem(ficheCourante.getPatient().getSexe().toString());
            //dateChooserCombo6.setText(ficheCourante.getPatient().getNaissance());
            NomPField1.setText(ficheCourante.getPatient().getNom());
            PrenomPField2.setText(ficheCourante.getPatient().getPrenom());
            PrenomPField3.setText(ficheCourante.getMedecin().getTelephone());
            DateNaisField3.setText(ficheCourante.getPatient().getAdresse().toString());
            //jFormattedTextField7FSNSS.setText(ficheCourante.getPatient().getNumSecu().toString());
            jTextField1.setText(ficheCourante.getMedecin().getNom());
            jTextField2.setText(ficheCourante.getMedecin().getPrenom());
            ChoixSpe1.setSelectedItem(ficheCourante.getMedecin().getSpecialite().toString());

            FicheDeSoins.setVisible(true);
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_jList3MouseClicked
    private void ModifFSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifFSButtonActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        FicheDeSoins.setSize(600, 600);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_ModifFSButtonActionPerformed

    private void ChoixSpe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixSpe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixSpe1ActionPerformed

    private void AddActeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActeButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActeButton2ActionPerformed

    private void FSValiderButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSValiderButton1ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        FicheDeSoins.setSize(530, 570);
    }//GEN-LAST:event_FSValiderButton1ActionPerformed

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //            adapter l'acte à la ligne demandee
            //            String selectedItem = (String) jList5.getSelectedValue();
            DescrActe.setVisible(true);
            DescrActe.setSize(450, 350);
            jPanel3.setVisible(true);
            jPanel4.setVisible(false);
        }
    }//GEN-LAST:event_jList5MouseClicked

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        // TODO add your handling code here:
        jList5MouseClicked(evt);
    }//GEN-LAST:event_jList7MouseClicked

    private void ModifFSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifFSButton1ActionPerformed
        // TODO add your handling code here:
        DescrActe.setSize(600, 450);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
    }//GEN-LAST:event_ModifFSButton1ActionPerformed

    private void ValiderActeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActeButton1ActionPerformed
        // TODO add your handling code here:
        DescrActe.setSize(450, 350);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_ValiderActeButton1ActionPerformed

    private void ChoixCodeActe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixCodeActe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixCodeActe1ActionPerformed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String idd = jTextField17.getText();
        char[] mdpp = jPasswordField2.getPassword();
        String mdppp = "";
        for (int i = 0; i<mdpp.length; i++){
            mdppp+=mdpp[i];
        }
        int v = 0;
        boolean b = false;
        while (v < listeidentifiants.getListeId().size() && !b) {

            if (idd.equals(listeidentifiants.getListeId().get(v)) && mdppp.equals(listeidentifiants.getListeMdp().get(v))) {
                System.out.println("ok");
                this.setVisible(false);
                FPrincipale.setVisible(true);
                b = true;
            } else {
                v++;
                jLabel4.setVisible(true); 
            }

        }
        jLabel4.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()){
            TriPatient.setVisible(true);
        }
        if (jRadioButton2.isSelected()){
            TriMedecin.setVisible(true);
        }
        if (jRadioButton3.isSelected()){
            TriDate.setVisible(true);
        }
        if (jRadioButton4.isSelected()){
            TriActes.setVisible(true);
        }
        if (jRadioButton5.isSelected()){
            TriSpecialite.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jList3.setModel(dlm);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ChoixSpe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixSpe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixSpe2ActionPerformed

    private void AfficherListeNbActes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherListeNbActes1ActionPerformed
        DefaultListModel dlps = new DefaultListModel();
        Specialite spe = Specialite.getSpe(ChoixSpe2.getSelectedItem().toString());
        if(dossier.listeFichesSpe(spe).size()==0){
            dlps.addElement("Pas de fiches pour cette spécialité");
        }
        for (int index = 0; index <dossier.listeFichesSpe(spe).size(); index++) {
            dlps.addElement(dossier.listeFichesSpe(spe).get(index));
        }
        jList3.setModel(dlps);

        ListeFiches.repaint();
        TriSpecialite.dispose();

    }//GEN-LAST:event_AfficherListeNbActes1ActionPerformed

    private void ChoixCodeActe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixCodeActe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixCodeActe2ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActeLabel;
    private javax.swing.JLabel ActeLabel1;
    private javax.swing.JLabel ActeLabel3;
    private javax.swing.JButton AddActeButton;
    private javax.swing.JButton AddActeButton1;
    private javax.swing.JButton AddActeButton2;
    private javax.swing.JButton AfficherListeDate;
    private javax.swing.JButton AfficherListeM;
    private javax.swing.JButton AfficherListeM1;
    private javax.swing.JButton AfficherListeNbActes;
    private javax.swing.JButton AfficherListeNbActes1;
    private javax.swing.JButton AfficherListeP;
    private javax.swing.JComboBox<String> ChoixCodeActe;
    private javax.swing.JComboBox<String> ChoixCodeActe1;
    private javax.swing.JComboBox<String> ChoixCodeActe2;
    private javax.swing.JComboBox<String> ChoixSpe;
    private javax.swing.JComboBox<String> ChoixSpe1;
    private javax.swing.JComboBox<String> ChoixSpe2;
    private javax.swing.JLabel CodeActe;
    private javax.swing.JLabel CodeActe1;
    private javax.swing.JLabel CodeActe2;
    private javax.swing.JLabel CoefActe;
    private javax.swing.JLabel CoefActe1;
    private javax.swing.JLabel CoefActe2;
    private javax.swing.JTextField CoefActeField;
    private javax.swing.JTextField CoefActeField1;
    private javax.swing.JLabel Cout;
    private javax.swing.JPanel CoutPannel;
    private javax.swing.JLabel DateAu;
    private javax.swing.JLabel DateDu;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DateLabel1;
    private javax.swing.JLabel DateNais;
    private javax.swing.JLabel DateNais1;
    private javax.swing.JLabel DateNais2;
    private javax.swing.JLabel DateNais3;
    private javax.swing.JTextField DateNaisField1;
    private javax.swing.JTextField DateNaisField2;
    private javax.swing.JTextField DateNaisField3;
    private javax.swing.JDialog Deconnect;
    private javax.swing.JButton DeconnexionButton;
    private javax.swing.JDialog DescrActe;
    private javax.swing.JMenu Edit;
    private javax.swing.JPanel FPFichedeSoins;
    private javax.swing.JPanel FPFichesBare;
    private javax.swing.JFrame FPrincipale;
    private javax.swing.JLabel FSDate;
    private javax.swing.JLabel FSNSS;
    private javax.swing.JLabel FSNomM;
    private javax.swing.JLabel FSNomM2;
    private javax.swing.JLabel FSNomP;
    private javax.swing.JLabel FSPrenomM;
    private javax.swing.JLabel FSPrenomM2;
    private javax.swing.JLabel FSPrenomP;
    private javax.swing.JLabel FSSexe;
    private javax.swing.JLabel FSSpeM;
    private javax.swing.JButton FSValiderButton;
    private javax.swing.JButton FSValiderButton1;
    private javax.swing.JFrame FicheDeSoins;
    private javax.swing.JMenu File;
    private javax.swing.JPanel Id;
    private javax.swing.JLabel Identifiant;
    private javax.swing.JScrollPane ListeActes;
    private javax.swing.JScrollPane ListeActesFiche;
    private javax.swing.JScrollPane ListeActesFiche1;
    private javax.swing.JScrollPane ListeFiches;
    private javax.swing.JScrollPane ListeM;
    private javax.swing.JScrollPane ListeP;
    private javax.swing.JPanel Logo;
    private javax.swing.JLabel MedecinLabel;
    private javax.swing.JLabel MedecinLabel1;
    private javax.swing.JLabel MedecinLabel3;
    private javax.swing.JButton ModifFSButton;
    private javax.swing.JButton ModifFSButton1;
    private javax.swing.JLabel MsgDec;
    private javax.swing.JLabel NSecuSoc;
    private javax.swing.JLabel NSecuSoc1;
    private javax.swing.JTextField NSecuSocField4;
    private javax.swing.JTextField NSecuSocField5;
    private javax.swing.JTextField NSecuSocField6;
    private javax.swing.JTextField NSecuSocField7;
    private javax.swing.JLabel NbActesFiche;
    private javax.swing.JDialog NewActe;
    private javax.swing.JDialog NewFicheSoins;
    private javax.swing.JDialog NewPatient;
    private javax.swing.JLabel NomP;
    private javax.swing.JLabel NomP1;
    private javax.swing.JTextField NomPField;
    private javax.swing.JTextField NomPField1;
    private javax.swing.JButton NonButtonD;
    private javax.swing.JLabel Observation;
    private javax.swing.JLabel Observation1;
    private javax.swing.JLabel Observation2;
    private javax.swing.JScrollPane ObservationsField;
    private javax.swing.JScrollPane ObservationsField1;
    private javax.swing.JPanel OptTri;
    private javax.swing.JButton OuiButtonD;
    private javax.swing.JLabel PatientLabel;
    private javax.swing.JLabel PatientLabel1;
    private javax.swing.JLabel PatientLabel3;
    private javax.swing.JLabel PrenomP;
    private javax.swing.JLabel PrenomP1;
    private javax.swing.JLabel PrenomP2;
    private javax.swing.JLabel PrenomP3;
    private javax.swing.JTextField PrenomPField;
    private javax.swing.JTextField PrenomPField1;
    private javax.swing.JTextField PrenomPField2;
    private javax.swing.JTextField PrenomPField3;
    private javax.swing.JTextField RechM;
    private javax.swing.JTextField RechP;
    private javax.swing.JTextField Recherche;
    private javax.swing.JTextField RechercheM;
    private javax.swing.JTextField RechercheP;
    private javax.swing.JLabel SelectM;
    private javax.swing.JLabel SelectP;
    private javax.swing.JLabel SpecialiteM;
    private javax.swing.JLabel SpecialiteM1;
    private javax.swing.JLabel SpecialiteM2;
    private javax.swing.JDialog TriActes;
    private javax.swing.JDialog TriDate;
    private javax.swing.JLabel TriLabel;
    private javax.swing.JDialog TriMedecin;
    private javax.swing.JDialog TriPatient;
    private javax.swing.JDialog TriSpecialite;
    private javax.swing.JLabel TypeActe;
    private javax.swing.JLabel TypeActe1;
    private javax.swing.JLabel TypeActe2;
    private javax.swing.JButton ValiderActeButton;
    private javax.swing.JButton ValiderActeButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
    private int index;
    DefaultListModel dlm = new DefaultListModel();
    
    //Julie
    private boolean bmed = false;
    private boolean bsmed = false;
    private boolean bsad = false;
    private char testid ;
}
