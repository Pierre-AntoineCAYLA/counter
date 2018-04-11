package compteur;

public class Counter {
	
	private static int globalCounter=-1;
	private int state;
	
	public Counter()  {
		this.state=0;
		if(globalCounter==-1)
		{globalCounter=0;
		}
	}

	public int getValue() {
	
		return this.state;
	}

	public void inc() {
		this.state++;
		globalCounter++;
		
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
	
	public boolean equals3(Counter counter, Counter counter2) {
		boolean eq=false ;
		if (counter.getValue()==this.getValue() && counter.getValue()==this.getValue() )
			eq=true;
		return (eq);
	}
	

	public static int getglobalCounter() {
		
		return globalCounter;
	}


}
