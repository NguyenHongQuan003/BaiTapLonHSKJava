package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmTaiKhoan extends JFrame{

	public static JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JTextField txtManv, txtMaTK, txtPass, txtQuyen;
	private JRadioButton radMaNV;
	private JRadioButton radMaTK;
	private JTextField txtTimKiem;
	private JButton btnTim;
	private JButton btnReset;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnXoaTrang;
	private JButton btnSua;
	
	private JComboBox<String> cboMaNV;
	private JComboBox<String> cboQuyen;
	
	public FrmTaiKhoan() {
		super("Thông tin tài khoản");
		setSize(1050, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		createGUI();
	}
	
	public void createGUI() {
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		add(pnBorder);
		
		JPanel pnNorth = new JPanel();
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		
		JLabel lblTieuDe = new JLabel("THÔNG TIN TÀI KHOẢN");
		lblTieuDe.setForeground(Color.blue);
		Font fTieuDe = new Font("Arial", Font.BOLD, 45);
		lblTieuDe.setFont(fTieuDe);
		pnNorth.add(lblTieuDe);
		
		String cols[] = {"Mã TK", "Mã NV", "Mật Khẩu", "Quyền"};
		model = new DefaultTableModel(cols, 0);
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		js.setPreferredSize(new Dimension(750, 540));
		pnBorder.add(js, BorderLayout.WEST);
		
		JPanel pnText = new JPanel();
		pnText.setLayout(new BorderLayout());
		pnBorder.add(pnText, BorderLayout.CENTER);
		
		Box b = Box.createVerticalBox();
		Box b1 = Box.createHorizontalBox();
		Box b2 = Box.createHorizontalBox();
		Box b3 = Box.createHorizontalBox();
		Box b4 = Box.createHorizontalBox();
		
		pnText.add(b, BorderLayout.NORTH);
		
		b.add(b1);
		b.add(Box.createVerticalStrut(5));
		b.add(b2);
		b.add(Box.createVerticalStrut(5));
		b.add(b3);
		b.add(Box.createVerticalStrut(5));
		b.add(b4);
		b.add(Box.createVerticalStrut(5));
		
		JLabel lblMaTK = new JLabel("Mã TK: ");
		JLabel lblMaNV = new JLabel("Mã NV: ");
		JLabel lblPass = new JLabel("Mật khẩu: ");
		JLabel lblQuyen = new JLabel("Quyền: ");
		JButton btnRandom = new JButton("Random");
		
		txtMaTK = new JTextField(10);
		txtMaTK.setEditable(false);
		b1.add(lblMaTK);
		b1.add(txtMaTK);
		b1.add(btnRandom);
		
		cboMaNV = new JComboBox<String>();
		b2.add(lblMaNV);
		b2.add(cboMaNV);
		
		txtPass = new JTextField();
		b3.add(lblPass);
		b3.add(txtPass);
		
		cboQuyen = new JComboBox<String>();
		cboQuyen.addItem("Admin");
		cboQuyen.addItem("Nhân viên");
		b4.add(lblQuyen);
		b4.add(cboQuyen);
		
		JSplitPane split;
		pnBorder.add(split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT), BorderLayout.SOUTH);
		split.setResizeWeight(0.5);
		
		JPanel pnTimKiem = new JPanel();
		JLabel lblTim = new JLabel("Thông tin tìm: ");
		radMaNV = new JRadioButton("MãNV", true);
		radMaTK = new JRadioButton("MãTK");
		ButtonGroup groupTim = new ButtonGroup();
		groupTim.add(radMaTK);
		groupTim.add(radMaNV);
		txtTimKiem = new JTextField(15);
		txtTimKiem.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		pnTimKiem.add(lblTim);
		pnTimKiem.add(txtTimKiem);
		pnTimKiem.add(radMaNV);
		pnTimKiem.add(radMaTK);
		btnTim = new JButton("Tìm");
		pnTimKiem.add(btnTim);
		btnReset = new JButton("Reset");
		pnTimKiem.add(btnReset);
		split.add(pnTimKiem);
		
		JPanel pnChucNang = new JPanel();
		btnThem = new JButton("Thêm");
		btnXoa = new JButton("Xóa");
		btnXoaTrang = new JButton("Xóa trắng");
		btnSua = new JButton("Sửa");

		pnChucNang.add(btnThem);
		pnChucNang.add(btnXoa);
		pnChucNang.add(btnXoaTrang);
		pnChucNang.add(btnSua);
		split.add(pnChucNang);
		
		contentPane = new JPanel();
		contentPane.add(pnBorder);
		add(contentPane);
	}

	public static void main(String[] args) {
		new FrmTaiKhoan().setVisible(true);

	}

}
