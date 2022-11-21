package six;

public class MobilePhoneMain {


    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("010-555-5555", "Nougat");
        phone.answer();
        phone.playApp();

        MobilePhone phone1 = new SmartPhone("000-005-1234","Nougat");
        phone1.answer();
//        phone1.playApp(); //오류 부모타입에서 자식타입 함수 호출 불가능 ₩
    }
}
