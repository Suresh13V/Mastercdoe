package Sathish;

public class Removal {

	public static void main(String[] args) {
		String txt="satheesh shankar";
		String data=" ";
		char rem ='a';
		char res[]=txt.toCharArray();
		for(int i=0;i<res.length;i++) { 
			if(res[i]!=rem) {
			data=data+res[i];
			}
		}
		System.out.println(data); 
			}
	}



