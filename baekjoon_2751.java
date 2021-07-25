import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int totalNums = Integer.parseInt(bf.readLine());
	        int []nums = new int[totalNums];    
	        
	        for(int i = 0; i < nums.length; i++){
	            nums[i] = Integer.parseInt(bf.readLine());
	        }
	        Arrays.sort(nums);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	        for(int i = 0; i < nums.length; i++){
	            bw.write(Integer.toString(nums[i]) + "\n");
	        }
        bf.close();
        bw.close();

	}

}
