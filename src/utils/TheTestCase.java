package utils;

import javafx.beans.property.SimpleStringProperty;

public class TheTestCase {
	public SimpleStringProperty input;
	public SimpleStringProperty output;
	public SimpleStringProperty realoutput ;

	public TheTestCase(String input, String output, String realoutput) {
		super();
		this.input = new SimpleStringProperty(input);
		this.output = new SimpleStringProperty(output);
		this.realoutput = new SimpleStringProperty(realoutput);
	}

	public String getInput() {
		return input.get();
	}

	public void setInput(String input) {
		this.input.set(input);
	}

	public String getOutput() {
		return output.get();
	}

	public void setOutput(String output) {
		this.output.set(output);
	}

	public String getRealoutput() {
		return realoutput.get();
	}

	public void setRealoutput(String realoutput) {
		this.realoutput.set(realoutput);
	}
}
