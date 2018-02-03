import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("OUTPUT.TXT");
		FileReader fr = new FileReader("INPUT.TXT");
		Scanner scan = new Scanner(fr); 
		int k = scan.nextInt();
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		scan.nextLine();
		long sNeg=0;
		long sPos=0;
		for (int i = 0; i < k; i++) {
			int temp = scan.nextInt();
			if (temp<0) {
				sNeg-=temp;
				neg.add(i);
			} else {
				sPos+=temp;
				pos.add(i);
				}
			}
		if (sPos>=sNeg) {
			fw.write(Integer.toString(pos.size())+'\n');
			for (Integer h : pos) {
				fw.write(Integer.toString(h+1)+' ');
			}
		}else {
			fw.write(Integer.toString(neg.size())+'\n');
			for (Integer h : neg) {
				fw.write(Integer.toString(h+1)+' ');
				}
			}
		scan.close();
		fr.close();
		fw.close();
	}
	
		
	}

