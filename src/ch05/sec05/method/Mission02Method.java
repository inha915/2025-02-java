package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg"); // "jpg"리턴
        String ext2 = getExt("sadf.sdkf111.jpeg"); // "jpg"리턴
        System.out.println(ext2);

    }
    public static String getExt(String get) {
        int idx = get.lastIndexOf(".");

        String ext = get.substring(idx + 1);
        return ext;
    }
}
