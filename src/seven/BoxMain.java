package seven;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        PaperBox box2   =   new PaperBox();
        GoldPaperBox    box3    =   new GoldPaperBox();
        wrapBox(box);
        wrapBox(box2);
        wrapBox(box3);
    }

    //   객체 instanceof 클래스명 => 객체주소에 찾아가 클래스가 존재하는지 확인하는 키워드
    public static void wrapBox(Box box) {
        if (box instanceof GoldPaperBox) {  //box 객체가 GoldPaperBox클래스에 있는지 확인(box메모리 주소에 클래스가 있는지 확인)
            ((GoldPaperBox) box).goldWrap();
        } else if (box instanceof PaperBox) {
            ((PaperBox) box).paperWrap();
        }
        else box.simpleWrap();
    }
}
