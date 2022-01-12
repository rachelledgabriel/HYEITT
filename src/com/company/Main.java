
package com.company;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTransparent = new javax.swing.JPanel();
        tabReservation = new javax.swing.JButton();
        tabCheckIn = new javax.swing.JButton();
        tabCheckOut = new javax.swing.JButton();
        tabGuestsProfile = new javax.swing.JButton();
        tabRoomMngt = new javax.swing.JButton();
        tabRevenue = new javax.swing.JButton();
        tabServices = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblRooms = new javax.swing.JLabel();
        lblAmenities = new javax.swing.JLabel();
        lblDestinations = new javax.swing.JLabel();
        lblHotelName = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlReservation = new javax.swing.JPanel();
        btnReserve = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblGuestsName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtCINDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtCINTime = new javax.swing.JTextField();
        lblCheckIn = new javax.swing.JLabel();
        lblCINTime = new javax.swing.JLabel();
        txtCOUTDate = new javax.swing.JTextField();
        lblCOUTDate = new javax.swing.JLabel();
        txtCOUTTime = new javax.swing.JTextField();
        lblCheckOut = new javax.swing.JLabel();
        lblCOUTTime = new javax.swing.JLabel();
        lblRoomType = new javax.swing.JLabel();
        cmbRoomType = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        lblNoOfGuests = new javax.swing.JLabel();
        txtNoOfGuests = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        lblSelectRoomNo = new javax.swing.JLabel();
        pnlCheckIn = new javax.swing.JPanel();
        btnCheckIn = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        lblGuestsName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtContactNo1 = new javax.swing.JTextField();
        txtCINDate1 = new javax.swing.JTextField();
        lblDate1 = new javax.swing.JLabel();
        txtCINTime1 = new javax.swing.JTextField();
        lblCheckIn1 = new javax.swing.JLabel();
        lblCINTime1 = new javax.swing.JLabel();
        txtCOUTDate1 = new javax.swing.JTextField();
        lblCOUTDate1 = new javax.swing.JLabel();
        txtCOUTTime1 = new javax.swing.JTextField();
        lblCheckOut1 = new javax.swing.JLabel();
        lblCOUTTime1 = new javax.swing.JLabel();
        lblRoomType1 = new javax.swing.JLabel();
        cmbRoomType1 = new javax.swing.JComboBox<>();
        btnCancel1 = new javax.swing.JButton();
        lblNoOfGuests1 = new javax.swing.JLabel();
        txtNoOfGuests1 = new javax.swing.JTextField();
        lblContactNo1 = new javax.swing.JLabel();
        txtRoomNo1 = new javax.swing.JTextField();
        lblSelectRoomNo1 = new javax.swing.JLabel();
        pnlCheckOut = new javax.swing.JPanel();
        btnCheckOut = new javax.swing.JButton();
        lblTitle3 = new javax.swing.JLabel();
        lblGuestsName3 = new javax.swing.JLabel();
        txtName3 = new javax.swing.JTextField();
        btnCancel3 = new javax.swing.JButton();
        txtRoomNo3 = new javax.swing.JTextField();
        lblSelectRoomNo3 = new javax.swing.JLabel();
        lblRoomType2 = new javax.swing.JLabel();
        txtRoomType2 = new javax.swing.JTextField();
        lblHours = new javax.swing.JLabel();
        txtRoomType3 = new javax.swing.JTextField();
        lblFee = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        lblTotalBill = new javax.swing.JLabel();
        txtTotalBill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlTransparent.setBackground(new java.awt.Color(102, 51, 0));

        tabReservation.setBackground(new java.awt.Color(43, 24, 15));
        tabReservation.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabReservation.setForeground(new java.awt.Color(251, 232, 189));
        tabReservation.setText("RESERVATION");
        tabReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabReservationActionPerformed(evt);
            }
        });

        tabCheckIn.setBackground(new java.awt.Color(43, 24, 15));
        tabCheckIn.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabCheckIn.setForeground(new java.awt.Color(251, 232, 189));
        tabCheckIn.setText("CHECK-IN");
        tabCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCheckInActionPerformed(evt);
            }
        });

        tabCheckOut.setBackground(new java.awt.Color(43, 24, 15));
        tabCheckOut.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabCheckOut.setForeground(new java.awt.Color(251, 232, 189));
        tabCheckOut.setText("CHECK-OUT");
        tabCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCheckOutActionPerformed(evt);
            }
        });

        tabGuestsProfile.setBackground(new java.awt.Color(43, 24, 15));
        tabGuestsProfile.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabGuestsProfile.setForeground(new java.awt.Color(251, 232, 189));
        tabGuestsProfile.setText("GUEST'S PROFILE");
        tabGuestsProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabGuestsProfileActionPerformed(evt);
            }
        });

        tabRoomMngt.setBackground(new java.awt.Color(43, 24, 15));
        tabRoomMngt.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabRoomMngt.setForeground(new java.awt.Color(251, 232, 189));
        tabRoomMngt.setText("ROOM MANAGEMENT");
        tabRoomMngt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabRoomMngtActionPerformed(evt);
            }
        });

        tabRevenue.setBackground(new java.awt.Color(43, 24, 15));
        tabRevenue.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tabRevenue.setForeground(new java.awt.Color(251, 232, 189));
        tabRevenue.setText("REVENUE");
        tabRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabRevenueActionPerformed(evt);
            }
        });

        tabServices.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        tabServices.setForeground(new java.awt.Color(251, 232, 189));
        tabServices.setText("SERVICES");

        javax.swing.GroupLayout pnlTransparentLayout = new javax.swing.GroupLayout(pnlTransparent);
        pnlTransparent.setLayout(pnlTransparentLayout);
        pnlTransparentLayout.setHorizontalGroup(
                pnlTransparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransparentLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tabRevenue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabGuestsProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabRoomMngt, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(pnlTransparentLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(tabServices)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTransparentLayout.setVerticalGroup(
                pnlTransparentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTransparentLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tabServices)
                                .addGap(18, 18, 18)
                                .addComponent(tabReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tabCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tabCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tabGuestsProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tabRoomMngt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tabRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
        );

        pnlTop.setBackground(new java.awt.Color(43, 24, 15));

        pnlHome.setBackground(new java.awt.Color(169, 85, 0));

        lblHome.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblHome.setForeground(new java.awt.Color(236, 202, 136));
        lblHome.setText("Home");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
                pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(lblHome)
                                .addGap(23, 23, 23))
        );
        pnlHomeLayout.setVerticalGroup(
                pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHome)
                                .addGap(19, 19, 19))
        );

        lblRooms.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRooms.setForeground(new java.awt.Color(236, 202, 136));
        lblRooms.setText("Rooms");

        lblAmenities.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblAmenities.setForeground(new java.awt.Color(236, 202, 136));
        lblAmenities.setText("Amenities");

        lblDestinations.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblDestinations.setForeground(new java.awt.Color(236, 202, 136));
        lblDestinations.setText("Destinations");

        lblHotelName.setFont(new java.awt.Font("Benguiat", 0, 36)); // NOI18N
        lblHotelName.setForeground(new java.awt.Color(244, 211, 142));
        lblHotelName.setText("HYEITT HOTEL");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
                pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTopLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lblHotelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblRooms)
                                .addGap(28, 28, 28)
                                .addComponent(lblAmenities)
                                .addGap(26, 26, 26)
                                .addComponent(lblDestinations)
                                .addGap(18, 18, 18))
        );
        pnlTopLayout.setVerticalGroup(
                pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                                                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblAmenities)
                                                        .addComponent(lblDestinations)
                                                        .addComponent(lblRooms))
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                                                .addComponent(lblHotelName)
                                                .addGap(19, 19, 19))))
        );

        pnlContent.setLayout(new java.awt.CardLayout());

        pnlReservation.setBackground(new java.awt.Color(102, 51, 0));

        btnReserve.setBackground(new java.awt.Color(43, 24, 15));
        btnReserve.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnReserve.setForeground(new java.awt.Color(251, 232, 189));
        btnReserve.setText("RESERVE");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Benguiat", 0, 55)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(244, 211, 142));
        lblTitle.setText("RESERVATION");

        lblGuestsName.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblGuestsName.setForeground(new java.awt.Color(244, 211, 142));
        lblGuestsName.setText("Guest's Name");

        txtName.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtContactNo.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtCINDate.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblDate.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(244, 211, 142));
        lblDate.setText("Date");

        txtCINTime.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCheckIn.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblCheckIn.setForeground(new java.awt.Color(244, 211, 142));
        lblCheckIn.setText("Check IN");

        lblCINTime.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCINTime.setForeground(new java.awt.Color(244, 211, 142));
        lblCINTime.setText("Time");

        txtCOUTDate.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCOUTDate.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCOUTDate.setForeground(new java.awt.Color(244, 211, 142));
        lblCOUTDate.setText("Date");

        txtCOUTTime.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCheckOut.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblCheckOut.setForeground(new java.awt.Color(244, 211, 142));
        lblCheckOut.setText("Check Out");

        lblCOUTTime.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCOUTTime.setForeground(new java.awt.Color(244, 211, 142));
        lblCOUTTime.setText("Time");

        lblRoomType.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblRoomType.setForeground(new java.awt.Color(244, 211, 142));
        lblRoomType.setText("rOOM TYPE");

        cmbRoomType.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cmbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Deluxe Suite" }));

        btnCancel.setBackground(new java.awt.Color(43, 24, 15));
        btnCancel.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(251, 232, 189));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblNoOfGuests.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblNoOfGuests.setForeground(new java.awt.Color(244, 211, 142));
        lblNoOfGuests.setText("NO. of GUests");

        txtNoOfGuests.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblContactNo.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(244, 211, 142));
        lblContactNo.setText("Contact Number");

        txtRoomNo.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblSelectRoomNo.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblSelectRoomNo.setForeground(new java.awt.Color(244, 211, 142));
        lblSelectRoomNo.setText("Select Room Number");

        javax.swing.GroupLayout pnlReservationLayout = new javax.swing.GroupLayout(pnlReservation);
        pnlReservation.setLayout(pnlReservationLayout);
        pnlReservationLayout.setHorizontalGroup(
                pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblGuestsName)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                .addComponent(lblTitle)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblCheckIn)
                                                                                .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                        .addComponent(txtCINDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txtCINTime, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                .addGap(49, 49, 49)
                                                                                .addComponent(lblDate)
                                                                                .addGap(125, 125, 125)
                                                                                .addComponent(lblCINTime)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblCheckOut)
                                                                                .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                        .addComponent(txtCOUTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txtCOUTTime, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                        .addGap(48, 48, 48)
                                                                                        .addComponent(lblCOUTDate)
                                                                                        .addGap(125, 125, 125)
                                                                                        .addComponent(lblCOUTTime))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblRoomType)
                                                                                        .addComponent(cmbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(lblNoOfGuests))
                                                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(txtNoOfGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addComponent(lblContactNo)
                                                                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                                .addComponent(lblSelectRoomNo)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(72, 72, 72))))
                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(btnReserve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlReservationLayout.setVerticalGroup(
                pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addComponent(lblGuestsName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addComponent(lblContactNo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                .addComponent(lblRoomType)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cmbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                                .addComponent(lblNoOfGuests)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtNoOfGuests, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblSelectRoomNo)))
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                                .addComponent(lblCheckIn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCINDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCINTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblDate)
                                                        .addComponent(lblCINTime))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblCheckOut)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCOUTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCOUTTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblCOUTDate)
                                                        .addComponent(lblCOUTTime))))
                                .addGap(37, 37, 37)
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnReserve)
                                        .addComponent(btnCancel))
                                .addGap(33, 33, 33))
        );

        pnlContent.add(pnlReservation, "card2");

        pnlCheckIn.setBackground(new java.awt.Color(102, 51, 0));

        btnCheckIn.setBackground(new java.awt.Color(43, 24, 15));
        btnCheckIn.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(251, 232, 189));
        btnCheckIn.setText("CHECK-IN");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Benguiat", 0, 55)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(244, 211, 142));
        lblTitle1.setText("CHECK-IN");

        lblGuestsName1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblGuestsName1.setForeground(new java.awt.Color(244, 211, 142));
        lblGuestsName1.setText("Guest's Name");

        txtName1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtContactNo1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        txtCINDate1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblDate1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblDate1.setForeground(new java.awt.Color(244, 211, 142));
        lblDate1.setText("Date");

        txtCINTime1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCheckIn1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblCheckIn1.setForeground(new java.awt.Color(244, 211, 142));
        lblCheckIn1.setText("Check IN");

        lblCINTime1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCINTime1.setForeground(new java.awt.Color(244, 211, 142));
        lblCINTime1.setText("Time");

        txtCOUTDate1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCOUTDate1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCOUTDate1.setForeground(new java.awt.Color(244, 211, 142));
        lblCOUTDate1.setText("Date");

        txtCOUTTime1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblCheckOut1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblCheckOut1.setForeground(new java.awt.Color(244, 211, 142));
        lblCheckOut1.setText("Check Out");

        lblCOUTTime1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        lblCOUTTime1.setForeground(new java.awt.Color(244, 211, 142));
        lblCOUTTime1.setText("Time");

        lblRoomType1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblRoomType1.setForeground(new java.awt.Color(244, 211, 142));
        lblRoomType1.setText("rOOM TYPE");

        cmbRoomType1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cmbRoomType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Deluxe Suite" }));

        btnCancel1.setBackground(new java.awt.Color(43, 24, 15));
        btnCancel1.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(251, 232, 189));
        btnCancel1.setText("Cancel");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        lblNoOfGuests1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblNoOfGuests1.setForeground(new java.awt.Color(244, 211, 142));
        lblNoOfGuests1.setText("NO. of GUests");

        txtNoOfGuests1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblContactNo1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblContactNo1.setForeground(new java.awt.Color(244, 211, 142));
        lblContactNo1.setText("Contact Number");

        txtRoomNo1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblSelectRoomNo1.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblSelectRoomNo1.setForeground(new java.awt.Color(244, 211, 142));
        lblSelectRoomNo1.setText("Select Room Number");

        javax.swing.GroupLayout pnlCheckInLayout = new javax.swing.GroupLayout(pnlCheckIn);
        pnlCheckIn.setLayout(pnlCheckInLayout);
        pnlCheckInLayout.setHorizontalGroup(
                pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblGuestsName1)
                                                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                .addComponent(lblTitle1)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblCheckIn1)
                                                                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                        .addComponent(txtCINDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txtCINTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                .addGap(49, 49, 49)
                                                                                .addComponent(lblDate1)
                                                                                .addGap(125, 125, 125)
                                                                                .addComponent(lblCINTime1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblCheckOut1)
                                                                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                        .addComponent(txtCOUTDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txtCOUTTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                        .addGap(48, 48, 48)
                                                                                        .addComponent(lblCOUTDate1)
                                                                                        .addGap(125, 125, 125)
                                                                                        .addComponent(lblCOUTTime1))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblRoomType1)
                                                                                        .addComponent(cmbRoomType1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(lblNoOfGuests1))
                                                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(txtNoOfGuests1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addComponent(lblContactNo1)
                                                                        .addComponent(txtContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                                .addComponent(lblSelectRoomNo1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(txtRoomNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(72, 72, 72))))
                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(btnCheckIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel1)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCheckInLayout.setVerticalGroup(
                pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTitle1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addComponent(lblGuestsName1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addComponent(lblContactNo1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                .addComponent(lblRoomType1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cmbRoomType1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                                .addComponent(lblNoOfGuests1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtNoOfGuests1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtRoomNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblSelectRoomNo1)))
                                        .addGroup(pnlCheckInLayout.createSequentialGroup()
                                                .addComponent(lblCheckIn1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCINDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCINTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblDate1)
                                                        .addComponent(lblCINTime1))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblCheckOut1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCOUTDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCOUTTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblCOUTDate1)
                                                        .addComponent(lblCOUTTime1))))
                                .addGap(38, 38, 38)
                                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCheckIn)
                                        .addComponent(btnCancel1))
                                .addGap(32, 32, 32))
        );

        pnlContent.add(pnlCheckIn, "card2");

        pnlCheckOut.setBackground(new java.awt.Color(102, 51, 0));

        btnCheckOut.setBackground(new java.awt.Color(43, 24, 15));
        btnCheckOut.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(251, 232, 189));
        btnCheckOut.setText("CHECK-out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        lblTitle3.setFont(new java.awt.Font("Benguiat", 0, 55)); // NOI18N
        lblTitle3.setForeground(new java.awt.Color(244, 211, 142));
        lblTitle3.setText("CHECK-OUT");

        lblGuestsName3.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblGuestsName3.setForeground(new java.awt.Color(244, 211, 142));
        lblGuestsName3.setText("Guest's Name");

        txtName3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        btnCancel3.setBackground(new java.awt.Color(43, 24, 15));
        btnCancel3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCancel3.setForeground(new java.awt.Color(251, 232, 189));
        btnCancel3.setText("Cancel");
        btnCancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel3ActionPerformed(evt);
            }
        });

        txtRoomNo3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblSelectRoomNo3.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblSelectRoomNo3.setForeground(new java.awt.Color(244, 211, 142));
        lblSelectRoomNo3.setText("room Number");

        lblRoomType2.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblRoomType2.setForeground(new java.awt.Color(244, 211, 142));
        lblRoomType2.setText("Room Type");

        txtRoomType2.setEditable(false);
        txtRoomType2.setBackground(new java.awt.Color(102, 51, 0));
        txtRoomType2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtRoomType2.setForeground(new java.awt.Color(244, 211, 142));
        txtRoomType2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoomType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomType2ActionPerformed(evt);
            }
        });

        lblHours.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblHours.setForeground(new java.awt.Color(244, 211, 142));
        lblHours.setText("no. of hours stayed");

        txtRoomType3.setEditable(false);
        txtRoomType3.setBackground(new java.awt.Color(102, 51, 0));
        txtRoomType3.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtRoomType3.setForeground(new java.awt.Color(244, 211, 142));
        txtRoomType3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoomType3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomType3ActionPerformed(evt);
            }
        });

        lblFee.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblFee.setForeground(new java.awt.Color(244, 211, 142));
        lblFee.setText("fee");

        txtFee.setEditable(false);
        txtFee.setBackground(new java.awt.Color(102, 51, 0));
        txtFee.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtFee.setForeground(new java.awt.Color(244, 211, 142));
        txtFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeeActionPerformed(evt);
            }
        });

        lblTotalBill.setFont(new java.awt.Font("Bebas Neue", 0, 21)); // NOI18N
        lblTotalBill.setForeground(new java.awt.Color(244, 211, 142));
        lblTotalBill.setText("Total Bill:");

        txtTotalBill.setEditable(false);
        txtTotalBill.setBackground(new java.awt.Color(102, 51, 0));
        txtTotalBill.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        txtTotalBill.setForeground(new java.awt.Color(244, 211, 142));
        txtTotalBill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalBill.setText("PhP 0.00");
        txtTotalBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCheckOutLayout = new javax.swing.GroupLayout(pnlCheckOut);
        pnlCheckOut.setLayout(pnlCheckOutLayout);
        pnlCheckOutLayout.setHorizontalGroup(
                pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(91, 91, 91)
                                                                .addComponent(txtRoomType2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(115, 115, 115)
                                                                .addComponent(lblRoomType2)))
                                                .addGap(98, 98, 98)
                                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addComponent(lblHours)
                                                                .addGap(128, 128, 128)
                                                                .addComponent(lblFee))
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(txtRoomType3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                                                .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addComponent(lblTitle3))
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(274, 274, 274)
                                                                .addComponent(btnCheckOut)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnCancel3)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(93, 93, 93))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblGuestsName3)
                                        .addComponent(lblSelectRoomNo3))
                                .addGap(69, 69, 69)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRoomNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(219, 219, 219))
                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(lblTotalBill)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCheckOutLayout.setVerticalGroup(
                pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTitle3)
                                .addGap(21, 21, 21)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSelectRoomNo3)
                                        .addComponent(txtRoomNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblGuestsName3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(lblFee)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(lblRoomType2))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblHours)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtRoomType2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtRoomType3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTotalBill)
                                        .addComponent(txtTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCheckOut)
                                        .addComponent(btnCancel3))
                                .addGap(31, 31, 31))
        );

        pnlContent.add(pnlCheckOut, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(pnlTransparent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlTransparent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabReservationActionPerformed
        // TODO add your handling code here:
        pnlContent.removeAll();
        pnlContent.add(pnlReservation);
        pnlContent.repaint();
        pnlContent.revalidate();
    }//GEN-LAST:event_tabReservationActionPerformed

    private void tabCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCheckInActionPerformed
        // TODO add your handling code here:
        pnlContent.removeAll();
        pnlContent.add(pnlCheckIn);
        pnlContent.repaint();
        pnlContent.revalidate();
    }//GEN-LAST:event_tabCheckInActionPerformed

    private void tabCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCheckOutActionPerformed
        // TODO add your handling code here:
        pnlContent.removeAll();
        pnlContent.add(pnlCheckOut);
        pnlContent.repaint();
        pnlContent.revalidate();
    }//GEN-LAST:event_tabCheckOutActionPerformed

    private void tabGuestsProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabGuestsProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabGuestsProfileActionPerformed

    private void tabRoomMngtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabRoomMngtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabRoomMngtActionPerformed

    private void tabRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabRevenueActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnCancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancel3ActionPerformed

    private void txtRoomType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomType2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomType2ActionPerformed

    private void txtRoomType3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomType3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomType3ActionPerformed

    private void txtFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeeActionPerformed

    private void txtTotalBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalBillActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnCancel3;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnReserve;
    private javax.swing.JComboBox<String> cmbRoomType;
    private javax.swing.JComboBox<String> cmbRoomType1;
    private javax.swing.JLabel lblAmenities;
    private javax.swing.JLabel lblCINTime;
    private javax.swing.JLabel lblCINTime1;
    private javax.swing.JLabel lblCOUTDate;
    private javax.swing.JLabel lblCOUTDate1;
    private javax.swing.JLabel lblCOUTTime;
    private javax.swing.JLabel lblCOUTTime1;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckIn1;
    private javax.swing.JLabel lblCheckOut;
    private javax.swing.JLabel lblCheckOut1;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDestinations;
    private javax.swing.JLabel lblFee;
    private javax.swing.JLabel lblGuestsName;
    private javax.swing.JLabel lblGuestsName1;
    private javax.swing.JLabel lblGuestsName3;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHotelName;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblNoOfGuests;
    private javax.swing.JLabel lblNoOfGuests1;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JLabel lblRoomType1;
    private javax.swing.JLabel lblRoomType2;
    private javax.swing.JLabel lblRooms;
    private javax.swing.JLabel lblSelectRoomNo;
    private javax.swing.JLabel lblSelectRoomNo1;
    private javax.swing.JLabel lblSelectRoomNo3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JLabel lblTotalBill;
    private javax.swing.JPanel pnlCheckIn;
    private javax.swing.JPanel pnlCheckOut;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlReservation;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlTransparent;
    private javax.swing.JButton tabCheckIn;
    private javax.swing.JButton tabCheckOut;
    private javax.swing.JButton tabGuestsProfile;
    private javax.swing.JButton tabReservation;
    private javax.swing.JButton tabRevenue;
    private javax.swing.JButton tabRoomMngt;
    private javax.swing.JLabel tabServices;
    private javax.swing.JTextField txtCINDate;
    private javax.swing.JTextField txtCINDate1;
    private javax.swing.JTextField txtCINTime;
    private javax.swing.JTextField txtCINTime1;
    private javax.swing.JTextField txtCOUTDate;
    private javax.swing.JTextField txtCOUTDate1;
    private javax.swing.JTextField txtCOUTTime;
    private javax.swing.JTextField txtCOUTTime1;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtContactNo1;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName3;
    private javax.swing.JTextField txtNoOfGuests;
    private javax.swing.JTextField txtNoOfGuests1;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtRoomNo1;
    private javax.swing.JTextField txtRoomNo3;
    private javax.swing.JTextField txtRoomType2;
    private javax.swing.JTextField txtRoomType3;
    private javax.swing.JTextField txtTotalBill;
    // End of variables declaration//GEN-END:variables
}
