import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewGoods extends JFrame {
    private JButton viewVendorsButton;
    private JButton addGoodsButton;
    private JButton viewBillsButton;
    private JButton issuedGoodsButton;
    private JButton viewIssuedGoodsButton;
    private JButton viewGoodsButton;
    private JList list1;
    private JList list2;
    private JList list3;
    private JList list4;
    private JList list5;
    private JList list6;
    private JList list7;
    private JList list8;
    private JList list9;
    private JList list10;
    private JPanel jPanel;

    public ViewGoods(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jPanel);
        this.pack();

        viewBillsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ViewBills("Inventory Management");
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

        addGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new AddGoods("Inventory Management");
                frame.show();
                dispose();
            }
        });

    }

    public static void main(String[] args){
        JFrame frame = new ViewGoods("Inventory Management");
        frame.setVisible(true);
    }
}



