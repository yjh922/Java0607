class  ArrayTest4{
	public static void main(String[] args){
		String[] arr={
			"���", "����", "�ٳ���"
		};
		
		String[][] data={
			{"���","����","����"},
			{"����","�ƿ��","BMW"}
		};

		for(int a=0;a<data.length;a++){
			for(int i=0; i<data[a].length;i++){
				System.out.print(data[a][i]);
			}
 			System.out.println("");

		}
	}
}
