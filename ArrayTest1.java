class  ArrayTest1{
	public static void main(String[] args){
		/*js�� �迭 ����� �� ũ�⸦ ������� �ʾƵ� ������
		��� ��κ��� ���α׷��� ������ �迭 ����ÿ� �ݵ�� 
		�� ũ�⸦ ����ϴ°� ��Ģ�̴�
		���� -���� byte,short,int,long
			  �Ǽ� float,double
		���� -���� char
		       ���ڿ� String
		���� boolean
		*/
		int[] arr=new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=12;

		//for���� �̿��Ͽ� ��� ��Ҹ� ����Ͻÿ�.
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}	
}
