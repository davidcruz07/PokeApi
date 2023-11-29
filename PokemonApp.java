
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PokemonApp extends javax.swing.JFrame {

    public static final Logger LOGGER = ConfiguracionLogger.getLogger();
    private PokemonTipos pokemonTypes;

    public PokemonApp() {
        initComponents();
        PokemonTipos pokemonTipos = new PokemonTipos();
        String[] typesString = pokemonTipos.conectar();
          //typesString[18] = "";
          //typesString[19] = "";
        pokemonTipos = null;
        for (String type : typesString) {
            cbTipos.addItem(type);
        }
    }

    private DefaultListModel listaPokemon() throws IOException {
        DefaultListModel modelo = new DefaultListModel();
        String tipoSeleccionado = cbTipos.getSelectedItem().toString();
        pokemonTypes = new PokemonTipos(tipoSeleccionado);
        String[] pokemonDelTipo = pokemonTypes.listaPokemon();
        
        
        if (pokemonDelTipo != null && pokemonDelTipo.length > 0) {
            for (String pokemon : pokemonDelTipo) {
                modelo.addElement(pokemon);
            }
        } else {

        }
        pokemonDelTipo = null;
        return modelo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbilustracion = new javax.swing.JLabel();
        lbltexto = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lbltexto1 = new javax.swing.JLabel();
        lblDebilidad = new javax.swing.JLabel();
        lbltexto2 = new javax.swing.JLabel();
        lbltexto3 = new javax.swing.JLabel();
        lblAtaque = new javax.swing.JLabel();
        lblHabilidad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionHabilidad = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionAtaque = new javax.swing.JTextArea();
        salirButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pokemonList = new javax.swing.JList<>();
        cbTipos = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        lbilustracion.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbilustracion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbilustracion, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        lbltexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltexto.setText("Ataque:");

        lbNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTipo.setBackground(new java.awt.Color(255, 255, 255));
        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbltexto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltexto1.setText("Debilidad:");

        lblDebilidad.setBackground(new java.awt.Color(255, 255, 255));
        lblDebilidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbltexto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltexto2.setText("Tipo:");

        lbltexto3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltexto3.setText("Habilidad:");

        lblAtaque.setBackground(new java.awt.Color(255, 255, 255));
        lblAtaque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHabilidad.setBackground(new java.awt.Color(255, 255, 255));
        lblHabilidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        descripcionHabilidad.setColumns(20);
        descripcionHabilidad.setRows(5);
        descripcionHabilidad.setEnabled(false);
        jScrollPane2.setViewportView(descripcionHabilidad);

        descripcionAtaque.setColumns(20);
        descripcionAtaque.setFont(new java.awt.Font("STZhongsong", 1, 12)); // NOI18N
        descripcionAtaque.setRows(5);
        descripcionAtaque.setEnabled(false);
        jScrollPane3.setViewportView(descripcionAtaque);

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(salirButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbltexto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbltexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbltexto3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbltexto1)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDebilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirButton)
                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDebilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltexto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pokemonList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemonListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pokemonList);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNombre))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            pokemonList.setModel(listaPokemon());
            
        } catch (IOException ex) {
            LOGGER.severe("Error al buscar la informacion: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void pokemonListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemonListMouseClicked
        if (evt.getClickCount() == 2) {
            String nombrePokemon = pokemonList.getSelectedValue();
            if (!nombrePokemon.isEmpty()) {
                PokemonTipos pokemonInfo = new PokemonTipos(nombrePokemon);
                ArrayList<String> pokemon = pokemonInfo.infoPokemon();

                lbNombre.setText("" + pokemon.get(0));
                try {
                    String imageUrl = pokemon.get(1);
                    URL url = new URL(imageUrl);
                    BufferedImage image = ImageIO.read(url);
                    ImageIcon icon = new ImageIcon(image);
                    lbilustracion.setIcon(icon);
                } catch (IOException e) {
                    LOGGER.severe("Error al cargar la imagen: " + e.getMessage());
                }
                lblTipo.setText(pokemon.get(2));
                lblDebilidad.setText(pokemon.get(7));
                lblAtaque.setText(pokemon.get(5));
                descripcionAtaque.setText(pokemon.get(6));
                lblHabilidad.setText(pokemon.get(3));
                descripcionHabilidad.setText(pokemon.get(4));
            }
        }
    }//GEN-LAST:event_pokemonListMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try{
            
        
        
        String pokemonurl = PokemonTipos.getPokemonUrl();
        String opcion = (txtNombre.getText().toLowerCase()).trim();
        PokemonNombre pokemonName = new PokemonNombre(opcion, pokemonurl);
        pokemonName.run();
        ArrayList<String> pokemon = pokemonName.getPokemon();

        
        lbNombre.setText("" + pokemon.get(0));
        

        
        try {
            String imageUrl = pokemon.get(1);
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(image);
            lbilustracion.setIcon(icon);
        } catch (IOException e) {
            LOGGER.severe("Error al cargar la imagen: " + e.getMessage());
        }
        lblTipo.setText(pokemon.get(2));
        lblDebilidad.setText(pokemon.get(7));
        lblAtaque.setText(pokemon.get(5));
        descripcionAtaque.setText(pokemon.get(6));
        lblHabilidad.setText(pokemon.get(3));
        descripcionHabilidad.setText(pokemon.get(4));
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No se encontró el pokemon que buscaste. Ingresalo correctamente.");
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas salir?", 
                "Cerrar",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(respuesta == 0){
        
          System.exit(0);
        
        }
    }//GEN-LAST:event_salirButtonActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PokemonApp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cbTipos;
    private javax.swing.JTextArea descripcionAtaque;
    private javax.swing.JTextArea descripcionHabilidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbilustracion;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblDebilidad;
    private javax.swing.JLabel lblHabilidad;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lbltexto;
    private javax.swing.JLabel lbltexto1;
    private javax.swing.JLabel lbltexto2;
    private javax.swing.JLabel lbltexto3;
    private javax.swing.JList<String> pokemonList;
    private javax.swing.JButton salirButton;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
