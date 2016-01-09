package cg.common.misc;

import java.util.Observable;

import cg.common.check.Check;

public class SimpleObservable<T> extends Observable {

	private T value;
	
	public static Object getValue(Observable o)
	{
		Check.isTrue(o instanceof SimpleObservable);
		return ((SimpleObservable<?>) o).getValue();
	}
	
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
