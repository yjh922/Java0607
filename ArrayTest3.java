class  ArrayTest3{
	public static void main(String[] args) {
		char[][] arr=new char[2][3];

		arr[0][0]='A';
		arr[0][1]='B';
		arr[0][2]='C';
		arr[1][0]='��';
		arr[1][1]='��';
		arr[1][2]='��';

		for(int a=0; a<arr.length; a++){
			for(int i=0; i<arr[a].length;i++){
				System.out.print(arr[a][i]);
			}
			System.out.println("");
		}
	}
}
