class Student2 {
    //����һ���޲ι�����
    Student2(){
        System.out.println("�����е�������ʱ�ľ�̬����ֵ��"+name);
//        name = "����һ���޲εĹ�����";
        System.out.println("����������ʱ�ľ�̬����ֵ��"+name);
    }

    //����һ���Ǿ�̬�����
    {
        name2 = "�Ǿ�̬nameֵ";
        System.out.println("�Ǿ�̬��������ʱ�ľ�̬����ֵ��"+name);
    }
    //����һ���Ǿ�̬����
    String name2;

    // ��̬�����
    static{
        System.out.println("���е���̬�����"+name);
        //name = 1;
    }

    // ��̬����
    static String name;
}

class TestStudent{
    public static void main(String[] args){
//        Student stu = new Student();
        Student2 stu2 = new Student2();
        System.out.println(stu2.name2);
        System.out.println(Student2.name);
    }
}
