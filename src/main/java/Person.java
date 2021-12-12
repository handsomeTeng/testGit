public class Person {
    private Cat cat;
    private String userName;
    private  Integer age1;
    private String numl;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static String  getCatName(Cat cat){
        return cat.getCatName();
    }
}
