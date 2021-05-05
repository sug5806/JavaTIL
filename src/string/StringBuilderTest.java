package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        System.out.println("StringBuilderTest");

        String java = new String("java");
        String android = new String("android");

        StringBuilder builder = new StringBuilder(java);
        System.out.println("빌더 처음 해시코드: " + System.identityHashCode(builder));
        builder.append(android);
        System.out.println("빌더에 android 추가한 뒤 해시코드 : " + System.identityHashCode(builder));
        System.out.println("builder = " + builder.toString());
    }
}
