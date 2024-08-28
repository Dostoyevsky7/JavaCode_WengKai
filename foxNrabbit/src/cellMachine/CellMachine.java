package cellMachine;

import javax.swing.JFrame;
import cell.Cell;
import field.*;

public class CellMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//初始设置：每个格子都有细胞，随机活细胞
		Field field = new Field(30, 30);
		for(int i=0; i<field.getHeight(); i++) {
			for(int j=0; j<field.getWidth(); j++) {
				field.setCell(i, j, new Cell());
			}
		}
		for(int i=0; i<field.getHeight(); i++) {
			for(int j=0; j<field.getWidth(); j++) {
				if(Math.random()<0.5) {
					field.get(i, j).reborn();
				}
			}
		}
		
		//设置view
		View view =new View(field);
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack();
		frame.setVisible(true);
		
		System.out.println("test1");
		
		//循环
		for(int i=0; i<3; i++) {
			for(int k=0; k<field.getHeight(); i++) {
				for(int j=0; j<field.getWidth(); j++) {
					Cell[] list1 = field.getNeighbour(k, j);
					int alivenum = 0;
					for(Cell cells : list1) {
						if(cells.isalive() == true) {
							alivenum++;
						}
					}
					System.out.println("test2");
					if(field.get(k, j).isalive()) {
						if(alivenum>3 || alivenum<2) {
							field.get(k, j).die();
						}
					}
					else {
						if(alivenum == 3) {
							field.get(k, j).reborn();
						}
					}
				}
			System.out.println("update");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}

}
