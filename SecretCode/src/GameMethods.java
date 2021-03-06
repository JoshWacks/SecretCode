import java.awt.Color;
import java.util.ArrayList;


import javax.swing.JPanel;

public class GameMethods {
	private Color selectedColor;
	private static Color[] codeArr={null,null,null,null};
	static String p1Username;
	static String p2Username;
	
	public GameMethods() {
		selectedColor=null;
		p1Username="";
		p2Username="";
	}
	
	
	
	public static String getP1Username() {
		return p1Username;
	}

	public static void setP1Username(String p1Username) {
		GameMethods.p1Username = p1Username;
	}

	public static String getP2Username() {
		return p2Username;
	}

	public static void setP2Username(String p2Username) {
		GameMethods.p2Username = p2Username;
	}

	public Color[] getCodeArr(){
		return codeArr;
	}
	
	public void setCodeArr(Color[] arr) {
		codeArr=arr;
	}
	
	public Color getSelectedColor() {
		Color c=new Color(selectedColor.getRed(),selectedColor.getGreen(),selectedColor.getBlue(),selectedColor.getAlpha());
		return c;
		
	}
	public Color checkColor() {
		if(selectedColor.equals(Color.BLACK)) {
			return Color.BLACK;
			
		}
		else if(selectedColor.equals(Color.BLUE)){
			return Color.BLUE;
		}
		else if(selectedColor.equals(Color.YELLOW)){
			return Color.YELLOW;
		}
		else if(selectedColor.equals(Color.GREEN)){
			return Color.GREEN;
		}
		else if(selectedColor.equals(Color.MAGENTA)){
			return Color.MAGENTA;
		}
		else if(selectedColor.equals(Color.WHITE)){
			return Color.WHITE;
		}
		else if(selectedColor.equals(Color.RED)){
			return Color.RED;
		}
		else return Color.GRAY;
		
	}

	public void setSelectedColor(Color selectedColor) {
		this.selectedColor = selectedColor;
	}
	
	public boolean checkCorrectRow(JPanel jp,int n) {
		
		String name=jp.getName();
		int d=2;
		if(name.charAt(3)=='J') {
			d=1;
		}
		int l=name.length();
		char c=name.charAt(l-d);
		int r=Character.getNumericValue(c);
		
		if(r==(n-1)) {//because we start counting at 0 but the player is told 1
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	

}

//class GameMethods2 implements Cloneable
//{
//	private Color selectedColor;
//	private static Color[] codeArr={null,null,null,null};
//	private static String p1Username;
//	private static String p2Username;
//	
//	public GameMethods2() {
//		selectedColor=null;
//		p1Username="";
//		p2Username="";
//	}
//	
//	
//	
//	public static String getP1Username() {
//		return p1Username;
//	}
//
//	public static void setP1Username(String p1Username) {
//		GameMethods.p1Username = p1Username;
//	}
//
//	public static String getP2Username() {
//		return p2Username;
//	}
//
//	public static void setP2Username(String p2Username) {
//		GameMethods.p2Username = p2Username;
//	}
//
//	public Color[] getCodeArr(){
//		return codeArr;
//	}
//	
//	public void setCodeArr(Color[] arr) {
//		codeArr=arr;
//	}
//	
//	public Color getSelectedColor() {
//		return selectedColor;
//	}
//
//	public void setSelectedColor(Color selectedColor) {
//		this.selectedColor = selectedColor;
//	}
//	
//	public boolean checkCorrectRow(JPanel jp,int n) {
//		
//		String name=jp.getName();
//		int d=2;
//		if(name.charAt(3)=='J') {
//			d=1;
//		}
//		int l=name.length();
//		char c=name.charAt(l-d);
//		int r=Character.getNumericValue(c);
//		
//		if(r==(n-1)) {//because we start counting at 0 but the player is told 1
//			return true;
//		}
//		else {
//			return false;
//		}
//		
//	}
//
//	GameMethods gm=new GameMethods();
//	
//	public Object clone() throws CloneNotSupportedException{
//		GameMethods2 t=(GameMethods2)super.clone();
//		
//		t.gm=new GameMethods();
//		return t;
//		
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//









