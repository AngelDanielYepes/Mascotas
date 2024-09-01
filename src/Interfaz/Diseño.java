
package Interfaz;
import clase.ComidaHumeda;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Diseño extends javax.swing.JFrame {
    
    public Diseño() {
        initComponents();
    }
    private String tipos, nombre, forma;
    private Long cantidad;
    private int i = 1;
    private int a = 1;
    private int e = 1;
    private ArrayList <ComidaHumeda>listas= new ArrayList<ComidaHumeda>();
    private ArrayList<String> listaId = new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bIngresar = new javax.swing.JButton();
        Tipo = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bConsultar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Articulo = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jtid = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaPersonas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bIngresar.setBackground(new java.awt.Color(102, 102, 255));
        bIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bIngresar.setForeground(new java.awt.Color(255, 255, 255));
        bIngresar.setText("Ingresar");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(bIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 100, 30));

        Tipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, 20));

        bModificar.setBackground(new java.awt.Color(153, 255, 153));
        bModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        jPanel1.add(bModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 100, 30));

        bConsultar.setBackground(new java.awt.Color(102, 255, 255));
        bConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bConsultar.setForeground(new java.awt.Color(0, 0, 255));
        bConsultar.setText("Consultar");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(bConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 100, 30));

        bEliminar.setBackground(new java.awt.Color(102, 255, 255));
        bEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(0, 0, 255));
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 100, 30));

        Reporte.setBackground(new java.awt.Color(102, 255, 255));
        Reporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reporte.setForeground(new java.awt.Color(0, 0, 255));
        Reporte.setText("Reporte");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("PET INVENTORY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 50));

        Articulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Articulo.setText("clase:");
        jPanel1.add(Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, -1));

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("id:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 30, -1));

        jtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtidFocusLost(evt);
            }
        });
        jtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidActionPerformed(evt);
            }
        });
        jtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtidKeyTyped(evt);
            }
        });
        jPanel1.add(jtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, -1));

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Precio.setText("Precio:");
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, -1));

        jtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPrecioFocusLost(evt);
            }
        });
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, -1));

        jtTablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Articulo", "id", "Precio", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jtTablaPersonas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 620, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/walking-7617043_640.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        if (jtid.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén llenos antes de continuar", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    
    if (jtid.getText().length() != 5) {
       
        JOptionPane.showMessageDialog(null, "Debe ingresar exactamente 5 números en el campo de ID", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
   
        String nombres, id, tipo;
        long Precio;
        
        
        try{
            nombres = nombre;
            id = jtid.getText();
            Precio = Long.parseLong(jtPrecio.getText());
            tipo = tipos;
            if(listaId.contains(id)){
                
                JOptionPane.showMessageDialog(null, "El id " + id + " ya existe.", "salida", 1);
                
            }else{
                do {
                    try{
                    cantidad = Long.parseLong(JOptionPane.showInputDialog(null, "Por favorla cantidad del producto", "Salida", JOptionPane.PLAIN_MESSAGE));
                    }catch(Exception e){JOptionPane.showMessageDialog(null, "Ingrese numeros positivos", "Error", JOptionPane.ERROR_MESSAGE);}
                    if (cantidad < 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese numeros positivos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (cantidad < 0);
                if(Tipo.getText() == "Humeda" ){
                    do {
                        String[] opciones = {"Lata", "salchicha","sopa"};
        
                        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
                        if (op == null || op.equals("Salir")) {
                            return; 
                        }
                        switch (op) {

                            case "Lata":

                                    forma = "Lata";
                                break;
                            case "salchicha":
                                    forma = "Salchicha";

                                break;
                            case "sopa":
                                    forma = "Sopa";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));
                    
                    listas.add(new ComidaHumeda(forma,cantidad,nombres,id,tipo,Precio));
                    VerRegistros();
                    listaId.add(id);
                    jtid.setText("");
                    Tipo.setText("");
                    jtPrecio.setText("");
                    
                }else if(Tipo.getText() == "Seca"){
                    do {
                        String[] opciones = {"Croquetas", "Galletas","Carne Seca"};
        
                        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
                        if (op == null || op.equals("Salir")) {
                            return; 
                        }
                        switch (op) {

                            case "Croquetas":

                                    forma = "Croquetas";
                                break;
                            case "Galletas":
                                    forma = "Galletas";

                                break;
                            case "CarneSeca":
                                    forma = "CarneSeca";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));
                    
                    listas.add(new ComidaHumeda(forma,cantidad,nombres,id,tipo,Precio));
                    VerRegistros();
                    listaId.add(id);
                    jtid.setText("");
                    Tipo.setText("");
                    jtPrecio.setText("");
                }else if(Tipo.getText()  == "Juguetes"){
                    do {
                        String[] opciones = {"Pelotas", "Huesos","Lasos"};
        
                        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
                        if (op == null || op.equals("Salir")) {
                            return; 
                        }
                        switch (op) {

                            case "Pelotas":

                                    forma = "Pelotas";
                                break;
                            case "Huesos":
                                    forma = "Huesos";

                                break;
                            case "Lasos":
                                    forma = "Lasos";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));
                    
                    listas.add(new ComidaHumeda(forma,cantidad,nombres,id,tipo,Precio));
                    VerRegistros();
                    listaId.add(id);
                    Tipo.setText("");
                    jtid.setText("");
                    jtPrecio.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese la clase", "salida", 1);
                }
            }
            
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Verificar campos", "salida", 1);}
    }//GEN-LAST:event_bIngresarActionPerformed

        private void VerRegistros() {
        
        String Matriz[][]=new String[listas.size()][4];
        for (int ie = 0; ie < listas.size(); ie++) {
            Matriz[ie][0]=listas.get(ie).getNombres();
            Matriz[ie][1]=listas.get(ie).getId();
            Matriz[ie][2]=listas.get(ie).getTipo();
            Matriz[ie][3]= Long.toString(listas.get(ie).getPrecio());
            
        }
        jtTablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            Matriz,
            new String [] {
                "Nombres", "id", "Tipo","Precio"
            }
        ));
    }

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
    try {
        int fila;
        ComidaHumeda auxiliar;
        String[] opciones = {"Nombre", "id", "Precio","Tipo"};
        
        
        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        
        
        if (op == null || op.equals("Salir")) {
            return; 
        }
        
        
        fila = jtTablaPersonas.getSelectedRow();
        auxiliar = listas.get(fila);
        
        
        switch (op) {
            case "Nombre":
                String nombre;
                do {
                    nombre = JOptionPane.showInputDialog(null, "Por favor ingrese el nuevo nombre", "Salida", JOptionPane.PLAIN_MESSAGE);

                    if (!nombre.matches("[a-zA-Z]+")) {
                        JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras. Por favor ingrese otro nombre.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!nombre.matches("[a-zA-Z]+")); 
                auxiliar.setNombres(nombre);
                break;
            case "id":
    
                String id;
                do {
                    id = JOptionPane.showInputDialog(null, "Por favor ingrese el nuevo número de ID (5 dígitos)", "Salida", JOptionPane.PLAIN_MESSAGE);
                    
                    if (id.length() != 5) {
                        JOptionPane.showMessageDialog(null, "El ID debe tener exactamente 5 numeros", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (!id.matches("[0-9]+")) {
                        JOptionPane.showMessageDialog(null, "El id solo debe contener numeros positivos. Por favor ingrese otro id.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }while (id.length()!= 5 | !(id.matches("[0-9]+")));

                if (listaId.contains(id)) {
                    JOptionPane.showMessageDialog(null, "El ID " + id + " ya existe. Por favor ingrese otro ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return; 
                }

                auxiliar.setId(id);
                break;
            case "Tipo":
                do{
                        String[] opcione = {"Seca", "Humeda","Juguetes"};
        
                        String ops = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opcione, opcione[0]);
                        if (ops == null || ops.equals("Salir")) {
                            return; 
                        }
                        switch (op) {

                            case "Seca":
                                tipos = "Seca";
                                break;
                                
                            case "Humeda":
                                tipos = "Humeda";
                                
                                break;
                            case "Juguetes":
                                tipos = "Juguetes";
                                
                                break;

                        }
                    } while (! tipos.matches("[a-zA-Z]+"));
                if(tipos == "Humeda" ){
                    do {
                        String[] opcione = {"Lata", "salchicha","sopa"};
        
                        String ope = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opcione, opcione[0]);
                        if (ope == null || ope.equals("Salir")) {
                            return; 
                        }
                        switch (ope) {

                            case "Lata":

                                    forma = "Lata";
                                break;
                            case "salchicha":
                                    forma = "Salchicha";

                                break;
                            case "sopa":
                                    forma = "Sopa";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));}
                else if(tipos == "Seca"){
                    do {
                        String[] opcione = {"Croquetas", "Galletas","Carne Seca"};
        
                        String ope = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opcione, opcione[0]);
                        if (ope == null || ope.equals("Salir")) {
                            return; 
                        }
                        switch (ope) {

                            case "Croquetas":

                                    forma = "Croquetas";
                                break;
                            case "Galletas":
                                    forma = "Galletas";

                                break;
                            case "CarneSeca":
                                    forma = "CarneSeca";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));}
                    else if(tipos  == "Juguetes"){
                    do {
                        String[] opcione = {"Pelotas", "Huesos","Lasos"};
        
                        String ope = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opcione, opcione[0]);
                        if (ope == null || ope.equals("Salir")) {
                            return; 
                        }
                        switch (ope) {

                            case "Pelotas":

                                    forma = "Pelotas";
                                break;
                            case "Huesos":
                                    forma = "Huesos";

                                break;
                            case "Lasos":
                                    forma = "Lasos";

                                break;

                        }
                    } while (!forma.matches("[a-zA-Z]+"));
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese la clase", "salida", 1);
                }
                
                auxiliar.setTipo(tipos);
                auxiliar.setForma(forma);
                break;

            case "Precio":
                try{
                long precio = Long.parseLong(JOptionPane.showInputDialog(null, "Por favor ingrese el nuevo precio", "Salida", JOptionPane.PLAIN_MESSAGE));
                if(precio > 0){
                auxiliar.setPrecio(precio);
                break;}else{JOptionPane.showMessageDialog(null, "Debe ingresar un numero positivos", "Error", JOptionPane.ERROR_MESSAGE);}
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        
        VerRegistros();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el producto", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
       try{
            int fila;
            fila = jtTablaPersonas.getSelectedRow();
            listas.remove(fila);
            VerRegistros();
            JOptionPane.showMessageDialog(null, "Se elimino la fila", "salida", 1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verificar campos", "salida", 1);
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        char Cel = evt.getKeyChar();
        if((Cel < '0' | Cel > '9') | (jtPrecio.getText().length()== 10)){
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtidKeyTyped
        char Cedu = evt.getKeyChar();
        if((Cedu < '0' | Cedu > '9') | (jtid.getText().length()== 5)){
            evt.consume();
        }
    }//GEN-LAST:event_jtidKeyTyped

    private void jtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtidFocusLost
        if(!(jtid.getText().length()== 5)){
        JOptionPane.showMessageDialog(null, "Debe ingresar 5 numeros", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtidFocusLost

    private void jtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioFocusLost
      
        
    }//GEN-LAST:event_jtPrecioFocusLost

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
       try{
           String[] opciones = {"Reporte General", "Reporte Secos","Reporte Humedos","Reporte Juguetes"};
        
            while (true) {
            String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

                if (op == null || op.equals("Salir")) {
                    break;
                }

                switch (op) {
                    case "Reporte General":
                        long capg = 0;
                        String nomg = "Nombre    / Id      / Precio    /Tipo";
                        for (ComidaHumeda persona : listas) {
                            
                            nomg = nomg + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo();
                            capg = capg + persona.getPrecio();
                        }
                        JOptionPane.showMessageDialog(null, nomg + "\n" + "Total de capital:  " + capg,"salida", 1);
                        break;
                    case "Reporte Secos":
                        long caps = 0;
                        String noms = "Nombre    / Id      / Precio    /Tipo    /Categoria";
                        
                        for (ComidaHumeda persona : listas) {
                            if(persona.getTipo()=="Seca"){
                                noms = noms + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma();                            caps = caps + persona.getPrecio();
                                caps = caps + persona.getPrecio();
                            }
                        }
                        JOptionPane.showMessageDialog(null, noms + "\n" + "Total de capital:  " + caps,"salida", 1);
                        break;
                    case "Reporte Humedos":
                        long caph = 0;
                        String nomh = "Nombre    / Id      / Precio    /Tipo    /Categoria";
                        for (ComidaHumeda persona : listas) {
                            if(persona.getTipo()=="Humeda"){
                                nomh = nomh + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma();
                                caph = caph + persona.getPrecio();
                            }
                        }
                        JOptionPane.showMessageDialog(null, nomh + "\n" + "Total de capital:  " + caph,"salida", 1);
                        break;
                    case "Reporte Juguetes":
                        long cap = 0;
                        String nom = "Nombre    / Id      / Precio    /Tipo    /Categoria";
                        for (ComidaHumeda persona : listas) {
                            if(persona.getTipo()=="Juguetes"){
                                nom = nom + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma();                            cap = cap + persona.getPrecio();
                                cap = cap + persona.getPrecio();
                            }
                        }
                        JOptionPane.showMessageDialog(null, nom + "\n" + "Total de capital:  " + cap,"salida", 1);
                        break;
                }
           }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verificar campos", "salida", 1);
        }
        
    }//GEN-LAST:event_ReporteActionPerformed

    private void jtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtidActionPerformed

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        try {
        String[] opciones = {"Nombre", "id", "Buscar por Secos", "Buscar por Humedos", "Buscar por Juguetes"};
        
        
        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        if (op == null || op.equals("Salir")) {
            return; 
        }
        switch (op) {
            case "Nombre":
                    String nombreBusqueda = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre que desea buscar", "Salida", 1);
                    boolean nomencontrado = false;
                    for (ComidaHumeda persona : listas) {
                    if (persona.getNombres().equals(nombreBusqueda)) {
                        JOptionPane.showMessageDialog(null, "Se encontró a: " + nombreBusqueda + ", " + persona.getId() + ", " + Long.toString(persona.getPrecio()), "Salida", JOptionPane.INFORMATION_MESSAGE);
                        nomencontrado = true;
                        break; 
                    }
                    }
                    if (!nomencontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ninguna persona con el nombre proporcionado.", "Salida", JOptionPane.WARNING_MESSAGE);
                    }
                break;
            case "id":
                    String idBusqueda = JOptionPane.showInputDialog(null, "Por favor ingrese el ID que desea buscar", "Salida", 1);
                    boolean encontrado = false;
                    for (ComidaHumeda persona : listas) {
                    if (persona.getId().equals(idBusqueda)) {
                    JOptionPane.showMessageDialog(null, "Se encontró a: " + persona.getNombres() +  ", "+ idBusqueda +  ", " + Long.toString(persona.getPrecio()), "Salida", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    break; 
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "No se encontró ninguna persona con el ID proporcionado.", "Salida", JOptionPane.WARNING_MESSAGE);
                    }
                break;
            case "Buscar por Secos":
                    
                    String noms = "Nombre    / Id      / Precio    /Tipo    /Categoria";

                    for (ComidaHumeda persona : listas) {
                        if(persona.getTipo()=="Seca"){
                            noms = noms + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma();                          
                            
                        }
                    }
                    JOptionPane.showMessageDialog(null, noms ,"salida", 1);
                    break;
            case "Buscar por Humedos":
                    String nomh = "Nombre    / Id      / Precio    /Tipo    /Categoria";
                    for (ComidaHumeda persona : listas) {
                        if(persona.getTipo()=="Humeda"){
                            nomh = nomh + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma();
                            
                        }
                    }
                    JOptionPane.showMessageDialog(null, nomh ,"salida", 1);
                    break;
            case "Buscar por Juguetes":
                    
                    String nom = "Nombre    / Id      / Precio    /Tipo    /Categoria";
                    for (ComidaHumeda persona : listas) {
                        if(persona.getTipo()=="Juguetes"){
                            nom = nom + " \n" + persona.getNombres()+"  /  "+persona.getId()+"  /  "+Long.toString(persona.getPrecio())+"  /  "+persona.getTipo()+"  /  "+persona.getForma(); 
                            
                        }
                    }
                    JOptionPane.showMessageDialog(null, nom ,"salida", 1);
                    break;
            
        }
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verificar campos", "salida", 1);
        }
    }//GEN-LAST:event_bConsultarActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        try {
        String[] opciones = {"Seca", "Humeda","Juguetes"};
        
        String op = (String) JOptionPane.showInputDialog(null, "Elija la modificacion deseada", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
        if (op == null || op.equals("Salir")) {
            return; 
        }
        switch (op) {
            
            case "Seca":
                
                    tipos = "Seca";
                    nombre = "Seca" + i;
                    i = i + 1;
                    Tipo.setText(tipos);
                break;
            case "Humeda":
                    tipos = "Humeda";
                    nombre = "Humeda" + a;
                    a = a + 1;
                    Tipo.setText(tipos);
                    
                break;
            case "Juguetes":
                    tipos = "Juguetes";
                    nombre = "Juguetes" + e;
                    e = e + 1;
                    Tipo.setText(tipos);
                    
                break;
            
        }
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verificar campos", "salida", 1);
        }
    }//GEN-LAST:event_TipoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Articulo;
    private javax.swing.JLabel Precio;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton Tipo;
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bModificar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtTablaPersonas;
    private javax.swing.JTextField jtid;
    // End of variables declaration//GEN-END:variables


}
