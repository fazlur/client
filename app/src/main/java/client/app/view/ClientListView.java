package client.app.view;

import javax.swing.*;
import java.awt.*;

class ClientListView extends JPanel {

    private JTable table;

    ClientListView() {
        super(new BorderLayout());

        table = new JTable(new String[][]{{"John", "", "", ""}, {"Anna", "", "", ""}, {"Mary", "", "", ""}}, new String[] {"Client", "Address", "E-Mail", "Phone"});

        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
