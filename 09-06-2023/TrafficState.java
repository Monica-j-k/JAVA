package state;

interface TLS{
	void signals(TrafficSignal trafficsignal);
}


class TrafficSignal{
	
	private TLS state;
	
	public TrafficSignal() {
		state = new RedSignal();
	}
	
	public void setState(TLS state) {
		this.state = state;
	}
	
	public void signals(){
		state.signals(this);
	}
}


class RedSignal implements TLS{
	
	public void signals(TrafficSignal trafficsignal) {
		System.out.println(" 'STOP'  Red Signal is on.");
		trafficsignal.setState(new YellowSignal());
	}
}

class YellowSignal implements TLS{
	
	public void signals(TrafficSignal trafficsignal) {
		System.out.println(" 'START' Yellow Signal is on.");
		trafficsignal.setState(new GreenSignal());
	}
}

class GreenSignal implements TLS{
	
	public void signals(TrafficSignal trafficsignal) {
		System.out.println(" 'GO' Green Signal is on.");
		trafficsignal.setState(new RedSignal());
	}
}


public class TrafficState {

	public static void main(String[] args) {

		TrafficSignal trafficsignal = new TrafficSignal();
		
		trafficsignal.signals();
		trafficsignal.signals();
		trafficsignal.signals();
		trafficsignal.signals();
		trafficsignal.signals();
		trafficsignal.signals();
		
	}

}
