package guiCalculator;

import java.awt.*;
import java.awt.event.*;

public class CalcEventHandler implements ActionListener {
	TextField T1;
	Label error;
	String sign;
	float A=0f, B=0f, C=0f;
	public CalcEventHandler(TextField Screen, Label ERR) {
		T1=Screen;
		error=ERR;
	}
	public void actionPerformed(ActionEvent AE) {
		Button Btn;
		Btn=(Button)AE.getSource();
		String BtnLabel = Btn.getLabel();

		try {
			if(BtnLabel.contentEquals("+")) {
				T1.setText("");
				B=A;
				A=0f;
				sign="+";
			}
			else if(BtnLabel.contentEquals("-")) {
				T1.setText("");
				B=A;
				A=0f;
				sign="-";
			}
			else if(BtnLabel.contentEquals("x")) {
				T1.setText("");
				B=A;
				A=0f;
				sign="x";
			}
			else if(BtnLabel.contentEquals("/")) {
				T1.setText("");
				B=A;
				A=0f;
				sign="/";
			}
			else if(BtnLabel.contentEquals("C")) {
				T1.setText("");
				A=0f;
			}
			else if(BtnLabel.contentEquals("=")) {
				if(sign.equals("+")) {
					C=B+A;
				}
				if(sign.equals("-")) {
					C=B-A;
				}
				if(sign.equals("x")) {
					C=B*A;
				}
				if(sign.equals("/")) {
					C=B/A;
				}
				T1.setText(Float.toString(C));
			}
			else {
				
				T1.setText(T1.getText()+BtnLabel);
				A=Float.parseFloat(T1.getText());
			}
		}
		catch(ArithmeticException ERR) {
			T1.setText("Error");
		}
	}
}
