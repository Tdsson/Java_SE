package src.view;

import com.Tdsson.util.CMUtility;

public class CustomerView {
    String listcustomer = "����\t�ձ�\t����\t�绰\t����\n";

    //����CustomerViewʵ���������� enterMainMenu()������ִ�г���
    public static void main(String[] args){

        CustomerView cusv = new CustomerView();
        cusv.enterMainMenu();
    }

    //��ʾ���˵�����Ӧ�û����룬�����û������ֱ����������Ӧ�ĳ�Ա��������addNewCustomer��������ɿͻ���Ϣ����
    public void enterMainMenu(){

        while (true) {
            System.out.println("-----------------�ͻ���Ϣ�������-----------------");
            System.out.println("\t\t\t\t 1 �� �� �� ��");
            System.out.println("\t\t\t\t 2 �� �� �� ��");
            System.out.println("\t\t\t\t 3 ɾ �� �� ��");
            System.out.println("\t\t\t\t 4 �� �� �� ��");
            System.out.println("\t\t\t\t 5 ��       ��");
            System.out.println("\t\t\t\t ��ѡ��(1-5)��_");

            //��ȡ�û���������
            char select = CMUtility.readMenuSelection();
            switch (select){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("ȷ���Ƿ��˳�Y/N:_");
                    char a = CMUtility.readConfirmSelection();
                    if(a=='Y'){
                        System.exit(0);
                    }
                    break;
            }
        }
    }

    //����û�
    private void addNewCustomer(){
        System.out.println("����:");
        String name = CMUtility.readString(5,"��");

        System.out.println("�Ա�:");
        char sex = CMUtility.readChar('��');

        System.out.println("����:");
        int age = CMUtility.readInt(0);

        System.out.println("�绰:");
        String tel = CMUtility.readString(11,"��");

        System.out.println("����:");
        String email = CMUtility.readString(20,"��");

//        ƴ�ӿͻ��б�
        listcustomer+="name\tsex\tage\ttel\teamlil\n";
    }
    //�޸��û�
    private void modifyCustomer(){

    }
    //ɾ���û�
    private void deleteCustomer(){

    }
    //�û��б�
    private void listAllCustomers(){

    }

}
