import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameMethods {
	private Color selectedColor;
	private static Color[] codeArr={null,null,null,null};
	
	public Color[] getCodeArr(){
		return codeArr;
	}
	
	public void setCodeArr(Color[] arr) {
		codeArr=arr;
	}
	
	public Color getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(Color selectedColor) {
		this.selectedColor = selectedColor;
	}
	
	public boolean checkCorrectRow(JPanel jp,int n) {
		String name=jp.getName();
		int l=name.length();
		char c=name.charAt(l-2);
		int r=Character.getNumericValue(c);
		
		if(r==(n-1)) {//because we start counting at 0 but the player is told 1
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}
