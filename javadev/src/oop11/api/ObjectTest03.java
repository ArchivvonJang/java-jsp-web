package oop11.api;
//String
public class ObjectTest03 {
	
	public static void main(String[] args) {
		String str1 = new String("焼焼焼焼焼たたたたたたたたたた");
		String str2 = new String("焼焼焼焼焼たたたたたたたたたた");
		
		//五乞軒 拝雁戚 唖唖 戚欠嬢閃辞 辞稽 陥献 五乞軒 慎蝕聖 凧繕馬壱 赤奄 凶庚拭 砧 庚切伸精 陥牽陥. 
		
		if(str1 == str2) {
			System.out.println("庚切伸 旭陥.");
		}else {
			System.out.println("庚切伸 陥牽陥.");//v 
		}
		
		//瞬魚身妊 照税 庚切伸 鎧遂聖 搾嘘 
		if(str1.equals(str2)) {
			System.out.println("庚切伸 旭陥.");//v 
		}else {
			System.out.println("庚切伸 陥牽陥.");
		}
		
		System.out.println(str1.toString());
		System.out.println(str1.hashCode());
		
		System.out.println(str1 = str1.replace("焼","馬"));
		System.out.println(str1.hashCode());
		
		
		
	}
}
