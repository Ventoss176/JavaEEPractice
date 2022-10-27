/*
100以内的所有质数的输出。
质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。

最小的质数是：2
*/

class Neos{
	public static void main(String[] args){
		boolean isFlag = true;
		int firstMoney = 10000;
		String details = "";
		while(isFlag){
			System.out.println("-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出\n");
			System.out.print("                   4 请选择(1-4):" );
		//获取用户的选择
			char menuSelection = Utility.readMenuSelection();
			switch(menuSelection){
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println("收支    账户金额                收支金额        说    明");
					System.out.println(details);
					System.out.println("---------------------------------------------");
					break;

				case '2':
					System.out.println("本次收入金额：");
					int amount1 = Utility.readNumber();
					System.out.print("本次收入说明：");
					String desc1 = Utility.readString();

					firstMoney += amount1;
					details = "收入\t" + firstMoney + "\t\t\t" + amount1 + "\t\t" + desc1;
					System.out.println("---------------------登记完成---------------------");
					break;
				case '3':
					System.out.println("本次支出金额：");
					int amount2 = Utility.readNumber();
					System.out.print("本次支出说明：");
					String desc2 = Utility.readString();

					firstMoney -= amount2;
					details = "支出\t" + firstMoney + "\t\t\t" + amount2 + "\t\t" + desc2;
					System.out.println("---------------------登记完成---------------------");
					break;
				case '4':
					System.out.print("是否要退出Y/N？:");
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