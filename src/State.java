import java.util.HashMap;

public class State {
	public StateType stateType;
	public HashMap<Character, State> transitions;
	
	public State() {
		this.transitions = new HashMap<Character, State>();
		this.stateType = StateType.NormalState;
	}
	public State(boolean isFinal) {
		this.transitions = new HashMap<Character, State>();
	    if(isFinal) {
	    	this.stateType = StateType.FinalState;
	    }else this.stateType = StateType.InitialState;
	}
	public State nextState(Character transitionAlphabet) {
		return transitions.get(transitionAlphabet);
	}

}
