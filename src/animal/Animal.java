package animal;

public class Animal {
    private String individualName; // 名前
    private int age; // 年齢

    // コンストラクタ（引数あり）
    public Animal(String individualName, int age) {
        // 名前と年齢のデータセット
        this.individualName = individualName;
        this.age = age;
    }

    public void say() {
        System.out.println(individualName + "です。 " + age + "歳です。");
    }

    // フィールドのgetter/setter
    // 本課題では使用しないためコメントアウト
//    public String getIndividualName() {
//        return individualName;
//    }
//
//    public void setIndividualName(String individualName) {
//        this.individualName = individualName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

}
