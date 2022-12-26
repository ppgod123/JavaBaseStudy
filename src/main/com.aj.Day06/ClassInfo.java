public class ClassInfo {
    private String classid;
    private String classname;
    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }


    public ClassInfo(String classid, String classname) {
        this.classid = classid;
        this.classname = classname;
    }
    public ClassInfo(){

    }


}
