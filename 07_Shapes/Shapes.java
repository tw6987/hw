public class Shapes {
    public String box( int a, int b) {
	int height = a;
	int width = b;
	String s = "";
	while (height > 0) {
	    while (width > 0) {
		s = s + "*";
		width = width - 1;
	    }
	    s = s + "\n";
	    width = b;
	    height = height - 1;
	}
        return s;
    }

    public String tri1(int a) {
	int rowcounter = 0;
	String output = "";
	while (rowcounter + 1 < a) {
	    
	}
    }

}