import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		averageFilter avgFilter = new averageFilter(args[0], args[1]);
		avgFilter.loadImage();
		avgFilter.mirrorFrame();
		avgFilter.average3X3();
		avgFilter.printAverageArray();
	}

}
