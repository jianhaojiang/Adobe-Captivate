package ScreenRecod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.*;


public class test extends JFrame implements ActionListener,MouseListener{
 
	JButton browseBtn,exit,browseBtn1 ;
	/**
	 * @param args
	 */

	// command constants
	public final static String BROWSE_CMD = "开始录制";
	public final static String BROWSE_CMD1 = "播放文件";
	public test() {
		JLayeredPane l=getLayeredPane();
		//JFrame JF = new JFrame("");
		//JF.setLocation(200,200);
		 //setUndecorated(true);
		browseBtn = new JButton("开始录制");
		browseBtn1 = new JButton("播放文件");
		//browseBtn.setFont(new Font("楷体", Font.PLAIN, 18));
		//browseBtn.setBorderPainted(false);//有无边框
		browseBtn.setContentAreaFilled(false);//透明背景
		browseBtn.setBounds(50,20,100,30);
		browseBtn1.setContentAreaFilled(false);//透明背景
		browseBtn1.setBounds(50,60,100,30);
		//browseBtn.setFont( new Font("华文行楷", Font.BOLD, 18));
		browseBtn.addActionListener(this);
		browseBtn1.addActionListener(this);
		exit = new JButton("退出");
		//exit.setFont( new Font("华文行楷", Font.BOLD, 15));
		//exit.setBorderPainted(false);//有无边框
		exit.setContentAreaFilled(false);//透明背景
		exit.setBounds(50,100,100,30);
		exit.addMouseListener(this);
		// buttons
		
		
		// setup listener...
		
	
		
		l.add(browseBtn, new Integer(10));//组件的默认覆盖位置
		l.add(browseBtn1, new Integer(10));//组件的默认覆盖位置
		l.add(exit, new Integer(10));//组件的默认覆盖位置
		//JF.setLayout(new FlowLayout());
		
		this.setTitle("java录制程序");
		this.setSize(200,200);//窗口大小
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}
	public void actionPerformed(ActionEvent e) {
		if(BROWSE_CMD.equals(e.getActionCommand())) {
			JFileChooser jfc=new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
	        jfc.showDialog(new JLabel(), "选择");
	        File f=jfc.getSelectedFile();
	        
			//JFileChooser chooser = new JFileChooser();
			//chooser.setAcceptAllFileFilterUsed(false);
			//chooser.showOpenDialog(null);
			/*使用showOpenDialog()方法，显示出打开选择文件的窗口，当选择了某个文件后，或者关闭此窗口那么都会返回一个
                                          整型数值，如果返回的是0，代表已经选择了某个文件。如果返回1代表选择了取消按钮或者直接关闭了窗口*/
			//File f = chooser.getSelectedFile();//获得路径
			if(f == null) return;
			this.setVisible(false);
			new MainFrame(f);
		}
		if(BROWSE_CMD1.equals(e.getActionCommand())) {
			JFileChooser jfc=new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        jfc.showDialog(new JLabel(), "播放");
	        File f=jfc.getSelectedFile();
	        
			//JFileChooser chooser = new JFileChooser();
			//chooser.setAcceptAllFileFilterUsed(false);
			//chooser.showOpenDialog(null);
			/*使用showOpenDialog()方法，显示出打开选择文件的窗口，当选择了某个文件后，或者关闭此窗口那么都会返回一个
                                          整型数值，如果返回的是0，代表已经选择了某个文件。如果返回1代表选择了取消按钮或者直接关闭了窗口*/
			//File f = chooser.getSelectedFile();//获得路径
			if(f == null) return;
			this.setVisible(false);
			//System.out.println(f.getPath());
			new MainFrame(f);
		}
		
	}
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==exit) {
			System.exit(0);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
		

}
 