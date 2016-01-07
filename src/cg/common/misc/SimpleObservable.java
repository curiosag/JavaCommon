package cg.common.misc;

import java.util.Observable;

public class SimpleObservable<T> extends Observable {

	private T value;
	
	public SimpleObservable(T value){
		this.value = value;
	}
	
	public void setValue(T value)
	{
		this.value = value;
		notifyOnChange();
	}
	
	public T getValue()
	{
		return value;
	}
	
	public void notifyOnChange()
	{
		setChanged();
		notifyObservers();
		clearChanged();
	}
	
}
