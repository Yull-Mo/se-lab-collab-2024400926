public class LoginUtil {
    // 登录方法
    public boolean login(String name, String pwd){
        if("admin".equals(name) && "123456".equals(pwd)){
            return true;
        }
        return false;
    }
}