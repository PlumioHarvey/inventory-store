import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame{
    private JButton viewVendorsButton;
    private JButton addGoodsButton;
    private JButton viewBillsButton;
    private JButton issuedGoodsButton;
    private JButton viewIssuedGoodsButton;
    private javax.swing.JPanel JPanel;
    private JButton viewGoodsButton;

    public Project(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel);
        this.pack();

        viewGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new ViewGoods("Inventory Management");
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
        JFrame frame = new Project("Inventory Management");
        frame.setVisible(true);

    }

}
