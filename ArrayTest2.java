class ArrayTest2{
	public static void main(String[] args){
		//Java�� ������ ��κ��� �迭�� �������� �پ��ų�, �þ�� �ʴ´�.
		String[][] arr=new String[3][2];
		arr[0][0]="���";
		arr[0][1]="����";
		arr[1][0]="����";
		arr[1][1]="�ƿ��";
		arr[2][0]="Java";
		arr[2][1]="Oracle";
				
		for(int a=0; a<arr.length;a++){
			for(int i=0; i<arr[a].length;i++){
				System.out.print(arr[a][i]);
			}
			System.out.println("");//�ٹٲ� ������ ���õ�
		}
	}
}