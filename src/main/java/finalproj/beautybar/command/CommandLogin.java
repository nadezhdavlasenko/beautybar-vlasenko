package finalproj.beautybar.command;

import finalproj.beautybar.manager.Config;
import finalproj.beautybar.manager.Message;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import finalproj.beautybar.service.LoginService;
import org.mindrot.jbcrypt.BCrypt;

public class CommandLogin implements ICommand{

    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static int workload = 31;


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse responce) throws Exception {
        String page = null;
        HttpSession session = request.getSession(true);
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        LoginService loginService = LoginService.getLoginService();
        if (loginService.authentificate(login,password)) {
            //request.setAttribute("user", login);
            session.setAttribute("user", login);
            page = Config.getInstance().getProperty(Config.MAIN);

        } else {
            request.setAttribute("error", Message.getInstance().getProperty(Message.LOGIN_ERROR));
            page = Config.getInstance().getProperty(Config.ERROR);
        }

        return page;
    }
}