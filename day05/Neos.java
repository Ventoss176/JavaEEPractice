/*
100���ڵ����������������
������������ֻ�ܱ�1����������������Ȼ����-->��2��ʼ���������-1����Ϊֹ�������ܱ����������������

��С�������ǣ�2
*/

class Neos{
	public static void main(String[] args){
		boolean isFlag = true;
		int firstMoney = 10000;
		String details = "";
		while(isFlag){
			System.out.println("-----------------��ͥ��֧�������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��\n");
			System.out.print("                   4 ��ѡ��(1-4):" );
		//��ȡ�û���ѡ��
			char menuSelection = Utility.readMenuSelection();
			switch(menuSelection){
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println("��֧    �˻����                ��֧���        ˵    ��");
					System.out.println(details);
					System.out.println("---------------------------------------------");
					break;

				case '2':
					System.out.println("���������");
					int amount1 = Utility.readNumber();
					System.out.print("��������˵����");
					String desc1 = Utility.readString();

					firstMoney += amount1;
					details = "����\t" + firstMoney + "\t\t\t" + amount1 + "\t\t" + desc1;
					System.out.println("---------------------�Ǽ����---------------------");
					break;
				case '3':
					System.out.println("����֧����");
					int amount2 = Utility.readNumber();
					System.out.print("����֧��˵����");
					String desc2 = Utility.readString();

					firstMoney -= amount2;
					details = "֧��\t" + firstMoney + "\t\t\t" + amount2 + "\t\t" + desc2;
					System.out.println("---------------------�Ǽ����---------------------");
					break;
				case '4':
					System.out.print("�Ƿ�Ҫ�˳�Y/N��:");
					char yn = Utility.readConfirmSelection();
                    if (yn == 'Y') isFlag = false;
					break;
				}
		while(isFlag == false){
			break;
		}
		}
	}
}