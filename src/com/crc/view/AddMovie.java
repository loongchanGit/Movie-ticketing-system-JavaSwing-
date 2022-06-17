package com.crc.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.crc.entity.Movie;
import com.crc.service.MovieService;
import com.crc.service.impl.MovieServiceImpl;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMovie extends JInternalFrame {
	private JTextField movieNameText;
	private JTextField movielangText;
	private JTextField movieLoaText;
	private JTextField picaddressText;
	private JTextField timeText;
	private JTextField scoreText;
	private JTextArea detailtextArea;
	private JComboBox movietypeBox;
	private MovieService movieservice=new MovieServiceImpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//异步事件处理
			public void run() {
				try {
					AddMovie frame = new AddMovie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddMovie() {
		setIconifiable(true);//提供最小化按钮
		setClosable(true);//是否可关闭
		setTitle("添加电影");//标题
		setBounds(50, 50, 1239, 737);//设置位置
		
		JLabel movieNameLabel = new JLabel("电影名字:");//标签
		movieNameLabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		movieNameText = new JTextField();//文本框
		movieNameText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		movieNameText.setColumns(10);//长度
		
		JLabel movielanglabel = new JLabel("语言:");//标签
		movielanglabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		movielangText = new JTextField();//文本框
		movielangText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		movielangText.setColumns(10);//长度
		
		JLabel movieLoaLabel = new JLabel("地区：");//标签
		movieLoaLabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		movieLoaText = new JTextField();//文本框
		movieLoaText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		movieLoaText.setColumns(10);//长度
		
		JLabel picaddressLabel = new JLabel("海报地址:");//标签
		picaddressLabel.setFont(new Font("楷体", Font.PLAIN, 20));//长度
		
		picaddressText = new JTextField();//文本框
		picaddressText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		picaddressText.setColumns(10);//长度
		picaddressText.setText("images/");//图片路径
		
		JLabel timeLabel = new JLabel("时长:");//标签
		timeLabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		timeText = new JTextField();//文本框
		timeText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		timeText.setColumns(10);//长度
		
		JLabel movietypeLabel = new JLabel("类型:");//标签
		movietypeLabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		 movietypeBox = new JComboBox();//组合框
		 movietypeBox.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		 movietypeBox.addItem("科幻");//组合框选项
		 movietypeBox.addItem("动作");
		 movietypeBox.addItem("爱情");
		 movietypeBox.addItem("剧情");
		 movietypeBox.addItem("动漫");
		JLabel scoreLabel = new JLabel("分数:");//标签
		scoreLabel.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		
		scoreText = new JTextField();//文本框
		scoreText.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		scoreText.setColumns(10);//长度
		
		 detailtextArea = new JTextArea();//多行文本框
		 detailtextArea.setFont(new Font("楷体", Font.PLAIN, 20));//字体
		 detailtextArea.setLineWrap(true);//自动换行
		
		JButton cancelButton = new JButton("取消");//按钮
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelActionPerformed(e);
			}
		});
		cancelButton.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JButton addButton = new JButton("添加");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addactionPerformed(e);
			}
		});
		addButton.setFont(new Font("楷体", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());//分组布局管理器
		groupLayout.setHorizontalGroup(//指定布局的水平组
			groupLayout.createParallelGroup(Alignment.LEADING)//并行
				.addGroup(groupLayout.createSequentialGroup()//串行
					.addContainerGap(222, Short.MAX_VALUE)//添加容器间隔
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(picaddressLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)//添加控件
						.addComponent(movieNameLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(picaddressText)
						.addComponent(movieNameText, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(timeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(movielanglabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(movielangText, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(63)
							.addComponent(movieLoaLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(timeText, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(movietypeLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(movietypeBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scoreLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scoreText, 0, 0, Short.MAX_VALUE))
						.addComponent(movieLoaText, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(242, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(299)
					.addComponent(detailtextArea, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(309, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(412)
					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(157)
					.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(466, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(158)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(movieNameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(movielanglabel)
						.addComponent(movielangText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(movieLoaLabel)
						.addComponent(movieLoaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(movieNameLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(picaddressLabel)
						.addComponent(picaddressText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(timeLabel)
						.addComponent(timeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(movietypeLabel)
						.addComponent(movietypeBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(scoreLabel)
						.addComponent(scoreText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(82)
					.addComponent(detailtextArea, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cancelButton)
						.addComponent(addButton))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		this.setVisible(true);
	}

	protected void cancelActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	protected void addactionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String movieName=movieNameText.getText();
		String movielang=movielangText.getText();//语言
		String movieloa=movieLoaText.getText();//国家
		String picaddress=picaddressText.getText();//图片地址
		String time=timeText.getText();//上映时间
		String score=scoreText.getText();//分数
		String detail=detailtextArea.getText();//详细
		String mType=(String)movietypeBox.getSelectedItem();//类型
		
		if(judge()) {	//空值判断
		try {
			System.out.println(mType);
			int mtime=Integer.parseInt(time) ;
			double mscore=Double.parseDouble(score);
			Movie movie=new Movie(movieName,movielang,movieloa,picaddress,detail,mtime,mType,mscore);
			if(movieservice.addMovie(movie)==1) {
				JOptionPane.showMessageDialog(null, "添加成功");
				reset();
			}else {
				JOptionPane.showMessageDialog(null, "添加失败");
			}
			
			
		} catch (NumberFormatException e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "格式错误");
		}
		}
	}
	public boolean judge() {
		if("".equals(movieNameText.getText())) {
			JOptionPane.showMessageDialog(null, "电影名字不能为空");
			return false;
		}
		if("".equals(movielangText.getText())) {
			JOptionPane.showMessageDialog(null, "电影名字不能为空");
			return false;
		}
		if("".equals(movieLoaText.getText())) {
			JOptionPane.showMessageDialog(null, "电影地址不能为空");
			return false;
		}
		if("".equals(picaddressText.getText())) {
			JOptionPane.showMessageDialog(null, "海报地址不能为空");
			return false;
		}
		if("".equals(timeText.getText())) {
			JOptionPane.showMessageDialog(null, "电影时长不能为空");
			return false;
		}
		if("".equals(scoreText.getText())) {
			JOptionPane.showMessageDialog(null, "评分不能为空");
			return false;
		}
		if("".equals(detailtextArea.getText())) {
			JOptionPane.showMessageDialog(null, "评分不能为空");
			return false;
		}
		return true;
	}
	public void reset() {
		movieNameText.setText("");
		movielangText.setText("");
		movieLoaText.setText("");
		picaddressText.setText("");
		timeText.setText("");
		scoreText.setText("");
		detailtextArea.setText("");
	}
}
