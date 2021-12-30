package teamProject.member.model.vo;

public class Person {
    private String name; //이름
    private String empNum; //사원번호
    private String password; //비밀번호

    public Person() {
    }

    public Person(String name, String empNum, String password) {
        this.name = name;
        this.empNum = empNum;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("[사원번호 : $s] [이름 : %s] [비밀번호 : %s]",empNum,name,password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNum() {
        if (empNum)
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
