package gc.common.structures;

public class OrderedIntTuple extends IntTuple {

	public final boolean swap;

	public static OrderedIntTuple create(int lo, int hi) {
		return new OrderedIntTuple(lo, hi);
	}

	private OrderedIntTuple(int lo, int hi) {
		super(lo <= hi ? lo : hi, hi > lo ? hi : lo);
		this.swap = lo > hi;
	}

	public int lo(){
		return i1;
	}
	
	public int hi(){
		return i2;
	}
}
