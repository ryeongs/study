import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main{
public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int totalNums = Integer.parseInt(bf.readLine());
		String[] input = bf.readLine().split(" ");
		int[] nums = new int[totalNums];

		for (int i = 0; i < totalNums; i++)
			nums[i] = Integer.parseInt(input[i]);

		int[] sortNums = nums.clone();
		Arrays.sort(sortNums);

		Map<Integer, Integer> map = new HashMap<>();
		int temp = 0;
		for (int n : sortNums)
			if (!map.containsKey(n))
				map.put(n, temp++);

		for (int n : nums)
	            sb.append(map.get(n)).append(' ');

        System.out.println(sb.toString());

	}
}
