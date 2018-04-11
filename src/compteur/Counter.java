package compteur;

public class Counter {

	private int state;
	
	public Counter()  {
		this.state=0;
	}

	public int getValue() {
	
		return this.state;
	}

	public void inc() {
		this.state++;
		
	}

	public String toString() {
		return "valeur : " +this.state+" incrément" + this.state;

		
	}
	
	public boolean equals(Counter counter) {
		boolean eq=false ;
		if (counter.getValue()==this.getValue())
			eq=true;
		return (eq);
	}

}
