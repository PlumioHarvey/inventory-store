import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGoods extends JFrame{
    private JButton viewVendorsButton;
    private JButton addGoodsButton;
    private JButton viewBillsButton;
    private JButton issuedGoodsButton;
    private JButton viewIssuedGoodsButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel date;
    private JTextField textField1;
    private JLabel quantity;
    private JTextField textField2;
    private JTextField textField3;
    private javax.swing.JPanel mainPanel;
    private JButton viewGoodsButton;
    private JButton addItemButton;
    private JButton removeItemButton;
    private JComboBox comboBox3;
    private JButton saveButton;

    public AddGoods(String title){
        super(title);
        comboBox1.addItem("joe's Place");
        comboBox1.addItem("Ug Specs");
        comboBox1.addItem("Malvic Shop");
        comboBox1.addItem("Claus Shop");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        viewGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ViewGoods("Inventory Management");
                frame.show();
                dispose();
            }
        });

        viewVendorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new Project("Inventory Management");
                frame.show();
                dispose();
            }
        });

        viewIssuedGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ViewIssued("Inventory Management");
                frame.show();
                dispose();
            }
        });

        issuedGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new IssuedGoods("Inventory Management");
                frame.show();
                dispose();
            }
        });

        viewBillsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ViewBills("Inventory Management");
                frame.show();
                dispose();
            }
        });

    }

    public static void main(String[] args){
        JFrame frame = new AddGoods("Inventory Management");
        frame.setVisible(true);
    }
}
