/**
 * 登录工具类，提供用户身份校验功能
 */
public class LoginUtil {

    /**
     * 用户登录身份校验
     * @param name 用户名
     * @param pwd 密码
     * @return 校验结果：true-登录成功，false-登录失败
     */
    public boolean authenticateUser(String name, String pwd){
        if("admin".equals(name) && "123456".equals(pwd)){
            return true;
        }
        return false;
    }
}