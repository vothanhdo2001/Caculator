/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20520615_lab2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author PTLinh
 */
public class PhanThiLinh_20520615 {

    // Cấu hình log4j
    private static final Logger LOGGER = LogManager.getLogger(PhanThiLinh_20520615.class);
    //Biến Memory lưu trữ giá trị
    private String Memory = "Null";
    //Biến kiểm tra màn hình có phải đang là 0
    static boolean check = false;
    //Biến lưu nội dung màn hình
    private String Content = "";
    //Khai báo girlbag layout, frame, button và textfiled
    private final GridBagLayout gbl;
    private final GridBagConstraints c;
    private final JFrame JF;
    //Khởi tạo nút
    JButton khongJButton = new JButton("0");
    JButton motJButton = new JButton("1");
    JButton haiJButton = new JButton("2");
    JButton baJButton = new JButton("3");
    JButton bonJButton = new JButton("4");
    JButton namJButton = new JButton("5");
    JButton sauJButton = new JButton("6");
    JButton bayJButton = new JButton("7");
    JButton tamJButton = new JButton("8");
    JButton chinJButton = new JButton("9");
    JButton chamJButton = new JButton(".");
    JButton xoaJButton = new JButton("\u2190");
    JButton CEJButton = new JButton("CE");
    JButton CJButton = new JButton("C");
    JButton MCJButton = new JButton("MC");
    JButton MRJButton = new JButton("MR");
    JButton MSJButton = new JButton("MS");
    JButton MCongJButton = new JButton("M+");
    JButton MTruJButton = new JButton("M-");
    JButton congTruJButton = new JButton("±");
    JButton canJButton = new JButton("√");
    JButton chiaJButton = new JButton("/");
    JButton phanTramJButton = new JButton("%");
    JButton nhanJButton = new JButton("*");
    JButton ngichDaoJButton = new JButton("1/x");
    JButton truJButton = new JButton("-");
    JButton congJButton = new JButton("+");
    JButton bangJButton = new JButton("=");
    //Khởi tạo textfield với nội dung mặc định là 0
    JTextField display = new JTextField("0");

    public PhanThiLinh_20520615() {
        //Ghi logger khi chạy
        LOGGER.info(" Run Caculator");
        //Thiết lập màu sắc, kích thước cho các button
        khongJButton.setForeground(Color.BLUE);
        khongJButton.setFont(new Font("Arial", Font.BOLD, 12));
        motJButton.setForeground(Color.BLUE);
        motJButton.setFont(new Font("Arial", Font.BOLD, 12));
        haiJButton.setForeground(Color.BLUE);
        haiJButton.setFont(new Font("Arial", Font.BOLD, 12));
        baJButton.setForeground(Color.BLUE);
        baJButton.setFont(new Font("Arial", Font.BOLD, 12));
        bonJButton.setForeground(Color.BLUE);
        bonJButton.setFont(new Font("Arial", Font.BOLD, 12));
        namJButton.setForeground(Color.BLUE);
        namJButton.setFont(new Font("Arial", Font.BOLD, 12));
        sauJButton.setForeground(Color.BLUE);
        sauJButton.setFont(new Font("Arial", Font.BOLD, 12));
        bayJButton.setForeground(Color.BLUE);
        bayJButton.setFont(new Font("Arial", Font.BOLD, 12));
        tamJButton.setForeground(Color.BLUE);
        tamJButton.setFont(new Font("Arial", Font.BOLD, 12));
        chinJButton.setForeground(Color.BLUE);
        chinJButton.setFont(new Font("Arial", Font.BOLD, 12));
        chamJButton.setForeground(Color.BLUE);
        chamJButton.setFont(new Font("Arial", Font.BOLD, 12));
        xoaJButton.setForeground(Color.BLUE);
        xoaJButton.setFont(new Font("Arial", Font.BOLD, 12));
        CEJButton.setForeground(Color.WHITE);
        CEJButton.setBackground(Color.ORANGE);
        CEJButton.setFont(new Font("Arial", Font.BOLD, 12));
        CJButton.setForeground(Color.WHITE);
        CJButton.setBackground(Color.RED);
        CJButton.setFont(new Font("Arial", Font.BOLD, 12));
        MCJButton.setForeground(Color.BLUE);
        MCJButton.setFont(new Font("Arial", Font.BOLD, 12));
        MRJButton.setForeground(Color.BLUE);
        MRJButton.setFont(new Font("Arial", Font.BOLD, 12));
        MSJButton.setForeground(Color.BLUE);
        MSJButton.setFont(new Font("Arial", Font.BOLD, 12));
        MCongJButton.setForeground(Color.BLUE);
        MCongJButton.setFont(new Font("Arial", Font.BOLD, 12));
        MTruJButton.setForeground(Color.BLUE);
        MTruJButton.setFont(new Font("Arial", Font.BOLD, 12));
        congTruJButton.setForeground(Color.BLUE);
        congTruJButton.setFont(new Font("Arial", Font.BOLD, 12));
        canJButton.setForeground(Color.BLUE);
        canJButton.setFont(new Font("Arial", Font.BOLD, 12));
        chiaJButton.setForeground(Color.BLUE);
        chiaJButton.setFont(new Font("Arial", Font.BOLD, 12));
        phanTramJButton.setForeground(Color.BLUE);
        phanTramJButton.setFont(new Font("Arial", Font.BOLD, 12));
        nhanJButton.setForeground(Color.BLUE);
        nhanJButton.setFont(new Font("Arial", Font.BOLD, 12));
        ngichDaoJButton.setForeground(Color.BLUE);
        ngichDaoJButton.setFont(new Font("Arial", Font.BOLD, 12));
        truJButton.setForeground(Color.BLUE);
        truJButton.setFont(new Font("Arial", Font.BOLD, 12));
        congJButton.setForeground(Color.BLUE);
        congJButton.setFont(new Font("Arial", Font.BOLD, 12));
        bangJButton.setForeground(Color.WHITE);
        bangJButton.setFont(new Font("Arial", Font.BOLD, 12));
        bangJButton.setBackground(Color.ORANGE);
        //Đặt chữ ở textfield sang phải
        display.setHorizontalAlignment(JTextField.RIGHT);
        //Không cho sửa
        display.setEditable(false);
        //Màu chữ đỏ
        display.setForeground(Color.red);
        //Kiểu chữ, cỡ,...
        display.setFont(new Font("Arial", Font.BOLD, 24));
        //Tạo frame caculator
        JF = new JFrame("Caculator");
        //Đặt kích thước
        JF.setSize(300, 350);
        //Thiết lập thao tác đóng ứng dụng khi nhấn vào nút X tương đương System.exit(0)
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tạo girlbag lauout
        gbl = new GridBagLayout();
        //tạo content
        JF.getContentPane().setLayout(gbl);
        //Bố trí các button, textfield vào girlbaglauout
        c = new GridBagConstraints();
        //Đặt khoảng cách giữa các block
        c.insets = new Insets(3, 3, 3, 3);
        //Đặt kích thước dọc 1 layout = 25
        c.ipady = 25;
        //cột 0
        c.gridx = 0;
        //hàng 0
        c.gridy = 0;
        //Đặt kích thước ngang 1 block = 5
        c.gridwidth = 5;
        //Kéo đày sang ngang
        c.fill = GridBagConstraints.HORIZONTAL;
        //Thêm block vào frame
        JF.add(display, c);
        c.ipady = 5;
        c.gridwidth = 1;
        //dòng 2
        c.gridy = 1;
        //cột 1
        c.gridx = 0;
        JF.add(MCJButton, c);
        c.gridx = 1;
        JF.add(MRJButton, c);
        c.gridx = 2;
        JF.add(MSJButton, c);
        c.gridx = 3;
        JF.add(MCongJButton, c);
        c.gridx = 4;
        JF.add(MTruJButton, c);
        c.gridy = 2;
        c.gridx = 0;
        JF.add(xoaJButton, c);
        c.gridx = 1;
        JF.add(CEJButton, c);
        c.gridx = 2;
        JF.add(CJButton, c);
        c.gridx = 3;
        JF.add(congTruJButton, c);
        c.gridx = 4;
        JF.add(canJButton, c);
        c.gridy = 3;
        c.gridx = 0;
        JF.add(bayJButton, c);
        c.gridx = 1;
        JF.add(tamJButton, c);
        c.gridx = 2;
        JF.add(chinJButton, c);
        c.gridx = 3;
        JF.add(chiaJButton, c);
        c.gridx = 4;
        JF.add(phanTramJButton, c);
        c.gridy = 4;
        c.gridx = 0;
        JF.add(bonJButton, c);
        c.gridx = 1;
        JF.add(namJButton, c);
        c.gridx = 2;
        JF.add(sauJButton, c);
        c.gridx = 3;
        JF.add(nhanJButton, c);
        c.gridx = 4;
        JF.add(ngichDaoJButton, c);
        c.gridy = 5;
        c.gridx = 0;
        JF.add(motJButton, c);
        c.gridx = 1;
        JF.add(haiJButton, c);
        c.gridx = 2;
        JF.add(baJButton, c);
        c.gridx = 3;
        JF.add(truJButton, c);
        c.gridx = 4;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        JF.add(bangJButton, c);
        c.gridheight = 1;
        c.gridy = 6;
        c.gridx = 0;
        c.gridwidth = 2;
        JF.add(khongJButton, c);
        c.gridwidth = 1;
        c.gridx = 2;
        JF.add(chamJButton, c);
        c.gridx = 3;
        JF.add(congJButton, c);
        //Gán sự kiện nhấn vào nút 0
        khongJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Ghi nhận lại ký tự 0
            Content += "0";
            //Thêm vào textfield
            display.setText(Content);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút 1
        motJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "1";
            display.setText(Content);
            System.out.println(Content);
        });

        haiJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "2";
            display.setText(Content);
            System.out.println(Content);
        });

        baJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "3";
            display.setText(Content);
            System.out.println(Content);
        });

        bonJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "4";
            display.setText(Content);
            System.out.println(Content);
        });

        namJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "5";
            display.setText(Content);
            System.out.println(Content);
        });

        sauJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "6";
            display.setText(Content);
            System.out.println(Content);
        });

        bayJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "7";
            display.setText(Content);
            System.out.println(Content);
        });

        tamJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "8";
            display.setText(Content);
            System.out.println(Content);
        });

        chinJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += "9";
            display.setText(Content);
            System.out.println(Content);
        });

        chamJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content += ".";
            display.setText(Content);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút backspace
        xoaJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra nếu đã xoá hết thì ngừng xoá
            if (Content.length() == 0) {
                Content = "";
                display.setText("0");
            } else {
                //Ngược lại giảm đi 1 ký tự
                Content = Content.substring(0, Content.length() - 1);
                if (Content.length() == 0) {
                    Content = "";
                    display.setText("0");
                } else {
                    display.setText(Content);
                }
            }
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút xoá tất cả
        CEJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content = "";
            display.setText("0");
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút xoá tất cả
        CJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Content = "";
            display.setText("0");
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút xoá memory
        MCJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            Memory = "Null";
            Content = "";
            display.setText("Cleaned");
        });
        //Gán sự kiện nhấn vào nút đọc memory
        MRJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra biến có giá trị chưa
            if (Content.equals("")) {
                Memory = "Null";
            }
            //có hiển thị ra màn hình
            display.setText(Memory);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút Lưu kết quả vào memory
        MSJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0")) {
                Memory = "0";
            }
            //Tính toán kết quả trước khi lưu
            tinh();
            Memory = display.getText();
            display.setText("Saved");
            System.out.println(Content);
            System.out.println(Memory);
        });
        //Gán sự kiện nhấn vào nút M+
        MCongJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra chuỗi không phải là phép toán
            if (display.getText().equals("0") || display.getText().equals("Saved") || display.getText().equals("Null") || display.getText().equals("Cleaned")) {
                return;
            }
            //Nếu là phép toán thì tính toán kết quả
            tinh();
            //Nếu memory chưa có giá trị thì set memory bằng kết quả mới
            if (Memory.equals("Null")) {
                Memory = display.getText();
                return;
            }
            //Lấy kết quả trong memory ép kiểu rồi + với kết quả mới
            double val = Double.parseDouble(Content);
            double val1 = Double.parseDouble(Memory);
            val += val1;
            val = Math.round(val * 10000000.0) / 10000000.0;
            Content = String.valueOf(val);
            Memory = Content;
            display.setText(Content);
            System.out.println(Content);

        });
        //Gán sự kiện nhấn vào nút M-
        MTruJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0") || display.getText().equals("Saved") || display.getText().equals("Null") || display.getText().equals("Cleaned")) {
                return;
            }
            tinh();

            if (Memory.equals("Null")) {
                Memory = display.getText();
                return;
            }
            double val = Double.parseDouble(Content);
            double val1 = Double.parseDouble(Memory);
            val = val1 - val;
            val = Math.round(val * 10000000.0) / 10000000.0;
            Content = String.valueOf(val);
            Memory = Content;
            display.setText(Content);
            System.out.println(Content);

        });
        //Gán sự kiện nhấn vào nút đổi dấu
        congTruJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0")) {
                return;
            }
            tinh();
            double val = Double.parseDouble(Content);
            val = -val;
            val = Math.round(val * 10000000.0) / 10000000.0;
            Content = String.valueOf(val);
            display.setText(Content);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút /
        chiaJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra lỗi khi nhập phép tính
            if (display.getText().equals("0")) {
                return;
            }
            String temp = display.getText();
            char temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            //System.out.print(temp);
            if (temp.equals("/") || temp.equals("x") || temp.equals("-") || temp.equals("+")) {
                String temp2 = display.getText();
                int len = temp2.length() - 1;
                String temp3 = temp2.substring(0, len);
                //System.out.print(temp3);
                Content = temp3 + "/";
                display.setText(Content);
            }
            temp = display.getText();
            temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            if (!(temp.equals("/"))) {
                Content = display.getText() + "/";
                display.setText(Content);
            }
        });
        //Gán sự kiện nhấn vào nút %
        phanTramJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0")) {
                return;
            }
            tinh();
            double val = Double.parseDouble(Content);
            val = val / 100;
            val = Math.round(val * 1000000.0) / 1000000.0;
            Content = String.valueOf(val);
            display.setText(Content);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút *
        nhanJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra lỗi khi nhập phép tính
            if (display.getText().equals("0")) {
                return;
            }
            String temp = display.getText();
            char temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            //System.out.print(temp);
            if (temp.equals("/") || temp.equals("x") || temp.equals("-") || temp.equals("+")) {
                String temp2 = display.getText();
                int len = temp2.length() - 1;
                String temp3 = temp2.substring(0, len);
                //System.out.print(temp3);
                Content = temp3 + "*";
                display.setText(Content);
            }
            temp = display.getText();
            temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            if (!(temp.equals("*"))) {
                Content = display.getText() + "*";
                display.setText(Content);
            }
        });
        //Gán sự kiện nhấn vào nút 1/x
        ngichDaoJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0")) {
                return;
            }
            tinh();
            double val = Double.parseDouble(Content);
            val = 1 / val;
            val = Math.round(val * 10000000.0) / 10000000.0;
            Content = String.valueOf(val);
            display.setText(Content);
            System.out.println(Content);
        });
        //Gán sự kiện nhấn vào nút -
        truJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra lỗi khi nhập phép tính
            if (display.getText().equals("0")) {
                return;
            }
            String temp = display.getText();
            char temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            //System.out.print(temp);
            if (temp.equals("/") || temp.equals("x") || temp.equals("-") || temp.equals("+")) {
                String temp2 = display.getText();
                int len = temp2.length() - 1;
                String temp3 = temp2.substring(0, len);
                //System.out.print(temp3);
                Content = temp3 + "-";
                display.setText(Content);
            }
            temp = display.getText();
            temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            if (!(temp.equals("-"))) {
                Content = display.getText() + "-";
                display.setText(Content);
            }
        });
        //Gán sự kiện nhấn vào nút +
        congJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Kiểm tra lỗi khi nhập phép tính
            if (display.getText().equals("0")) {
                return;
            }
            if (display.getText().equals("0")) {
                display.setText("");
            }
            String temp = display.getText();
            char temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            //System.out.print(temp);
            if (temp.equals("/") || temp.equals("x") || temp.equals("-") || temp.equals("+")) {
                String temp2 = display.getText();
                int len = temp2.length() - 1;
                String temp3 = temp2.substring(0, len);
                //System.out.print(temp3);
                Content = temp3 + "+";
                display.setText(Content);
            }
            temp = display.getText();
            temp1 = temp.charAt(temp.length() - 1);
            temp = String.valueOf(temp1);
            if (!(temp.equals("+"))) {
                Content = display.getText() + "+";
                display.setText(Content);
            }
        });
        //Gán sự kiện nhấn vào nút =
        bangJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            //Tính toán kết quả đầu vào là chuỗi các phép toán
            tinh();
        });
        //Gán sự kiện nhấn vào nút căn
        canJButton.addActionListener((ActionEvent e) -> {
            // Xử lý sự kiện khi nút được nhấn
            if (display.getText().equals("0")) {
                return;
            }
            tinh();
            double val = Double.parseDouble(Content);
            val = Math.sqrt(val);
            val = Math.round(val * 10000000.0) / 10000000.0;
            Content = String.valueOf(val);
            display.setText(Content);
            System.out.println(Content);
        });
        //Kích hoạt frame
        JF.setLocationRelativeTo(null);
        //JF.pack();
        JF.setVisible(true);
    }

    //Hàm tính toán kết quả phép toán
    public void tinh() {
        //Lấy phép toán từ màn hình
        String a = display.getText();
        //Kiểm tra lỗi trong phép toán
        if (a.charAt(0) == 'C' || a.charAt(0) == 'S' || a.charAt(0) == 'N') {
            Content = "";
            display.setText("0");
            LOGGER.info("Result :" + Content);
            LOGGER.info("Memory: " + Memory);
            return;
        }
        //Lấy phép toán
        char b = a.charAt(a.length() - 1);
        //kiểm tra có phải là phép toán đổi dấu
        if (a.charAt(0) == '-') {
            double z = Double.parseDouble(a);
            Content = String.valueOf(z);
            display.setText(Content);
            LOGGER.info("Result :" + Content);
            LOGGER.info("Memory: " + Memory);
            return;
        }
        a = String.valueOf(b);
        //System.out.print(temp);
        //Kiểm tra lỗi phép tính
        if (a.equals("/") || a.equals("*") || a.equals("-") || a.equals("+")) {
            display.setText("LỖI PHÉP TÍNH !!!");
            check = true;
            LOGGER.info("Result :" + Content);
            LOGGER.info("Memory: " + Memory);
            return;
        }
        //Kiểm tra lỗi phép tính
        if (a.equals("=") || a.equals("!")) {
            display.setText("0");
            Content = "";
            check = true;
            LOGGER.info("Result :" + Content);
            LOGGER.info("Memory: " + Memory);
            return;
        }
        check = true;
        //Phân tích cú pháp phép toán thực hiện nhân chia trước cộng trừ sau
        if (!(display.getText().equals("0"))) {
            String ketQua = display.getText() + "=";
            display.setText(ketQua);
            Content = ketQua;
            String temp = display.getText();
            int dau = 0, cuoi = 0;
            ArrayList<String> pt = new ArrayList<String>();
            ArrayList<Integer> ut = new ArrayList<Integer>();
            ArrayList<Integer> kut = new ArrayList<Integer>();
            ArrayList<Double> so = new ArrayList<Double>();
            int dem = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '/' || temp.charAt(i) == '*' || temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '=') {
                    if (temp.charAt(i) == '/' || temp.charAt(i) == '*') {
                        ut.add(dem);
                        pt.add(String.valueOf(temp.charAt(i)));
                    }
                    if (temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '=') {
                        kut.add(dem);
                        pt.add(String.valueOf(temp.charAt(i)));
                    }
                    dem++;
                    String temp1 = display.getText();
                    cuoi = i;
                    temp1 = temp1.substring(dau, cuoi);
                    so.add(Double.valueOf(temp1));
                    dau = i + 1;
                }
            }
            for (int vTri : ut) {
                if (pt.get(vTri).equals("*")) {
                    double kQua = so.get(vTri) * so.get(vTri + 1);
                    so.set(vTri, kQua);
                    so.set(vTri + 1, kQua);
                }
                if (pt.get(vTri).equals("/")) {
                    double kQua = so.get(vTri) / so.get(vTri + 1);
                    so.set(vTri, kQua);
                    so.set(vTri + 1, kQua);
                }
            }
            double Sum = 0;

            for (int i = 0; i < kut.size(); i++) {
                if (pt.get(kut.get(i)).equals("+")) {
                    Sum = Sum + so.get(kut.get(i + 1));
                }
                if (pt.get(kut.get(i)).equals("-")) {
                    Sum = Sum - so.get(kut.get(i + 1));
                }
                System.out.println(Sum);
            }

            if (pt.get(0).equals("=")) {
                Sum += so.get(0);
                Sum = Math.round(Sum * 100.0) / 100.0;
                display.setText(String.valueOf(Sum));
                Content = String.valueOf(Sum);
                LOGGER.info("Result :" + Content);
                LOGGER.info("Memory: " + Memory);
                return;
            }
            Sum += so.get(kut.get(0));
            Sum = Math.round(Sum * 100.0) / 100.0;
            display.setText(String.valueOf(Sum));
            Content = String.valueOf(Sum);
            //Check lỗi chia cho 0
            if (display.getText().equals("9.223372036854776E16") || display.getText().equals("Infinity") || display.getText().equals("+Infinity")) {
                display.setText("Không thể chia 0 !!!");
            }
            LOGGER.info("Result :" + Content);
            LOGGER.info("Memory: " + Memory);

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new PhanThiLinh_20520615();
    }

}
