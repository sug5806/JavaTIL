package string;

public class StringBufferTest {
    public static void main(String[] args) {
        System.out.println("StringBufferTest");

        String java = new String("java");
        String android = new String("android");

        StringBuffer buffer = new StringBuffer(java);
        System.out.println("버퍼 처음 해시코드: " + System.identityHashCode(buffer));
        buffer.append(android);
        System.out.println("버퍼에 android 추가한 뒤 해시코드 : " + System.identityHashCode(buffer));
        System.out.println("buffer = " + buffer.toString());
    }
}
