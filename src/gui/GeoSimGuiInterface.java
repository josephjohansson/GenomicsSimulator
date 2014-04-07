package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;

public interface GeoSimGuiInterface {
	
	public void addComponent(Component thing, int column, int row, int width, int height,
			double weightx, double weighty, int top, int left, int bottom, int right);
	
	public void actionPerformed(ActionEvent e);
	
	public void updateLabels(String[] fatherTraits, String[] motherTraits);
}
