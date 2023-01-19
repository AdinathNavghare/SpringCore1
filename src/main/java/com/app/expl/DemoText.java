package com.app.expl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoText {
	@Value("#{ 12+40 }")
	private int x;
	@Value("#{ 11+45 }")
	private int y;
	@Value(" #{ T(java.lang.Math).sqrt(144)")
	private double d;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public DemoText() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DemoText [x=" + x + ", y=" + y + ", d=" + d + "]";
	}

}
