package com.mac.stateful;

import javax.ejb.Stateful;

/**
 * Session Bean implementation class BeanCounter
 */
@Stateful(mappedName="BeanCounter")
public class BeanCounter implements BeanCounterRemote {

	private int counter=0;
    /**
     * Default constructor. 
     */
    public BeanCounter() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public int getCount() {
		return counter;
	}
	@Override
	public void addCount() {
		counter++;
	}

}
