import util.Utility;

public class FamilyAccount {
	public static void main(String []args){
		int balance = 10000;
		String details = "说明\t余额\t金额\t用途\n";
		do{
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println("\t\t1 收支明细");
			System.out.println("\t\t2 登记收入");
			System.out.println("\t\t3 登记支出");
			System.out.println("\t\t4 退    出");
			System.out.print("\t\t请选择(1-4):_");
		
			char select = Utility.readMenuSelection();
		
			switch(select){
			case '1':
				System.out.println("-----------------收支明细-----------------");
				System.out.println(details);
				break;
			case '2':
				System.out.print("本次收入金额:");
				int add = Utility.readNumber();
				System.out.print("本次收入说明:");
				String addps = Utility.readString();  
				
				balance+=add;
				details+="收入"+"\t"+balance+"\t"+add+"\t"+addps+"\n";
				break;
			case '3':
				System.out.print("本次支出金额:");
				int off = Utility.readNumber();
				System.out.print("本次支出说明:");
				String offps = Utility.readString();  
				
				balance+=off;
				details+="支出"+"\t"+balance+"\t"+off+"\t"+offps+"\n";
				break;
			case '4':
				System.out.print("是否确认退出:Y/N:");
				char a = Utility.readConfirmSelection();
				if(a=='Y'){
					return;
				}
				break;
				}
		  }
		while(true);
	}
}
