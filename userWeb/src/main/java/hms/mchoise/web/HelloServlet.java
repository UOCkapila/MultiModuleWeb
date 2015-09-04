package hms.mchoise.web;

import hms.mchoice.user.Domain.User;
import hms.mchoice.user.Repository.UserRepository;
import hms.mchoice.user.Repository.UserRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by kapila on 9/4/15.
 */
public class HelloServlet extends HttpServlet {

    public void init() throws ServletException
    {
        // Do required initialization
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        int age = Integer.parseInt(request.getParameter("age"));

        User user = new User();
        user.setFirstName(firstName);
        user.setMiddleName(middleName);
        user.setAge(age);
        UserRepository userRepository = new UserRepositoryImpl();
        userRepository.addUser(user);

        response.setContentType("text/html");

        List<User> userList = userRepository.viewAll();
        for(User listUser:userList){
            PrintWriter users = response.getWriter();
            users.println("<p>" + listUser.getFirstName() +" "+ listUser.getMiddleName()+" "+listUser.getAge()+"</p>");
        }
    }

    public void destroy()
    {
        // do nothing.
    }
}