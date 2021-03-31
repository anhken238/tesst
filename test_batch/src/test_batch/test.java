package test_batch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " ducanh ";
		String code = "123";
		String sex = " nam ";
		ProcessBuilder processBuilder = new ProcessBuilder("/home/ender/eclipse-workspace/test_batch/resources/test_batch.sh",name,code,sex);
		try {
			Runtime.getRuntime().exec("chmod 777 /home/ender/eclipse-workspace/test_batch/resources/test_batch.sh");
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s = null;
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
