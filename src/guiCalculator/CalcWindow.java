package guiCalculator;

import java.awt.*;

public class CalcWindow {
	public static void main(String x[]) {
		Frame F = new Frame("3D-Calculator");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		Label error = new Label();
		GridLayout GL = new GridLayout(4,4);
		P2.setLayout(GL);
		
		TextField Screen;
		Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;
		Button Add, Sub, Mult, Div, Clear, Equal;
		
		Screen = new TextField(20);
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		Add = new Button("+");
		Sub = new Button("-");
		Mult = new Button("x");
		Div = new Button("/");
		Clear = new Button("C");
		Equal = new Button("=");
		
		CalcEventHandler event = new CalcEventHandler(Screen, error);
		
		B0.addActionListener(event);
		B1.addActionListener(event);
		B2.addActionListener(event);
		B3.addActionListener(event);
		B4.addActionListener(event);
		B5.addActionListener(event);
		B6.addActionListener(event);
		B7.addActionListener(event);
		B8.addActionListener(event);
		B9.addActionListener(event);
		Add.addActionListener(event);
		Sub.addActionListener(event);
		Mult.addActionListener(event);
		Div.addActionListener(event);
		Clear.addActionListener(event);
		Equal.addActionListener(event);
		
		P1.add(Screen);
		P2.add(B0);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(Add);
		P2.add(Sub);
		P2.add(Mult);
		P2.add(Div);
		P2.add(Clear);
		P2.add(Equal);
		
		F.add(P1, BorderLayout.NORTH);
		F.add(P2, BorderLayout.CENTER);
		
		
		F.setSize(400,400);
		F.setVisible(true);
	}
}
