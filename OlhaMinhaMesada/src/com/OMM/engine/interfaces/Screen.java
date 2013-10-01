package com.OMM.engine.interfaces;

public abstract class Screen {

	protected final OMMView ommview;

	public Screen(OMMView ommview) {
		this.ommview = ommview;
	}

	public abstract void update(float deltaTime);

	public abstract void paint(float deltaTime);

	public abstract void dispose();

	public abstract void backButton();

}
